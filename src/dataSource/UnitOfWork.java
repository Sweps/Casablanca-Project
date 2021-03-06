/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import domain.Guest;
import domain.RoomBooking;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Phill
 * 
 */
public class UnitOfWork
  {
    private final Connection con = DBConnector.getConnection();
    private final ArrayList<Guest> newGuests;
//    private final ArrayList<TravelAgency> newTravelAgency;  //charles
//    private final ArrayList<Guest> dirtyGuests;
    private final ArrayList<RoomBooking> newRoomBookings;
//    private final ArrayList<RoomBooking> dirtyRoomBookings;
    private Map items = new HashMap();
    public UnitOfWork()
    {
////        dirtyGuests = new ArrayList<>();
        newGuests = new ArrayList<>();
        newRoomBookings = new ArrayList<>();
//        newTravelAgency = new ArrayList<>();
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
    
//Identity map, tilføjer Guest til mappet    
    public void addGuest(Guest guest)
    {
        items.put(guest.getId(), guest);
    }
    public Guest findGuest(Long key)
    {  
        return findGuest(key.longValue());
    }
    //Identity map, tilføjer RoomBooking til mappet
    public void addRoomBooking (RoomBooking rb)
    {
        items.put(rb.getId(), rb);
    }
    
    public RoomBooking findRoomBooking (Long key)
    {
        return findRoomBooking(key.longValue());
    }
    //Charles
//    public void addTravelAgency (TravelAgency ta)
//    {
//        items.put(ta.getCompanyId(), ta);
//    }
//    //Charles
//    public TravelAgency findTravelAgency (Long key)
//    {
//        return findTravelAgency(key.longValue());
//    }
    
    
    //Hvis nøglen findes i mappet returneres den, ellers hentes det matchede object fra databasen
    public Guest findGuest(long id)
    {
        if(items.containsKey(id))
        {
            return (Guest)items.get(id);
        }
        else
        {
        GuestMapper gm = new GuestMapper(con);
        Guest guest = gm.find(id, con);
        addGuest(guest);
        return guest;
        }
    }
    //Hvis nøglen findes i mappet returneres den, ellers hentes det matchede object fra databasen
    public RoomBooking findRoomBooking(long id)
    {
        if (items.containsKey(id))
        {
            return (RoomBooking)items.get(id);
        }
        else
        {
            RoomBookingMapper rbm = new RoomBookingMapper();
            RoomBooking roombooking = rbm.find(id, con);
            addRoomBooking(roombooking);
            return roombooking;
        }
    }
    /**
     * 
     * @author Phill
     * modtager et rent object til database persistering, 
     * ser hvilket type objekt det er og sender det videre alt afhængelig
     */
    public void registerNewItem(Object obj)
    {
     
        switch((obj.getClass()).getSimpleName())
        {
            case "Guest" : registerNewGuest((Guest)obj);
                            break;
            case "RoomBooking": registerNewRoomBooking((RoomBooking)obj);
                            break;
                //Charles
//            case "TravelAgency": registerNewTravelAgency((TravelAgency)obj);
//                            break;
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

    
/**
 * @Author Phill
 * modtager et rent gæsteobjekt fra registerNewItem,
 * tjekker om det allerede er blevet lagt ind til persistering og 
 * hvis ikke, lægger det ind i arraylisten til persistering
 */
    private void registerNewGuest(Guest guest) {
        if (!newGuests.contains(guest))
        {
            if(guest.getId() == 0)
            {
                guest.setId(DBFacade.getInstance().getID());
            }
            if(guest.getVersion() == 0)
            {
                guest.setVersion(1);
            }
            newGuests.add(guest);
        }
       
    }
    //charles
    //modtager et rent gæsteobjekt fra registerNewItem,
    // tjekker om det allerede er blevet lagt ind til persistering og 
    // hvis ikke, lægger det ind i arraylisten til persistering
//    private void registerNewTravelAgency(TravelAgency travelagency){
//        System.out.println("registerNewTravelAgency");
//        if(!newTravelAgency.contains(travelagency))
//        {
//            if(travelagency.getCompanyId() == 0)
//            {
//                System.out.println("registerNewTravelAgency1");
//                travelagency.setCompanyId(DBFacade.getInstance().getID());
//            }
//            if(travelagency.getVersion() == 0)
//            {
//                System.out.println("registerNewTravelAgency2");
//                travelagency.setVersion(1);
//            }
//            System.out.println("registerNewTravelAgency3");
//            newTravelAgency.add(travelagency);
//        }
//        
//    }
    
/**
 * @Author Phill
 * modtager et rent roombookingobjekt fra registerNewItem,
 * tjekker om det allerede er blevet lagt ind til persistering og 
 * hvis ikke, lægger det ind i arraylisten til persistering
 */
    private void registerNewRoomBooking(RoomBooking booking) {
        if (!newRoomBookings.contains(booking))
        {
            if(booking.getId() == 0)
            {
                booking.setId(DBFacade.getInstance().getID());
            }
            if(booking.getVersion() == 0)
            {
                booking.setVersion(1);
            }
            newRoomBookings.add(booking);
        }
    }
    
    //Christoffer, Anders
    public boolean cancelRoomBooking(String firstname, String lastname, int phonenumber, Date startDate, int noOfNights, Connection con)throws SQLException
     {
         boolean status = false;
         try{
            con.setAutoCommit(false);
            RoomBookingMapper rbm = new RoomBookingMapper();
            status = rbm.cancelRoomBooking(firstname, lastname, phonenumber, startDate, noOfNights, con);
            con.commit();
         }catch(SQLException ex){
             System.out.println("Error in unit of work - cancelRoomBooking");
             System.out.println(ex);
             con.rollback();
             status = false;
         }
         
         return status;
     }
    
    public boolean commit(Connection con)throws SQLException
     {
         boolean status = true;
         try
         {
          con.setAutoCommit(false);
          GuestMapper gm = new GuestMapper(con);
          RoomBookingMapper rbm = new RoomBookingMapper();
         // TravelAgencyMapper tam = new TravelAgencyMapper();
          
          status = status && gm.InsertGuest(newGuests);
          status = status && rbm.insertRoomBooking(newRoomBookings, con);
     //     status = status && tam.insertTravelAngecy(newTravelAgency, con);
          if (!status)
          {
             throw new Exception("Business Transaction Failed");
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
