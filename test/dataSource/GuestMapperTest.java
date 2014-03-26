/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Mock.GuestMapperMockChrisCopy;
import domain.Guest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anders
 */
public class GuestMapperTest
{
    GuestMapperMockChrisCopy gm;
    ArrayList<Guest> GuestList;
    
    public GuestMapperTest()
    {
    }
    
    @Before
    public void setUp()
    {
        gm = new GuestMapperMockChrisCopy();
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
        GuestList.add(g);
        boolean expResult = true;
        boolean result = gm.InsertGuest(GuestList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void InsertGuestAlreadyExist() throws SQLException{
        
        Guest g = new Guest("Cave","Johnson",34343434);
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
        
        GuestList.add(g);
        GuestList.add(g2);
        boolean expResult = true;
        boolean result = gm.InsertGuest(GuestList);
        assertEquals(expResult, result);
    }
}