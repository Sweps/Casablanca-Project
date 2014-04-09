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

    @Test
    public void testFind() {
       
        //Vi ved at rum 30 er i databasen, så vi henter det. Og demonstarter at objecet er lavet ordenligt
        //Room 30 er et singleroom der koster 60
        //assertture price= 0
        //assertture.type.(singleroom)
        Connection con = DBConnector.getConnection();
        
        RoomMapper rm = new RoomMapper();
              
        Room test1 = rm.find(30, con);
        System.out.print(test1.getPrice());
        
        
        assertTrue(test1 instanceof Room);
        int price = test1.getPrice();
        assertTrue(price == 60);
//        assertTrue(price == 999);
        
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
