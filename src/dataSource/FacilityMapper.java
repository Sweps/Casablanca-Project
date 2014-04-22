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
    
}
