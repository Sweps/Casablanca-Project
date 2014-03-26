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
public class Controller implements ControllerInterface {

    RoomType[] roomtypes;
    public Controller()
    {
      //Temporary haq
      roomtypes = new RoomType[3];
      roomtypes[0] = new RoomType("SingleRoom", 60, 20);
      roomtypes[1] = new RoomType("DoubleRoom", 80, 20);
      roomtypes[2] = new RoomType("FamilyRoom", 100, 20);
      //Temporary haq
      
    }
}
