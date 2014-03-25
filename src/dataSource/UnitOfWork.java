/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Phill
 * 
 */
public class UnitOfWork
  {
    private final Connection con = DBConnector.getConnection();
    private final ArrayList<Long> sequence;
    private final ArrayList<Guest> newGuests;
    private final ArrayList<Guest> dirtyGuests;
    private final ArrayList<RoomBooking> newRoomBookings;
    private final ArrayList<RoomBooking> dirtyRoomBookings;
    
    public UnitOfWork()
    {
////        dirtyGuests = new ArrayList<>();
        newGuests = new ArrayList<>();
        sequence = new ArrayList<>();
        newRoomBookings = new ArrayList<>();
////        dirtyRoomBookings = new ArrayList<>();   
    }
//////    public static void main(String[] args)
//////      {
//////          UnitOfWork uow = new UnitOfWork();
////////          System.out.println("Sequence list has" + uow.sequence.size() + "items");
////////          System.out.println("Getting an ID:" + uow.getID());
////////          System.out.println("Sequence list has" + uow.sequence.size() + "items");
////////          System.out.println("Getting an ID:" + uow.getID());
////////          System.out.println("Sequence list has" + uow.sequence.size() + "items");
//////////          Guest p = new Guest("test","Test",1230);
//////////          uow.registerNewItem(p);
//////      }
         
    public void registerNewItem(Object obj)
    {

        switch((obj.getClass()).getSimpleName())
        {
            case "Guest" : registerNewGuest((Guest)obj);
                            break;
            case "RoomBooking": registerNewRoomBooking((RoomBooking)obj);
                            break;
        }
    }
    
//////    public void registerDirtyItem(Object obj)
//////    {
//////
//////        switch((obj.getClass()).getSimpleName())
//////        {
//////            case "Guest" : registerDirtyGuest((Guest)obj);
//////                            break;
//////            case "RoomBooking": registerDirtyRoomBooking((RoomBooking)obj);
//////                            break;
//////        }
//////    }

    private void registerNewGuest(Guest guest) {
        if (!newGuests.contains(guest))
        {
            if(guest.getId() == null)
            {
                guest.setId(DBFacade.getInstance().getID());
            }
            newGuests.add(guest);
        }
       
    }

    private void registerNewRoomBooking(RoomBooking booking) {
        if (!newRoomBookings.contains(booking))
        {
            if(booking.getId() == null)
            {
                booking.setID(DBFacade.getInstance().getID());
            }
            newRoomBookings.add(booking);
        }
    }
    
    public boolean commit(Connection con)throws SQLException
     {
         boolean status = true;
         try
         {
          con.setAutoCommit(false);
          GuestMapper gm = new GuestMapper(con);
          RoomBookingMapper rbm = new RoomBookingMapper(con);
          
          status = status && gm.insertGuests(newGuests);
          status = status && rbm.insertRoomBookings(newRoomBookings);
          if (!status)
          {
             throw new Exception("Business Transaction Failed")
          }
          con.commit();
         }
         catch (Exception e)
         {
             System.out.println("fail in UnitOfWork - commit()");
             System.err.println(e);       
             con.rollback();
             status = false;
         }
         return status;
     }
    
    
////////
////////    private void registerDirtyGuest(Guest guest) {
////////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////////    }
////////    
////////    private void registerDirtyRoomBooking(RoomBooking booking) {
////////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////////    }
////////    
    
 
  }
