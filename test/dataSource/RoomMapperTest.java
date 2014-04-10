/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import domain.Room;
import domain.RoomBooking;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Charles-HP
 */
public class RoomMapperTest {
    Connection con;
    RoomMapper rmap;
    RoomBookingMapper rbmap;
    GuestMapper gmap;
    ArrayList<RoomBooking> rblist;
    ArrayList<Guest> glist;
    public RoomMapperTest() {
    }
    
    @Before
    public void setUp()
      {
        con = DBConnector.getConnection();
        try{con.setAutoCommit(false);} catch (Exception e) {}
        rmap = new RoomMapper();
        rbmap = new RoomBookingMapper();
        gmap = new GuestMapper(con);
        rblist = new ArrayList<>();
        glist = new ArrayList<>();
      }
    
    @After
    public void tearDown()
      {
        try{con.rollback();} catch (Exception e) {}
        con = null;
        rmap = null;
        rbmap = null;
        gmap = null;
        rblist = null;
        glist = null;
      }

    //Charles
    //testFind tester at et objeckt bliver lavet korrert.
    //I denne test bruger vi rum 30, som vi ved i databasen koster 60$ og er et singleroom
    //Vi kalder metoden med id 30 og en connnection, og ser om det nu er rigtigt prisen er 60$ og rummet er et singleroom
    @Test
    public void testFind() {
        //Setup
        Connection con = DBConnector.getConnection();
        RoomMapper rm = new RoomMapper();
        //Kalder metoden      
        Room test1 = rm.find(30, con);
        //Her tjekker vi om test1(objecket) er en instance af klassen Room
        assertTrue(test1 instanceof Room);
        
        int price = test1.getPrice();
        //Vi ser om prisen rent faktisk er 60$ og ikke prisen af f.eks et doubleroom
        assertTrue(price == 60);
        assertFalse(price == 80);
        assertFalse(price == 100);
        //Vi tjekker om rummet er et singleroom
        assertTrue(test1.getRoomType().equals("singleroom"));
        assertFalse(test1.getRoomType().equals("doubleroom"));
        assertFalse(test1.getRoomType().equals("familyroom"));
        
        assertTrue(test1.getRoomNo() == 30);
        assertFalse(test1.getRoomNo() == 31);
        
        
    }

    @Test
    public void testGetNextAvailableFamily() throws Exception {
         
        //Because of the way the sql statement works you should be getting the
        //first 'number' of given room type, so 1 before 2 etc.
        //so first we check that, searching for a doubleroom in a test timeframe
        //we will get room 71, we will then book room 71 for that period and we
        //should be returned room 72 if we try to get a new available room
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = formatter.parse("1-1-7357");
                     Calendar c = Calendar.getInstance();
                     c.setTime(date1);
                     c.add(Calendar.DATE, 4);
        Date date2 = c.getTime();
        
        //get an available room for the testdates, this should return 1 
        Room returnedroom = rmap.getNextAvailableFamily(date1, date2, con);
        
        assertTrue(returnedroom.getRoomNo() == 71);
        
        //Book room 1 during the testdate
            //Make Guest:
            Guest guest = new Guest("Brian", "TestFind", 123);
            guest.setId(99);
            //save guest to db
            glist.add(guest);
            gmap.InsertGuest(glist);
            //make roombooking #TODO FIX ROOMTYPE,ROOM AND TRAVELAGENCYHAQS
            RoomBooking booking = new RoomBooking(guest, date1, 4, returnedroom, "0");
            booking.setId(100);
            //save roombooking
            rblist.add(booking);
            rbmap.insertRoomBooking(rblist, con);
            
        //get an available room in the same period:
        Room returnedroom2 = rmap.getNextAvailableFamily(date1, date2, con);
        
        assertTrue(returnedroom2.getRoomNo() == 72);
    }

    @Test
    public void testGetNextAvailableDouble() throws SQLException, ParseException {
          
        //Because of the way the sql statement works you should be getting the
        //first 'number' of given room type, so 1 before 2 etc.
        //so first we check that, searching for a doubleroom in a test timeframe
        //we will get room 36, we will then book room 36 for that period and we
        //should be returned room 37 if we try to get a new available room
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = formatter.parse("1-1-7357");
                     Calendar c = Calendar.getInstance();
                     c.setTime(date1);
                     c.add(Calendar.DATE, 4);
        Date date2 = c.getTime();
        
        //get an available room for the testdates, this should return 1 
        Room returnedroom = rmap.getNextAvailableDouble(date1, date2, con);
        
        assertTrue(returnedroom.getRoomNo() == 36);
        
        //Book room 1 during the testdate
            //Make Guest:
            Guest guest = new Guest("Brian", "TestFind", 123);
            guest.setId(99);
            //save guest to db
            glist.add(guest);
            gmap.InsertGuest(glist);
            //make roombooking #TODO FIX ROOMTYPE,ROOM AND TRAVELAGENCYHAQS
            RoomBooking booking = new RoomBooking(guest, date1, 4, returnedroom, "0");
            booking.setId(100);
            //save roombooking
            rblist.add(booking);
            rbmap.insertRoomBooking(rblist, con);
            
        //get an available room in the same period:
        Room returnedroom2 = rmap.getNextAvailableDouble(date1, date2, con);
        
        assertTrue(returnedroom2.getRoomNo() == 37);
    }

    @Test
    public void testGetNextAvailableSingle() throws ParseException, SQLException {
        
        //Because of the way the sql statement works you should be getting the
        //first 'number' of given room type, so 1 before 2 etc.
        //so first we check that, searching for a singleroom in a test timeframe
        //we will get room 1, we will then book room 1 for that period and we
        //should be returned room 2 if we try to get a new available room
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = formatter.parse("1-1-7357");
                     Calendar c = Calendar.getInstance();
                     c.setTime(date1);
                     c.add(Calendar.DATE, 4);
        Date date2 = c.getTime();
        
        //get an available room for the testdates, this should return 1 
        Room returnedroom = rmap.getNextAvailableSingle(date1, date2, con);
        
        assertTrue(returnedroom.getRoomNo() == 1);
        
        //Book room 1 during the testdate
            //Make Guest:
            Guest guest = new Guest("Brian", "TestFind", 123);
            guest.setId(99);
            //save guest to db
            glist.add(guest);
            gmap.InsertGuest(glist);
            //make roombooking #TODO FIX ROOMTYPE,ROOM AND TRAVELAGENCYHAQS
            RoomBooking booking = new RoomBooking(guest, date1, 4, returnedroom, "0");
            booking.setId(100);
            //save roombooking
            rblist.add(booking);
            rbmap.insertRoomBooking(rblist, con);
            
        //get an available room in the same period:
        Room returnedroom2 = rmap.getNextAvailableSingle(date1, date2, con);
        
        assertTrue(returnedroom2.getRoomNo() == 2);

    }
    
}
