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
 * @author Charlie
 */
public class RoomBookingMapper {
    
    static boolean testRun = false;
    
    public boolean insertRoomBooking(ArrayList<RoomBooking> RoomBookingList, Connection conn) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString = "INSERT INTO ROOMBOOKING VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < RoomBookingList.size(); i++)
        {
            RoomBooking rb = RoomBookingList.get(i);                       //ændres
            statement.setString(1, rb.getRoomType());    //ændres
            statement.setInt(2, rb.getGuestNo());        //ændres
            statement.setString(3, rb.getStartDate());   //ændres
            statement.setString(4, rb.getEnddate());     //ændres
            statement.setInt(5, rb.getPartySize());      //ændres
            statement.setInt(6, rb.getTravelAgency());   //ændres             
            rowsInserted += statement.executeUpdate();
        }
        if (testRun)
        {
            System.out.println("insertOrders(): " + (rowsInserted == RoomBookingList.size()));
        }
        return (rowsInserted == RoomBookingList.size());
    
}
    
    
    
    

