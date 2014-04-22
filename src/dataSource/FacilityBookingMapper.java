/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import static dataSource.RoomBookingMapper.testRun;
import domain.Facility;
import domain.FacilityBooking;
import domain.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Phill
 */
public class FacilityBookingMapper {
    
    public boolean insertFacilityBooking(FacilityBooking booking, Connection conn) throws SQLException
    {
        int rowsInserted = 0;
        String SQLString = "INSERT INTO "
                         + "facilitybooking "
                         + "(facilitybookingid, facilitytype, "
                         + "facilityid, guestno, dateandtime) "
                         + "VALUES (?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        
        statement.setLong(1, booking.facilityBookingId);
        statement.setString(2, booking.facility.facilityType);
        statement.setInt(3, booking.facility.facilityId);
        statement.setLong(4, booking.guest.getId());
        statement.setDate(5, convertDate(booking.dateAndTime));
        rowsInserted += statement.executeUpdate();
        
        return (rowsInserted == 1);
                  
    }
    
    public FacilityBooking find(long id, Connection con)
      {
        FacilityBooking fb = null;
        String findstring = "SELECT facilitybookingid, facilitytype, "
                          + "facilityid, guestno, dateandtime "
                          + "FROM facilitybooking WHERE facilitybookingid = ?";
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(findstring);
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            GuestMapper gmap = new GuestMapper(con);
            Guest guest = gmap.find(rs.getLong(4), con);
            FacilityMapper fmap = new FacilityMapper();
            Facility facility = fmap.find(rs.getString(2), rs.getInt(3), con);
            fb = new FacilityBooking(rs.getLong(1), facility, guest, rs.getDate(5));               
        }
        
        }
        catch(Exception e)
          {
              System.out.println(e.getMessage());
            return null;
          }
        return fb;
      } 
    private java.sql.Date convertDate(java.util.Date date)
    {
       return new java.sql.Date(date.getTime());
    }
}
