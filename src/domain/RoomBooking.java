/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import dataSource.DBFacade;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Phill
 */
public class RoomBooking
  {
    private Guest guest;
    private Date startdate;
    private Date enddate;
//    private String travelAgency;

    

    
    private int noofnights, version;
    private Room room;
    private long id;
    
    public RoomBooking(Guest guest, Date startdate, int noofnights,Room room)
      {
        this.guest = guest;
        this.startdate = startdate;
        this.noofnights = noofnights;
        this.room = room;
        
            Calendar c = Calendar.getInstance();
            c.setTime(startdate);
            c.add(Calendar.DATE, noofnights);
        this.enddate = c.getTime();
      }
    public void setVersion(int version)
      {
        this.version = version;
      }

    public void setId(long id)
      {
        this.id = id;
      }

    public Guest getGuest()
      {
        return guest;
      }

    public Date getStartdate()
      {
        return startdate;
      }

    public int getNoofnights()
      {
        return noofnights;
      }

    public int getVersion()
      {
        return version;
      }

    public Room getRoom()
      {
        return room;
      }

    public Long getId()
      {
        return id;
      }
    public Date getEnddate() {
        return enddate;
    }

    
  }
