/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import java.sql.*;
import java.util.ArrayList;

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
}
