/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;
import java.sql.*;
import java.util.ArrayList;
import domain.*;

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
            RoomBooking rb = RoomBookingList.get(i);        //ændres
            statement.setInt(1, rb.getGuest().getId());     //ændres
            statement.setDate(2, rb.getStartdate());        //ændres
            statement.setDate(3, rb.getEnddate();           //ændres
            statement.setInt(4, rb.getNoofnights());        //ændres
            statement.setInt(5, rb.getVersion());           //ændres
            statement.setInt(6, rb.getRoom());              //ændres    
            statement.setString(7, rb.getType();            //ændres
            rowsInserted += statement.executeUpdate();
        }
        if (testRun)
        {
            System.out.println("insertOrders(): " + (rowsInserted == RoomBookingList.size()));
        }
        return (rowsInserted == RoomBookingList.size());
    
}
    
    
    
    

