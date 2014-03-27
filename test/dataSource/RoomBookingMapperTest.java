/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Mock.RoomBookingMapperMock;
import domain.Guest;
import java.sql.Connection;
import domain.RoomBooking;
import domain.RoomType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anders
 */
public class RoomBookingMapperTest
{
    RoomBookingMapperMock rmm;
    ArrayList<RoomBooking> RoomList;
    ArrayList<Guest>GuestList;
    
    
    Guest guest = new Guest("Anders", "And", 0001);
    Guest guest2 = new Guest("Fætter", "Højben", 0002);
    Date tempdate = Calendar.getInstance().getTime();
    RoomType[] roomtypes;
    
    public RoomBookingMapperTest()
    {
    }
    
    @Before
    public void setUp()
    {
        rmm = new RoomBookingMapperMock();
        RoomList = new ArrayList();
    }
    
    @After
    public void tearDown()
    {
        System.out.println("Clearing");
        System.out.println("");
        RoomList.clear();
    }
    
     @Test
    public void InsertRoomBooking() throws SQLException
     {
         RoomBooking r = new RoomBooking(guest,tempdate,2,0,roomtypes[0],"EuroTravel");
         RoomList.add(r);
         boolean expResult = true;
         boolean result = rmm.insertRoomBooking(RoomList, GuestList, null);
         assertEquals(expResult, result);
     }
    
    @Test
    public void InsertRoomBookingAlreadyExist() throws SQLException
    {
         RoomBooking r = new RoomBooking(guest,tempdate,2,0,roomtypes[0],"EuroTravel");
         RoomList.add(r);
         rmm.insertRoomBooking(RoomList, GuestList, null);
         boolean expResult = false;
         boolean result = rmm.insertRoomBooking(RoomList, GuestList, null);
         assertEquals(expResult, result);
    }
    
    @Test
    public void InsertGuestMultipleRoomBookings() throws SQLException
    {
     RoomBooking r = new RoomBooking(guest,tempdate,2,0,roomtypes[0],"EuroTravel");
     RoomBooking r2 = new RoomBooking(guest2,tempdate,3,0,roomtypes[1],"USATravel");
     r.setId(1);
     r2.setId(2);
     
     RoomList.add(r);
     RoomList.add(r2);
     boolean expResult = true;
     boolean result = rmm.insertRoomBooking(RoomList, GuestList, null);
     assertEquals(expResult, result);
    }
}
