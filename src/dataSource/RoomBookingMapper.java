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
            statement.setString(2, rb.getType().getName());           
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
        String SQLString = "delete from roombooking" +
        "where GUESTNO in(" +
        "select guestid from GUEST" +
        "where GUEST.FIRSTNAME = ? " +
        "and GUEST.LASTNAME = ?" +
        "and GUEST.PHONE = ?" +
        ")" +
        "and startdate = ?" +
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
    
            
}
    
    
    
    

