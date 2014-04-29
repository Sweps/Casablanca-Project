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
    
    //Charles & Phil
    @Override
    public Boolean newRoomBooking(String firstName, String lastName, String email, int phonenumber,
            String address, String country, Date startDate, int noOfNights, String type) //TravelAgency travel agency
    { 
        DBFacade.getInstance().startNewBusinessTransaction();
        Guest g = new Guest(firstName, lastName, phonenumber);
            g.setAddress(address);
            g.setEmail(email);
            g.setCountry(country);
            
        DBFacade.getInstance().registerNewItem(g);
        
            
            Room theroom = DBFacade.getInstance().getAvailableRoom(startDate, noOfNights, type);
            
            
            RoomBooking burgerking = new RoomBooking(g, startDate, noOfNights, theroom);
            DBFacade.getInstance().registerNewItem(burgerking);
        return DBFacade.getInstance().commitBusinessTransaction();
        
    }
    
    //Charles
//    @Override
//    public Boolean newTravelAgency(String companyName, int companyPhone, String companyEmail)
//    {
//        DBFacade.getInstance().startNewBusinessTransaction();
//        TravelAgency t = new TravelAgency(companyName, companyPhone, companyEmail);
//        
//        DBFacade.getInstance().registerNewItem(t);
//        
//        return DBFacade.getInstance().commitBusinessTransaction();
//    }    
    

    @Override
    public Boolean CancelRoomBooking(String firstName, String lastName, int phonenumber, Date startDate, int noOfNights)throws SQLException {
        System.out.println("controller");
        
        java.util.Date utilStartDate = startDate;
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        boolean cancelStatus = DBFacade.getInstance().deleteRoomBookingTransaction(firstName,
                lastName, phonenumber, (java.sql.Date) sqlStartDate, noOfNights);
        
        return cancelStatus;
    }
    
   

    @Override
    public Boolean addGuest(String firstName, String lastName, int phonenumber) {
        DBFacade.getInstance().startNewBusinessTransaction();
        Guest g = new Guest(firstName, lastName, phonenumber);
        DBFacade.getInstance().registerNewItem(g);
        
        return DBFacade.getInstance().commitBusinessTransaction();
    }
    
    //Charles
    //Tilføjer en guest med en email
    @Override
    public Boolean addGuestEmail(String firstName, String lastName, int phonenumber, String email){
        DBFacade.getInstance().startNewBusinessTransaction();
        Guest g = new Guest(firstName, lastName, phonenumber);
        g.setEmail(email);
        DBFacade.getInstance().registerNewItem(g);
        
        return DBFacade.getInstance().commitBusinessTransaction();
        
    }

    @Override
    public int GuestRoomCost(int phone)throws SQLException {
        return DBFacade.getInstance().getGuestRoomCost(phone);
    }
    
    @Override
    public ArrayList<Integer> searchForFreeRoomsAtDiffDates(java.util.Date enddate, java.util.Date startdate) throws SQLException
    {
        return DBFacade.getInstance().searchForFreeRoomsAtDiffDates(enddate, startdate);
    }
}
