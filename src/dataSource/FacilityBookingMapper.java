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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public ArrayList<Integer> getIncompatibleTennisTimes(Date time, Connection con) {
        int[] maxtimes = new int[12];
        ArrayList<Integer> times = new ArrayList<>(); 
        String sqlstring = "SELECT to_char(dateandtime, 'HH24'), "
                + "(select count(*) from facility where facilitytype = 'tennis court')  "
                + "FROM facilitybooking "
                + "WHERE to_char(dateandtime , 'DD-MM-YYYY') = ? "
                + "AND facilitytype = 'tennis court'";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        String datestring = sdf.format(time);
        
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(sqlstring);
        statement.setString(1,datestring);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
           int current = Integer.parseInt(rs.getString(1));
           
           maxtimes[current-8] += 1;
           if (maxtimes[current-8] >= Integer.parseInt(rs.getString(2)))
           {
               times.add(current);
           }
           
        }
        
        }
        catch(Exception e)
          {
              System.out.println(e.getMessage());
            return null;
          }
        return times;
    }

    public int bookTennis(Guest currentguest, Date date, Connection con) {
        FacilityMapper fmap = new FacilityMapper();
        Facility facility = fmap.getAvailableTennis(date, con);
        ArrayList<FacilityBooking> list = getGuestBookings(currentguest,date,con);
        SimpleDateFormat sdf = new SimpleDateFormat("HH24");
        int hour = Integer.parseInt(sdf.format(date));
        if(list.size() >= 4) {return -1;}
        for (int i = 0; i<list.size();i++)
        {
            if(Integer.parseInt(sdf.format(list.get(i).dateAndTime)) == hour)
            {
                return -2;
            }
        }
        
        FacilityBooking fb = new FacilityBooking(DBFacade.getInstance().getID(), facility, currentguest,date);
        Boolean success;
        try{
            success = insertFacilityBooking(fb, con);
        }
        catch(Exception e)
        {
            return 0;
        }
        
        return facility.facilityId;
    
    }


   private ArrayList<FacilityBooking> getGuestBookings(Guest guest,Date date, Connection con)
   {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        String datestring = sdf.format(date);
       ArrayList<FacilityBooking> list = new ArrayList<>();
       String sqlstring = "SELECT facilitybookingid FROM facilitybooking "
               + "WHERE GUESTNO = ? "
               + "AND to_char(dateandtime , 'DD-MM-YYYY') = ? ";
       PreparedStatement statement;
       try{
           statement = con.prepareStatement(sqlstring);
           statement.setLong(1, guest.getId());
           statement.setString(2, datestring);
           ResultSet rs = statement.executeQuery();
           while (rs.next())
           {
               list.add(find(rs.getLong(1),con));
           }
       }
       catch(Exception e)
       {   
           System.out.println(e.getMessage());
           return null;
       }
       return list;
   }
}
