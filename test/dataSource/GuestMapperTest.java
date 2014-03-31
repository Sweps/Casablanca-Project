/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Mock.GuestMapperMock;
import domain.Guest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class GuestMapperTest
{
    GuestMapperMock gm;
    ArrayList<Guest> GuestList;
    
    public GuestMapperTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
      {
      }

    @AfterClass
    public static void tearDownClass() throws Exception
      {
      }
    
    @Before
    public void setUp()
    {
        gm = new GuestMapperMock();
        GuestList = new ArrayList();
    }
    
    @After
    public void tearDown()
    {
        System.out.println("Clearing");
        System.out.println("");
        GuestList.clear();
    }
    
    @Test
    public void InsertGuest() throws SQLException{
        
        Guest g = new Guest("Cave","Johnson",34343434);
        g.setId(1);
        GuestList.add(g);
        boolean expResult = true;
        boolean result = gm.InsertGuest(GuestList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void InsertGuestAlreadyExist() throws SQLException{
        
        Guest g = new Guest("Cave","Johnson",34343434);
        g.setId(1);
        GuestList.add(g);
        gm.InsertGuest(GuestList);
        boolean expResult = false;
        boolean result = gm.InsertGuest(GuestList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void InsertGuestMultipleGuests() throws SQLException{
        Guest g = new Guest("Cave","Johnson",34343434);
        Guest g2 = new Guest("Caroline","Glados",34343435);
        g.setId(1);
        g2.setId(2);
        
        GuestList.add(g);
        GuestList.add(g2);
        boolean expResult = true;
        boolean result = gm.InsertGuest(GuestList);
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class GuestMapper.
     */
    @Test

    /**
     * Test of InsertGuest method, of class GuestMapper.
     */
    @Test
    public void testInsertGuest() throws Exception
      {
        System.out.println("InsertGuest");
        ArrayList<Guest> GuestList = null;
        GuestMapper instance = null;
        boolean expResult = false;
        boolean result = instance.InsertGuest(GuestList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
      }
}