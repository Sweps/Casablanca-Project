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
 * @author Charles
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
    public Room getNextAvailableFamily(java.util.Date startDate, java.util.Date endDate, Connection con) {
        Room returnroom = null;
        String SQLString = "SELECT r.roomno FROM room r " + "LEFT JOIN roombooking rb "
                                                   + "ON r.roomno = rb.roomno "
       + "WHERE r.roomno NOT IN (SELECT roomno FROM roombooking "
                               + "WHERE enddate > ? "
                               + "AND startdate < ?) " 
       +"AND r.roomtype = 'familyroom' "
       +"AND ROWNUM = 1 "
       +"ORDER BY r.roomno";
        PreparedStatement statement;
        
        try{
            statement = con.prepareStatement(SQLString);
            statement.setDate(1, convertDate(startDate));
            statement.setDate(2, convertDate(endDate));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                
      
                returnroom = find(rs.getLong(1), con);
                
 
            }
            
            }
        catch(Exception e)
        {

            return null;
        }
        return returnroom;
    }
    /**
    * @Author Phill
    * Takes a startdate and an enddate 
    * returns an available Double room in given period.
    * can return a null
    **/
    public Room getNextAvailableDouble(java.util.Date startDate, java.util.Date endDate, Connection con) {
        Room returnroom = null;
        String SQLString = "SELECT r.roomno FROM room r " + "LEFT JOIN roombooking rb "
                                                   + "ON r.roomno = rb.roomno "
       + "WHERE r.roomno NOT IN (SELECT roomno FROM roombooking "
                               + "WHERE enddate > ? "
                               + "AND startdate < ?) " 
       +"AND r.roomtype = 'doubleroom' "
       +"AND ROWNUM = 1 "
       +"ORDER BY r.roomno";
        PreparedStatement statement;
        
        try{
            statement = con.prepareStatement(SQLString);
            statement.setDate(1, convertDate(startDate));
            statement.setDate(2, convertDate(endDate));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                
                returnroom = find(rs.getLong(1), con);
                
 
            }
            
            }
        catch(Exception e)
        {
            return null;
        }
        return returnroom;
       }
    /**
    * @Author Phill
    * Takes a startdate and an enddate 
    * returns an available Single room in given period.
    * can return a null
    **/
    public Room getNextAvailableSingle(java.util.Date startDate, java.util.Date endDate, Connection con) {
        
        Room returnroom = null;
        String SQLString = "SELECT r.roomno FROM room r " + "LEFT JOIN roombooking rb "
                                                   + "ON r.roomno = rb.roomno "
       + "WHERE r.roomno NOT IN (SELECT roomno FROM roombooking "
                               + "WHERE enddate > ? "
                               + "AND startdate < ?) " 
       +"AND r.roomtype = 'singleroom' "
       +"AND ROWNUM = 1 "
       +"ORDER BY r.roomno";
        PreparedStatement statement;
        
        try{
            statement = con.prepareStatement(SQLString);
            statement.setDate(1, convertDate(startDate));
            statement.setDate(2, convertDate(endDate));
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                returnroom = find(rs.getLong(1), con);
                
 
            }
            
            }
        catch(Exception e)
        {
            return null;
        }
        return returnroom;
    }
    
    private java.sql.Date convertDate(java.util.Date date)
    {
       return new java.sql.Date(date.getTime());
    }
}
