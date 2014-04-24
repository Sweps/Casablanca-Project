/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Phill
 */
public interface ControllerInterface
  {
    Boolean newRoomBooking(String firstName, String lastName, String email, int phonenumber,
            String address, String country, Date startDate, int noOfNights, String type, String travelAgency);
    
    Boolean CancelRoomBooking(String firstName, String lastName, int phonenumber, Date startDate, int noOfNights)throws SQLException;
    
    Boolean addGuest(String firstName, String lastName, int phonenumber);
    
    Boolean addGuestEmail(String firstName, String lastName, int phonenumber, String email);
    
    Boolean newTravelAngecy(String CompanyName, int Companyphone, String CompanyEmail); //tester
    
    int GuestRoomCost(int phone)throws SQLException;
    
    int[] searchForFreeRoomsAtDiffDates(java.sql.Date enddate, java.sql.Date startdate) throws SQLException;
  }
