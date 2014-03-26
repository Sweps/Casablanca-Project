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
    DBFacade facade;
    
    public GuestMapperTest()
    {
    }
    
    @Before
    public void setUp()
    {
        GuestMapperMockChrisCopy gm = new GuestMapperMockChrisCopy();
        facade = DBFacade.getInstance(gm);
    }
    
    @After
    public void tearDown()
    {
    }
    
}