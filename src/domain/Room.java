/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Charles-HP
 */
public class Room 
{   
    private RoomType roomtype;
    private int roomNo, id, version;
    
    public Room(RoomType type,int RoomNo)
    {
      this.roomtype = type;
      this.roomNo = RoomNo;
      
    }

    public void setId(int id)
      {
        this.id = id;
      }

    public void setVersion(int version)
      {
        this.version = version;
      }

    public RoomType getRoomtype()
      {
        return roomtype;
      }

    public int getRoomNo()
      {
        return roomNo;
      }

    public int getId()
      {
        return id;
      }

    public int getVersion()
      {
        return version;
      }
    
    
    
}
