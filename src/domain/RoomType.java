/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Phill
 */
public class RoomType
  {
    
    
    private String name;
    private int price, amount;
    
    public RoomType(String name, int price, int amount)
      {
        this.name = name;
        this.price = price;
        this.amount = amount;
      }
    
//    public enum roomtypes {singleRoom, doubleRoom, familyRoom};
//    private roomtypes type;
//    private int singleprice, doubleprice, familyprice;
//    
//    public RoomType(roomtypes type){
//        this.type = type;
//        this.singleprice = 60;
//        this.doubleprice = 80;
//        this.familyprice = 100;
//    }
//    public roomtypes getType(){
//        return this.type;
//    }
//    public int getRoomprice(){
//        switch(this.type){
//            case singleRoom: return singleprice;
//            case doubleRoom: return doubleprice;
//            case familyRoom: return familyprice;
//            default: return 0; // burde aldrig ske
//              
//        }
//    }

    public String getName()
      {
        return name;
      }

    public int getPrice()
      {
        return price;
      }

  }
