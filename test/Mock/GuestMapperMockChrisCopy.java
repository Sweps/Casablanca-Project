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
public class GuestMapperMockChrisCopy implements GuestMapperInterface
{
    Map<Long, Guest> GuestMap = new HashMap();

    @Override
    public boolean InsertGuest(ArrayList<Guest> GuestList) throws SQLException
    {
        if(GuestMap.containsKey(GuestList.get(0).getId())){
            return false;
        }
        GuestMap.put(GuestList.get(0).getId(),GuestList.get(0));
        return true;
    }
    
}
