/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;
import java.sql.*;
import java.util.ArrayList;
import domain.*;
import java.util.Date;

/**
 *
 * @author Charlie
 */
public class RoomBookingMapper {
     
            private java.sql.Date convertdate(Date date)
    {
       return new java.sql.Date(date.getTime());
    }
    
    static boolean testRun = false;
    
    public RoomBooking find(long id, Connection con)
      {
        RoomBooking rb = null;
        String findstring = "SELECT roombookingid, roomno, guestno,"
                          + "startdate, enddate, nooofnights, travelagency,"
                          + "version FROM RoomBooking WHERE roombookingid = ?";
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(findstring);
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            GuestMapper gmap = new GuestMapper(con);
            Guest guest = gmap.find(rs.getLong(3), con);
            RoomMapper rmap = new RoomMapper();
            Room room = rmap.find(rs.getLong(2), con);
            // room set to 0 fix lator 
            // roomtype set manually, fix lator. wordskilove.
            // travelagency skal laves til et object senere lullerskates
            rb = new RoomBooking(guest, rs.getDate(4), rs.getInt(6),room,
                                 rs.getString(7));
            
                   
        }
        
        }
        catch(Exception e)
          {
            return null;
          }
        return rb;
      }
    
    //Charles
    public boolean insertRoomBooking(ArrayList<RoomBooking> RoomBookingList, Connection conn) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString = "INSERT INTO ROOMBOOKING VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < RoomBookingList.size(); i++)
        {
            RoomBooking rb = RoomBookingList.get(i);        
            statement.setLong(1, rb.getId());            
            statement.setLong(2, rb.getRoom().getRoomNo());           
            statement.setLong(3, rb.getGuest().getId());
            statement.setDate(4, convertdate(rb.getStartdate()));                       
            statement.setDate(5, convertdate(rb.getEnddate()));                       
            statement.setInt(6, rb.getNoofnights());                          
            statement.setInt(7, 0);  
            statement.setInt(8, rb.getVersion());       
            rowsInserted += statement.executeUpdate();
        }
        if (testRun)
        {
            System.out.println("insertOrders(): " + (rowsInserted == RoomBookingList.size()));
        }
        return (rowsInserted == RoomBookingList.size());
            
}
    public boolean cancelRoomBooking(String firstName, String lastName, int phonenumber,
            Date startDate, int noOfNights, Connection conn) throws SQLException
    {
        boolean status = false;
        String SQLString = "delete from roombooking " +
        "where GUESTNO in(" +
        "select guestid from GUEST " +
        "where GUEST.FIRSTNAME = ? " +
        "and GUEST.LASTNAME = ? " +
        "and GUEST.PHONE = ?" +
        ") " +
        "and startdate = ? " +
        "and NOOOFNIGHTS = ?";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        statement.setString(1, firstName);            
        statement.setString(2, lastName);           
        statement.setInt(3, phonenumber);
        statement.setDate(4, convertdate(startDate));                       
        statement.setInt(5, noOfNights);   
        
        int succes = statement.executeUpdate();
        if(succes > 0){
            status = true;
        }
        return status;
    }
    
    //virker ikke!
    public ArrayList<RoomBooking> searchPhonenumber(int phonenumber, Connection conn) throws SQLException{
        
        ArrayList<RoomBooking> searchPhonenumber = new ArrayList<RoomBooking>();
        
        Guest guest = null;
        Room room = null;
        RoomBooking rb = null;
        
        
        String findstring = "SELECT GUEST.FIRSTNAME, GUEST.LASTNAME, GUEST.PHONE, ROOMBOOKING.STARTDATE, ROOMBOOKING.NOOOFNIGHTS, ROOMBOOKING.ROOMNO "
                + "FROM GUEST, ROOMBOOKING "
                + "WHERE GUEST.GUESTID=ROOMBOOKING.GUESTNO AND GUEST.PHONE=?";
        
        PreparedStatement statement;
        
        try{
        statement = conn.prepareStatement(findstring);
        statement.setInt(1, phonenumber);
        ResultSet rs = statement.executeQuery();
        RoomMapper rm = new RoomMapper();
        while(rs.next()){
            room = rm.find(rs.getLong(6), conn);
            guest = new Guest(rs.getString(1),
                                rs.getString(2),
                                rs.getInt(3));

             
              rb = new RoomBooking(guest, rs.getDate(4), rs.getInt(5), room, "0");
              
              searchPhonenumber.add(rb);
        }
        
        }
        
        catch(Exception e){
            return null;
        }
        return searchPhonenumber;
        
}
    
    
//    public boolean updateRoombooking(ArrayList<RoomBooking> RoomBookingList, Connection conn)
//    {
//        int rowsUpdated = 0;
//        String SQLString ="UPDATE ROOMBOOKING "
//                + "SET ROOMTYPE = ?, STARTDATE = ?, ENDDATE = ?, NOOOFNIGHTS = ?, TRAVELAGENCY = ? VERSION = ? "
//                + "WHERE ROOMBOOKINGID = ? and VERSION = ?";
//        
//        PreparedStatement statement = null;
//        
//        statement = con.prepareStatement(SQLString);
//        for (int i = 0; i < RoomBookingList.size(); i++)
//        {         
//            RoomBooking rb = RoomBookingList.get(i);        
//                     
//            statement.setString(1, rb.getType().getName());           
//            statement.setDate(2, convertdate(rb.getStartdate()));                       
//            statement.setDate(3, convertdate(rb.getEnddate()));                       
//            statement.setInt(4, rb.getNoofnights());                          
//            statement.setInt(5, 0);  
//            statement.setInt(6, rb.getVersion() + 1);  // next version number
//            statement.setLong(7, rb.getId());  
//            statement.setInt(8, rb.getVersion()); 
//            int tupleUpdated = statement.executeUpdate();
//            if (tupleUpdated == 1)
//            {
//                rb.setVersion(+ 1);
//            }
//            rowsUpdated += tupleUpdated;
//        }
//        return rowsUpdated == RoomBookingList.size(); // false if any conflict in version number 
//    }
            
}
    
    
    
    

