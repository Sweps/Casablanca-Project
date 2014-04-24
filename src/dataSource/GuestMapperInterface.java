/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Guest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Anders
 */
public interface GuestMapperInterface
{
    Guest find(long id, Connection con);
    
    boolean InsertGuest(ArrayList<Guest> GuestList) throws SQLException;
    
    boolean updateGuest(ArrayList<Guest> GuestList, Connection con) throws SQLException;
    
    int GuestRoomCost(int phonenumber, Connection con)throws SQLException;
}
