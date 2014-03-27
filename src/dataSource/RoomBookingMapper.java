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
        String SQLString = "INSERT INTO ROOMBOOKING VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < RoomBookingList.size(); i++)
        {
            RoomBooking rb = RoomBookingList.get(i);        
            statement.setLong(1, rb.getId());            
            statement.setString(2, rb.getType().getName());           
            statement.setLong(3, rb.getGuest().getId());
            statement.setDate(4, (Date) rb.getStartdate());                       
            statement.setDate(5, (Date) rb.getEnddate());                       
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
    
            
}
    
    
    
    

