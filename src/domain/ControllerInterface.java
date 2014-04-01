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
    Boolean NewRoomBooking(String firstName, String lastName, String email, int phonenumber,
            String address, String country, Date startDate, int noOfNights, int singleRooms, int doubleRooms, int familyRooms, String travelAgency);
    
    Boolean CancelRoomBooking(String firstName, String lastName, int phonenumber, Date startDate, int noOfNights)throws SQLException;
  }
