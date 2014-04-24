/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import domain.Room;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author psm
 */
public class DBFacade {
    
    private final ArrayList<Long> sequence;  
    private UnitOfWork uow;
    private final Connection con;
    //=====	Singleton
    private static DBFacade instance;

    private DBFacade() {
        con = new DBConnector().getConnection(); 
        sequence = new ArrayList<>();// the connection will be released upon program 
    }

    public static DBFacade getInstance()
    {
        if (instance == null)
        {
            instance = new DBFacade();
        }
        return instance;
    }
    
    
    public void startNewBusinessTransaction()
    {
        uow = new UnitOfWork();
    }
    public boolean commitBusinessTransaction()
    {
        boolean status = false;
        if (uow != null)
        {
            try
            {
                status = uow.commit(con);
            }
            catch(Exception e)
            {
              System.out.println("Fail in DBFacade - commitBusinessTransaction");
              System.err.println(e);
            }
            uow = null;
        }
        return status;
    }
    
    public boolean deleteRoomBookingTransaction(String firstname, String lastname, int phonenumber, Date startDate, int noOfNights)throws SQLException
    {
        System.out.println("DBFacade");
        uow = new UnitOfWork();
        boolean status = uow.cancelRoomBooking(firstname, lastname, phonenumber, startDate, noOfNights, con);
        return status;
    }
    
    public void registerNewItem(Object obj) {
        if (uow != null) {
            uow.registerNewItem(obj);
        }
    }
//////    public void registerDirtyItem(Object obj) {
//////        if (uow != null) {
//////            uow.registerDirtyItem(obj);
//////        }
//////    }
     /**
     * Returns a database unique ID as a Long type.
     * 
     * getID() will fetch a Long from a local storage, if the local storage is
     * empty, it will fill it with multiple Longs from the database and return 
     * one of those 
     */
    public long getID()
      {
        long id;
        if (!sequence.isEmpty())
        {
             id = sequence.get(0);
             sequence.remove(0);
             return id;
        }
        else
        {
            fillSequence();
            return getID();
        }
      }
    private long getNextinSequence() throws SQLException
      {
        long nextseq = 0;
        try
        {
         String sqlIdentifier = "select SEQ_NUMBER.NEXTVAL from dual";
         PreparedStatement pst = con.prepareStatement(sqlIdentifier);
         ResultSet rs = pst.executeQuery();
         if (rs.next()) nextseq = rs.getLong(1);
         return nextseq;
 
        }
        catch (SQLException e)
          {
             throw e;
          }
      }
    
    private void fillSequence()
      {
        try
        {
         for (int i = 0; i < 10; i++)
           {
               sequence.add(getNextinSequence());
           }
        }
        catch(SQLException e)
        {
            //add stuff
        }
    }
    /**
    * @Author Phill
    * Takes a startdate, a number of nights and a room type
    * returns an available room of given type in given period.
    * can return a null
    **/
    public Room getAvailableRoom(java.util.Date startDate, int noOfNights, String type) {
        java.util.Date endDate;
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.add(Calendar.DATE, noOfNights);
        endDate = c.getTime();
        
        RoomMapper rmap = new RoomMapper();
        switch(type)
        {
            case"singleroom":
            {return rmap.getNextAvailableSingle(startDate, endDate, con);}
            case"doubleroom":
            {return rmap.getNextAvailableDouble(startDate, endDate, con);}
            case"familyroom":
            {return rmap.getNextAvailableFamily(startDate, endDate, con);}
            default:
            {return null;}
            
}
        
    }
   public Guest findGuest(long id)
   {
       GuestMapper gm = new GuestMapper(con);
       return gm.find(id, con);
   }
   
   public int getGuestRoomCost(int phone)throws SQLException{
       GuestMapper gm = new GuestMapper(con);
       return gm.GuestRoomCost(phone, con);
   }
   
      public int[] searchForFreeRoomsAtDiffDates(java.util.Date enddate, java.util.Date startdate) throws SQLException{
       RoomBookingMapper rbm = new RoomBookingMapper();
       return rbm.searchForFreeRoomsAtDiffDates(enddate, startdate, con);
   }
}
