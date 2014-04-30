/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Anders
 */
public class GuestMapper implements GuestMapperInterface 
{
      private final Connection con;

  public GuestMapper(Connection con) {
    this.con = con;
  }

    public Guest find(long id, Connection con)
      {
        Guest guest = null;
        String findstring = "SELECT guestid, firstname,"
                          + " lastname, address, country,"
                          + " phone, email, age, version"
                          + " FROM guest WHERE guestid = ?";
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(findstring);
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            guest = new Guest(rs.getString(2),
                           rs.getString(3),
                           rs.getInt(6));
            
            guest.setId(rs.getLong(1));
            guest.setVersion(rs.getInt(9));
            guest.setAddress(rs.getString(4));   
            guest.setCountry(rs.getString(5));           
            guest.setEmail(rs.getString(7));
                    
        }
        
        }
        catch(Exception e)
          {
            return null;
          }
        return guest;
      }
    @Override
    public boolean InsertGuest(ArrayList<Guest> GuestList) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString
                = "insert into Guest "
                + "values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = con.prepareStatement(SQLString);
        
       for(int i = 0; i < GuestList.size(); i++)
        {
            Guest g = GuestList.get(i);
            statement.setLong(1, g.getId());
            statement.setString(2, g.getFirstname());
            statement.setString(3, g.getLastname());
            statement.setString(4, g.getAddress());
            statement.setString(5, g.getCountry());
            statement.setInt(6, g.getPhonenumber());
            statement.setString(7, g.getEmail());
            statement.setInt(8, 0);
            statement.setInt(9, g.getVersion());
            rowsInserted += statement.executeUpdate();
        }    
        return (rowsInserted == GuestList.size());
    }
    
    public boolean updateGuest(ArrayList<Guest> GuestList, Connection con) throws SQLException
    {
        int rowsUpdated = 0;
        String SQLString ="UPDATE GUEST "
                + "SET FIRSTNAME = ?, LASTNAME = ?, ADDRESS = ?, COUNTRY = ?, PHONE = ?, EMAIL = ?, AGE = ?, VERSION = ? "
                + "WHERE GUESTID = ? and VERSION = ?";
        
        PreparedStatement statement = null;
        
        statement = con.prepareStatement(SQLString);
        for (int i = 0; i < GuestList.size(); i++)
        {
            Guest g = GuestList.get(i);
            
            statement.setString(1, g.getFirstname());
            statement.setString(2, g.getLastname());
            statement.setString(3, g.getAddress());
            statement.setString(4, g.getCountry());
            statement.setInt(5, g.getPhonenumber());
            statement.setString(6, g.getEmail());
            statement.setInt(7, 0);
            statement.setInt(8, g.getVersion() + 1); // next version number
            statement.setLong(9, g.getId());
            statement.setInt(10, g.getVersion());
            int tupleUpdated = statement.executeUpdate();
            if (tupleUpdated == 1)
            {
                g.setVersion(+ 1);
            }
            rowsUpdated += tupleUpdated;
        }
        return rowsUpdated == GuestList.size(); // false if any conflict in version number 
                
                
    }
    
    //Christoffer
    public int GuestRoomCost(int phonenumber, Connection con)throws SQLException{
        String findCostString = "select sum(rt.price * rb.nooofnights) from ROOMTYPE rt" +
                    " left join room r on r.roomtype = rt.roomtype" +
                    " left join roombooking rb on r.roomno = rb.roomno" +
                    " left join guest g on g.GUESTID = rb.GUESTNO" +
                    " where g.phone = ?";
        PreparedStatement statement = null;
        
        statement = con.prepareStatement(findCostString);
        statement.setInt(1, phonenumber);
        
        ResultSet rs = statement.executeQuery();
        
        rs.next();
        int sum = rs.getInt(1);
        return sum;
    }
    
}


