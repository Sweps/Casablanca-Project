/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.*;

/**
 *
 * @author christoffer
 */
public class Casablanca {

    RoomType[] roomtypes;
    public Casablanca()
    {
      //Temporary haq
      roomtypes = new RoomType[3];
      roomtypes[0] = new RoomType("SingleRoom", 60, 20);
      roomtypes[1] = new RoomType("DoubleRoom", 80, 20);
      roomtypes[2] = new RoomType("FamilyRoom", 100, 20);
      //Temporary haq
      
    }
    public static void main(String[] args) {
        
        //Test af at regne med dates
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        System.out.println("Today's Date: " + today);
        calendar.add(Calendar.DAY_OF_WEEK, 20);
        Date addMonths = calendar.getTime();
        System.out.println("Date after 4 months: " + addMonths);
        
    }
}
