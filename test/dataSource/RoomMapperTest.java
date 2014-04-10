/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Room;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles-HP
 */
public class RoomMapperTest {
    
    public RoomMapperTest() {
    }
    
    @Before
    public void setUp() {
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
    public void testGetRandomAvailableFamily() {
        System.out.println("getRandomAvailableFamily");
        Date startDate = null;
        Date endDate = null;
        RoomMapper instance = new RoomMapper();
        Room expResult = null;
        Room result = instance.getRandomAvailableFamily(startDate, endDate);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRandomAvailableDouble() {
        System.out.println("getRandomAvailableDouble");
        Date startDate = null;
        Date endDate = null;
        RoomMapper instance = new RoomMapper();
        Room expResult = null;
        Room result = instance.getRandomAvailableDouble(startDate, endDate);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRandomAvailableSingle() {
        System.out.println("getRandomAvailableSingle");
        Date startDate = null;
        Date endDate = null;
        RoomMapper instance = new RoomMapper();
        Room expResult = null;
        Room result = instance.getRandomAvailableSingle(startDate, endDate);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
