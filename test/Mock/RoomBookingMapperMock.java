/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import domain.Guest;
import domain.RoomBooking;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anders
 */
public class RoomBookingMapperMock
{
    Map<Long, RoomBooking> RoomMap = new HashMap();
    Map<Long, Guest> GuestMAP = new HashMap();
    GuestMapperMock gm = new GuestMapperMock();
    
    public boolean insertRoomBooking(ArrayList<RoomBooking> RoomBookingList,ArrayList<Guest> GuestList, Connection conn) throws SQLException
    {
        Guest g = new Guest("Cave","Johnson",34343434);
        GuestList.add(g);
        gm.InsertGuest(GuestList);
        for(int i = 0; i<RoomBookingList.size();i++){
           System.out.println(GuestList.get(i).getFirstname()); 
           System.out.println(GuestList.get(i).getId());
           System.out.println(RoomBookingList.get(i).getRoom());
           System.out.println(RoomBookingList.get(i).getId());
    }
        for(int i = 0; i<RoomBookingList.size();i++){
            if(RoomMap.containsKey(RoomBookingList.get(i).getId())){
                return false;
            }
            RoomMap.put(RoomBookingList.get(i).getId(),RoomBookingList.get(i));
        }
        return true;
}
}