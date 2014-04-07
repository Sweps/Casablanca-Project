/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;
import domain.*;
import java.sql.*;


/**
 *
 * @author Charlie
 */
public class RoomMapper {
    
    public Room find(long id, Connection con)
    {
        Room rm = null;
        String SQLString = "SELECT ROOM.ROOMNO, ROOMTYPE.PRICE, ROOM.ROOMTYPE"
                + "FROM ROOMTYPE, ROOM"
                + "WHERE ROOMNO = ? AND ROOM.ROOMTYPE = ROOMTPYE.ROOMTPYE";
        PreparedStatement statement;
        
        try{
            statement = con.prepareStatement(SQLString);
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                
                Room room = new Room(rs.getString(1), rs.getInt(2), rs.getInt(3));
 
            }
            
            }
        catch(Exception e)
        {
            return null;
        }
        return rm;
    }
}
