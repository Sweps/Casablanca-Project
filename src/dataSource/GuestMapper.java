/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public boolean addGuest(Object Guest)
    {
        boolean state = false;
        int rowsInserted;
        String SQLString
                = "insert into Guest "
                + "values (?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        
        try {
            statement = con.prepareStatement(SQLString);
            statement.setInt(1, Guest.ID);
            statement.setInt(2, Guest.FirstName);
            statement.setInt(3, Guest.LastName);
            statement.setInt(4, Guest.Address);
            statement.setInt(5, Guest.Country);
            statement.setInt(6, Guest.Phone);
            statement.setInt(7, Guest.Email);
            rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                state = true;
            }
        }catch (SQLException e){
            System.out.println("Fail in GuestMapper - addGuest");
            System.out.println(e.getMessage());
         }
         finally // must close statement
    {
      try {
        statement.close();
      } catch (SQLException e) {
        System.out.println("Fail in GuestMapper - addGuest");
        System.out.println(e.getMessage());
      }
            
        return state;
    }
    
}
}

