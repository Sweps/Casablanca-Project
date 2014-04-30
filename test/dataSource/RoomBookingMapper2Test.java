/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import domain.Room;
import domain.RoomBooking;
import domain.RoomType;
//import domain.TravelAgency;
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
    RoomMapper rmap;
//    ArrayList<TravelAgency> talist;
//    TravelAgencyMapper tam;
    
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
        rmap = new RoomMapper();
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
//        TravelAgency travelagency = new TravelAgency("eurotravel", 1234, "email");
//        travelagency.setCompanyId(98);
//        talist.add(travelagency);
//        tam.insertTravelAngecy(talist, con);
          
          
        //Make Guest:
        Guest guest = new Guest("Brian", "TestFind", 123);
        guest.setId(99);
        //save guest to db
        glist.add(guest);
        gmap.InsertGuest(glist);
        // make make room
        Room temproom = rmap.find(1, con);
        //make roombooking #TODO FIX ROOMTYPE,ROOM
        RoomBooking booking = new RoomBooking(guest,new Date(),4,temproom);
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
        //Make Guest
        Guest guest = new Guest("Hans", "Ole", 4545);
        guest.setId(5);
        //save guest to db
        glist.add(guest);
        gmap.InsertGuest(glist);
        //make room
        Room temproom = rmap.find(1, con);
        //make roombooking
        RoomBooking booking = new RoomBooking(guest,new Date(),4,temproom);
        booking.setId(10);
        //save roombooking to db
        rblist.add(booking);
        rbmap.insertRoomBooking(rblist, con);
        //test
        RoomBooking returnedbooking = rbmap.find(10, con);
          assertTrue(returnedbooking.getGuest().getFirstname().equals("Hans"));
          assertTrue(returnedbooking.getGuest().getLastname().equals("Ole"));
          assertTrue(returnedbooking.getGuest().getPhonenumber() == 4545);
          assertTrue(returnedbooking.getRoom().getRoomNo() == 1);
          assertFalse(returnedbooking.getGuest().getFirstname().equals("Ulla"));
          assertFalse(returnedbooking.getGuest().getPhonenumber() == 4646);
          assertFalse(returnedbooking.getRoom().getRoomNo() == 2);
        
        
        
        
      }

    /**
     * Test of cancelRoomBooking method, of class RoomBookingMapper.
     */
    @Test
    public void testCancelRoomBooking() throws Exception
      {
        //Make Guest
        Guest guest = new Guest("Allan", "Nilsen", 3094);
        guest.setId(20);
        //save guest to db
        glist.add(guest);
        gmap.InsertGuest(glist);
        //make room
        Room temproom = rmap.find(4, con);
        //make roombooking
        RoomBooking booking = new RoomBooking(guest,new Date(),4,temproom);
        booking.setId(30);
        //save roombooking to db
        rblist.add(booking);
        rbmap.insertRoomBooking(rblist, con);
        
        RoomBooking returnedbooking = rbmap.find(30, con);
          assertTrue(returnedbooking.getGuest().getFirstname().equals("Allan"));
        //delete roombooking from database
        rbmap.cancelRoomBooking(returnedbooking.getGuest().getFirstname(), returnedbooking.getGuest().getLastname(), returnedbooking.getGuest().getPhonenumber(), returnedbooking.getStartdate(), returnedbooking.getNoofnights(), con);
        
        assertTrue(returnedbooking.getGuest().getFirstname().equals("Allan"));
        
      }
    
     @Test
     public void testSearchPhonenumber() throws Exception
     {
        
        ArrayList<RoomBooking> rbl =  rbmap.searchPhonenumber(29904588, con);
         System.out.println(rbl.size() + " Roombookings were fetched:");
       for (int i = 0; i < rbl.size(); i++)
       {
           RoomBooking rb = rbl.get(i);
         System.out.println(rb.getGuest().getFirstname());
         System.out.println(rb.getGuest().getLastname());
         System.out.println(rb.getGuest().getPhonenumber());
         System.out.println(rb.getStartdate());
         System.out.println(rb.getVersion());
       }
         
     }
    //Charles
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
