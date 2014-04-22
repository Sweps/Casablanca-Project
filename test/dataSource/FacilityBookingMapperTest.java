/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Facility;
import domain.FacilityBooking;
import domain.Guest;
import domain.RoomBooking;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phill
 */
public class FacilityBookingMapperTest {
   
    Connection con;
    FacilityBookingMapper fbmap;
    FacilityMapper fmap;
    
    public FacilityBookingMapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()
      {
        con = DBConnector.getConnection();
        try{con.setAutoCommit(false);} catch (Exception e) {}
        fbmap = new FacilityBookingMapper();
        fmap = new FacilityMapper();
      }
    
    @After
    public void tearDown()
      {
        try{con.rollback();} catch (Exception e) {}
        con = null;
        fbmap = null;
        fmap = null;
      }


    /**
     * Test of insertFacilityBooking method, of class FacilityBookingMapper.
     */
    @Test
    public void testInsertFacilityBooking() throws Exception {
        Facility f = new Facility(1, "tennis court");
        Guest guest = (new GuestMapper(con)).find(0, con);
        Calendar c = Calendar.getInstance();
        c.set(1989, 0, 6, 14, 00);
        Date date = c.getTime();
        System.out.println(date.toString());
        FacilityBooking fb = new FacilityBooking(1, f, guest, date);
        fbmap.insertFacilityBooking(fb, con);
        FacilityBooking returnedfb = fbmap.find(1, con);
        
        assertTrue(returnedfb.facilityBookingId == 1);
        assertTrue(returnedfb.guest.getId() == 0);
        System.out.println(returnedfb.dateAndTime.toString());
        
    }

    /**
     * Test of find method, of class FacilityBookingMapper.
     */
    @Test
    public void testFind() {
        FacilityBooking foundbooking = fbmap.find(0, con);
        assertTrue(foundbooking.facility.facilityId == 1);
    }
}