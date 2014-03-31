/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
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
public class GuestMapper2Test
  {
    
    public GuestMapper2Test()
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
      }
    
    @After
    public void tearDown()
      {
      }

    /**
     * Test of find method, of class GuestMapper.
     */
    @Test
    public void testFind() throws Exception
      {
        //SETUP
        Connection con = DBConnector.getConnection();
        GuestMapper gmap = new GuestMapper(con);
        //TEMPGUESTFULD
        Guest testguest = new Guest("testFind", "testFind", 31337);
        testguest.setId(1337);
        testguest.setAddress("123");
        testguest.setCountry("123");
        testguest.setEmail("123");
        testguest.setVersion(1);
        testguest.setPhonenumber(123);
        ArrayList al = new ArrayList<>();
        al.add(testguest);
        //TEMPGUESTNULLS
        Guest nullguest = new Guest("nullguest", "Nullguest", 312);
        nullguest.setId(31337);
        al.add(nullguest);
        //TEST
        gmap.InsertGuest(al);
        Guest returnGuest = gmap.find(1337, con);
        Guest nullreturnguest = gmap.find(31337, con);
          System.out.println(returnGuest.getFirstname() + returnGuest.getId());
          System.out.println(nullreturnguest.getFirstname() + nullreturnguest.getId());
          assertTrue(testguest.getId() == returnGuest.getId());
          assertTrue(nullguest.getId() == nullreturnguest.getId());
          
          
        //cleanup
        String delstatement = "DELETE FROM GUEST WHERE guestid = 1337 OR guestid = 31337";
          PreparedStatement statement = con.prepareCall(delstatement);
          statement.execute();
      }

    /**
     * Test of InsertGuest method, of class GuestMapper.
     */
   
  }
