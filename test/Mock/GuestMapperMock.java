/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import dataSource.GuestMapperInterface;
import domain.Guest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anders
 */
public class GuestMapperMock implements GuestMapperInterface
{
    Map<Integer , Guest> GuestList = new HashMap();

    @Override
    public boolean InsertGuest(ArrayList<Guest> GuestList, Connection conn) throws SQLException
    {
        
        return ;
    }
    
}
