/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.util.*;

/**
 *
 * @author christoffer
 */
public class Controller implements ControllerInterface {

    RoomType[] roomtypes;
    public Controller()
    {
      //Temporary haq
      roomtypes = new RoomType[3];
      roomtypes[0] = new RoomType("SingleRoom", 60, 20);
      roomtypes[1] = new RoomType("DoubleRoom", 80, 20);
      roomtypes[2] = new RoomType("FamilyRoom", 100, 20);
      //Temporary haq
      
    }
    //testtransaction with dummy data 
    // i den rigtige me
    public Boolean testtransaction()
    {
      //skal bruge en date
      Date tempdate = Calendar.getInstance().getTime();
      //
        //
        DBFacade.getInstance().startNewBusinessTransaction();
        Guest guest = new Guest("Brian", "klaphat", 9001);
        guest.setAddress("wutvej 9");
        guest.setCountry("wutland");
        guest.setEmail("hat@1337.com");
        RoomBooking rb = new RoomBooking(guest, tempdate, 5, 0, roomtypes[0]);
        
        
       return DBFacade.getInstance().commitBusinessTransaction();
    }
}
