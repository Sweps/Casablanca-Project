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
    boolean InsertGuest(ArrayList<Guest> GuestList, Connection conn) throws SQLException;
}
