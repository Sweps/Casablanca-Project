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
    //Charles
    //SQLString giver os en tabel med RoomType, RoomNo og Price tilbage
    //Fra de 2 tabeller Room, RoomType og sørger for at det rette RoomType til det givene rum passer
    public Room find(long id, Connection con)
    {
        Room room = null;
        String SQLString = "SELECT ROOM.ROOMTYPE, ROOM.ROOMNO, ROOMTYPE.PRICE "
                + "FROM ROOMTYPE, ROOM "
                + "WHERE ROOMNO = ? AND ROOM.ROOMTYPE = ROOMTYPE.ROOMTYPE";
        PreparedStatement statement;
        
        try{
            statement = con.prepareStatement(SQLString);
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                
                room = new Room(rs.getString(1), rs.getInt(2), rs.getInt(3));
 
            }
            
            }
        catch(Exception e)
        {
            return null;
        }
        return room;
    }
/**
    * @Author Phill
    * Takes a startdate and an enddate 
    * returns an available Family room in given period.
    * can return a null
    **/
    public Room getRandomAvailableFamily(java.util.Date startDate, java.util.Date endDate) {
        return new Room("familyroom", 103, 100);
    }
    /**
    * @Author Phill
    * Takes a startdate and an enddate 
    * returns an available Double room in given period.
    * can return a null
    **/
    public Room getRandomAvailableDouble(java.util.Date startDate, java.util.Date endDate) {
        return new Room("doubleroom", 102, 80);
       }
    /**
    * @Author Phill
    * Takes a startdate and an enddate 
    * returns an available Single room in given period.
    * can return a null
    **/
    public Room getRandomAvailableSingle(java.util.Date startDate, java.util.Date endDate) {
        return new Room("singleroom", 101, 60);
    }
    
}
