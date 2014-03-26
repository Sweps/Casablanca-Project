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
        for(int i = 0; i<GuestList.size();i++){
           System.out.println(GuestList.get(i).getFirstname());
           System.out.println(GuestList.get(i).getId());
        }
        
        for(int i = 0; i<GuestList.size();i++){
            if(GuestMap.containsKey(GuestList.get(i).getId())){
                return false;
            }
            GuestMap.put(GuestList.get(i).getId(),GuestList.get(i));
        }
        return true;
    }
}
