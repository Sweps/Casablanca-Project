/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import domain.RoomBooking;
import domain.RoomType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Phill
 */
public class RoomBookingMapper2Test
  {
    Connection con;
    RoomBookingMapper rbmap;
    GuestMapper gmap;
    ArrayList<RoomBooking> rblist;
    ArrayList<Guest> glist;
    
    public RoomBookingMapper2Test()
      {
      }
    
    @BeforeClass
    public static void setUpClass()
      {
      }
    
    @AfterClass
    public static void tearDownClass()
      {
      }
    
    @Before
    public void setUp()
      {
        con = DBConnector.getConnection();
        try{con.setAutoCommit(false);} catch (Exception e) {}
        rbmap = new RoomBookingMapper();
        gmap = new GuestMapper(con);
        rblist = new ArrayList<>();
        glist = new ArrayList<>();
      }
    
    @After
    public void tearDown()
      {
        con = null;
        rbmap = null;
        gmap = null;
        rblist = null;
        glist = null;
        try{con.rollback();} catch (Exception e) {}
      }

    /**
     * Test of find method, of class RoomBookingMapper.
     */
    @Test
    public void testFind() throws Exception
      {
   
        //Make Guest:
        Guest guest = new Guest("Brian", "TestFind", 123);
        guest.setId(99);
        //save guest to db
        glist.add(guest);
        gmap.InsertGuest(glist);
        //make roombooking #TODO FIX ROOMTYPE,ROOM AND TRAVELAGENCYHAQS
        RoomBooking booking = new RoomBooking(guest,new Date(),4,0,(new RoomType("singleroom",0,0)),"0");
        booking.setId(100);
        //save roombooking
        rblist.add(booking);
        rbmap.insertRoomBooking(rblist, con);
        //find the roombooking
        RoomBooking returnedbooking = rbmap.find(100, con);
        //Assert that it's been correctly retrieved
        assertNotNull(returnedbooking);
        assertTrue(booking.getNoofnights() == returnedbooking.getNoofnights());
        assertTrue(returnedbooking.getGuest().getId() == guest.getId());
        
        
          //SETUP
//        Connection con = DBConnector.getConnection();
//        GuestMapper gmap = new GuestMapper(con);
//        //TEMPGUESTFULD
//        Guest testguest = new Guest("testFind", "testFind", 31337);
//        testguest.setId(312);
//        testguest.setAddress("123");
//        testguest.setCountry("123");
//        testguest.setEmail("123");
//        testguest.setVersion(1);
//        testguest.setPhonenumber(123);
//        ArrayList al = new ArrayList<>();
//        al.add(testguest);
//        gmap.InsertGuest(al);
//        RoomBooking testbooking = new RoomBooking(testguest,new Date(),4,0,(new RoomType("singleroom",0,0)),"0");
//        testbooking.setId(123321);
//        ArrayList al1 = new ArrayList<>();
//        RoomBookingMapper rbm = new RoomBookingMapper();
//        Boolean wut = rbm.insertRoomBooking(al1, con);
//          System.out.println("STATUS =" + wut);
//        RoomBooking testbooking2 = rbm.find(3584, con);
//        
//          System.out.println(testbooking2.getId());
//        //cleanup
//        String delstatement = "DELETE FROM GUEST WHERE guestid = 1337 OR guestid = 31337";
//          PreparedStatement statement = con.prepareCall(delstatement);
//          statement.execute();
      }

    /**
     * Test of insertRoomBooking method, of class RoomBookingMapper.
     */
    @Test
    public void testInsertRoomBooking() throws Exception
      {
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
    public void testCancelRoomBooking() throws Exception
      {
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
    
    
    //Slettes måske senere. Overvejes
//    @Test
//    public void testUpdateRoomBooking() throws SQLException
//    {
//        
//        //TEMPGUESTFULD
//        Guest guest = new Guest("Søren", "Hansen", 55555555);
//        guest.setId(69);
//        //save guest to db
//        glist.add(guest);
//        gmap.InsertGuest(glist);
//        //make roombooking #TODO FIX ROOMTYPE,ROOM AND TRAVELAGENCYHAQS
//        RoomBooking booking = new RoomBooking(guest,new Date(),6,0,(new RoomType("singleroom",0,0)),"0");
//        booking.setId(70);
//        //save roombooking
//        rblist.add(booking);
//        rbmap.insertRoomBooking(rblist, con);
//        //change booking
//        
//        //update booking
//        rbmap.updateRoombooking(rblist, con);
//        
//        
//        
//        //find the roombooking
//        RoomBooking returnedbooking = rbmap.find(70, con);
//        
//        assertTrue();
//    }
    
  }
