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
    private String travelAgency;

    

    
    private int noofnights, version, room;
    private RoomType type;
    private long id;
    
    public RoomBooking(Guest guest, Date startdate, int noofnights, int room, 
                       RoomType type, String travelAgency)
      {
        this.guest = guest;
        this.startdate = startdate;
        this.noofnights = noofnights;
        this.room = room;
        this.type = type;
        this.travelAgency = travelAgency;
        
        //TODO CALCULATE ENDDATE
        
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            c.setTime(startdate);
            c.add(Calendar.DATE, noofnights);
        this.enddate = c.getTime();
        
        DBFacade.getInstance().registerNewItem(this);
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

    public int getRoom()
      {
        return room;
      }

    public RoomType getType()
      {
        return type;
      }

    public Long getId()
      {
        return id;
      }
    public Date getEnddate() {
        return enddate;
    }
    public String getTravelAgency() {
        return travelAgency;
    }
  }
