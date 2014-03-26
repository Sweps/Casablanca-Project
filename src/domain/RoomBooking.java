/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.Date;

/**
 *
 * @author Phill
 */
public class RoomBooking
  {
    private Guest guest;
    private Date startdate;
    private int noofnights, version, room;
    private RoomType type;
    private long id;
    
    public RoomBooking(Guest guest, Date startdate, int noofnights, int room, 
                       RoomType type)
      {
        
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

    public long getId()
      {
        return id;
      }
  }
