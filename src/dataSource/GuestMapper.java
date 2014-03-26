/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    @Override
    public boolean InsertGuest(ArrayList<Guest> GuestList, Connection conn) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString
                = "insert into Guest "
                + "values (?,?,?,?,?,?,?)";
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
            rowsInserted += statement.executeUpdate();
        }    
        return (rowsInserted == GuestList.size());
    }
}


