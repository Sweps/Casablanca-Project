/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Charles
 */
public class Room 
{   
    private String roomType;
    private int roomNo, price;
    
    public Room(String roomType,int RoomNo, int price)
    {
      this.roomType = roomType;
      this.roomNo = RoomNo;
      this.price = price;
      
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getPrice() {
        return price;
    }

}
