/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author christoffer
 */
public class Controller implements ControllerInterface {

    RoomType[] roomtypes;
    public Controller()
    {
      //RIP HAQ
    }
    //testtransaction with dummy data 
    // i den rigtige me
//    public Boolean testtransaction()
//    {
//      //skal bruge en date
//      Date tempdate = Calendar.getInstance().getTime();
//      //
//        //
//        DBFacade.getInstance().startNewBusinessTransaction();
//        Guest guest = new Guest("Brian", "klaphat", 9001);
//        guest.setAddress("wutvej 9");
//        guest.setCountry("wutland");
//        guest.setEmail("hat@1337.com");
//        RoomBooking rb = new RoomBooking(guest, tempdate, 5, 0, roomtypes[0], "hejej");
//        
//        
//       return DBFacade.getInstance().commitBusinessTransaction();
//    }
    
    @Override
    public Boolean newRoomBooking(String firstName, String lastName, String email, int phonenumber,
            String address, String country, Date startDate, int noOfNights, String type, String travelAgency)
    { 
        DBFacade.getInstance().startNewBusinessTransaction();
        Guest g = new Guest(firstName, lastName, phonenumber);
            g.setAddress(address);
            g.setEmail(email);
            g.setCountry(country);
        DBFacade.getInstance().registerNewItem(g);
            
            Room theroom = DBFacade.getInstance().getAvailableRoom(startDate, noOfNights, type);
            
            RoomBooking burgerking = new RoomBooking(g, startDate, noOfNights, theroom, travelAgency);
            DBFacade.getInstance().registerNewItem(burgerking);

            
        
                     
        return DBFacade.getInstance().commitBusinessTransaction();
        
    }

    @Override
    public Boolean CancelRoomBooking(String firstName, String lastName, int phonenumber, Date startDate, int noOfNights)throws SQLException {
        System.out.println("controller");
        
        java.util.Date utilStartDate = startDate;
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        boolean cancelStatus = DBFacade.getInstance().deleteRoomBookingTransaction(firstName,
                lastName, phonenumber, (java.sql.Date) sqlStartDate, noOfNights);
        
        return cancelStatus;
    }
}
