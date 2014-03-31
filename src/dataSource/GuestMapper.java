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

    public Guest find(long id, Connection con) throws SQLException
      {
        Guest guest = null;
        String findstring = "SELECT * FROM guest WHERE guestid = ?";
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
            
            String Address = rs.getString(4);
            if (!rs.wasNull())
            guest.setAddress(Address);
            
            String Country = rs.getString(5);
            if (!rs.wasNull())
            guest.setCountry(Country);
            
            String Email = rs.getString(7);
            if (!rs.wasNull())
            guest.setEmail(Email);
                    
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
}


