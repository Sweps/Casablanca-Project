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
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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

    /**
     * Test of find method, of class RoomBookingMapper.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        long id = 0L;
        Connection con = null;
        RoomBookingMapper instance = new RoomBookingMapper();
        RoomBooking expResult = null;
        RoomBooking result = instance.find(id, con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRoomBooking method, of class RoomBookingMapper.
     */
    @Test
    public void testInsertRoomBooking() throws Exception {
        System.out.println("insertRoomBooking");
        ArrayList<RoomBooking> RoomBookingList = null;
        Connection conn = null;
        RoomBookingMapper instance = new RoomBookingMapper();
        boolean expResult = false;
        boolean result = instance.insertRoomBooking(RoomBookingList, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelRoomBooking method, of class RoomBookingMapper.
     */
    @Test
    public void testCancelRoomBooking() throws Exception {
        System.out.println("cancelRoomBooking");
        String firstName = "";
        String lastName = "";
        int phonenumber = 0;
        Date startDate = null;
        int noOfNights = 0;
        Connection conn = null;
        RoomBookingMapper instance = new RoomBookingMapper();
        boolean expResult = false;
        boolean result = instance.cancelRoomBooking(firstName, lastName, phonenumber, startDate, noOfNights, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPhonenumber method, of class RoomBookingMapper.
     */
    @Test
    public void testSearchPhonenumber() throws Exception {
        System.out.println("searchPhonenumber");
        int phonenumber = 0;
        Connection conn = null;
        RoomBookingMapper instance = new RoomBookingMapper();
        RoomBooking expResult = null;
        RoomBooking result = instance.searchPhonenumber(phonenumber, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
