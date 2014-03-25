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
    
    public boolean insertRoomBooking(ArrayList<RoomBooking> list, Connection conn) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString = "INSERT INTO ROOMBOOKING VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < list.size(); i++) //list skal ændres?
        {
            list i = list.get(i);                       //ændres
            statement.setString(1, i.getRoomType());    //ændres
            statement.setInt(2, i.getGuestNo());        //ændres
            statement.setString(3, i.getStartDate());   //ændres
            statement.setString(4, i.getEnddate());     //ændres
            statement.setInt(5, i.getPartySize());      //ændres
            statement.setInt(6, i.getTravelAgency());   //ændres             
            rowsInserted += statement.executeUpdate();
        }
        if (testRun)
        {
            System.out.println("insertOrders(): " + (rowsInserted == list.size()));
        }
        return (rowsInserted == list.size());
    
}
    
    
    
    

