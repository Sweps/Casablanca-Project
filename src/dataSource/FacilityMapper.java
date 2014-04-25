/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Facility;
import domain.Guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Phill
 */
class FacilityMapper {


    public Facility find(String facilitytype, int facilityid, Connection con) {
        Facility facility = null;
        String findstring = "SELECT facilityid, facilitytype"
                          + " FROM facility WHERE facilityid = ? AND"
                          + " facilitytype = ?";
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(findstring);
        statement.setInt(1, facilityid);
        statement.setString(2, facilitytype);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            facility = new Facility(rs.getInt(1),rs.getString(2));            
        }
        
        }
        catch(Exception e)
          {
              System.out.println(e.getMessage());
            return null;
          }
        return facility;
    }

    public Facility getAvailableTennis(Date date, Connection con) {
        
        Facility facility = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH");
        String datestring = sdf.format(date);
        String sqlstring = "SELECT facilityid, facilitytype FROM facility " +
                            "WHERE (facilityid, facilitytype)" +
                            "NOT IN (select facilityid, facilitytype from facilitybooking where " +
                            "        to_char(dateandtime, 'dd-mm-yyyy HH24') = ?)" +
                            "AND facilitytype = 'tennis court'";
        PreparedStatement statement;
        try{
        statement = con.prepareStatement(sqlstring);
        statement.setString(1,datestring);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            facility = new Facility(rs.getInt(1),rs.getString(2));  
  
        }
        
        }
        catch(Exception e)
          {
              System.out.println(e.getMessage());
            return null;
          }
        return facility;
        
    }
    
}
