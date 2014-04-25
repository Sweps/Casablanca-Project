/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import static dataSource.RoomBookingMapper.testRun;
import java.sql.Connection;
import java.util.ArrayList;
import domain.*;
import java.sql.*;

/**
 *
 * @author Charlie
 */
public class TravelAgencyMapper {
    
    static boolean testRun = false;
    
    public TravelAgency find (long companyId, Connection conn) throws SQLException{
        
        TravelAgency ta = null;
        String findstring = "SELECT COMPANYID, COMPANYNAME, COMPANYPHONE, COMPANYEMAIL, VERSION "
                            + "FROM TRAVELAGENCY WHERE COMPANYID = ?";
        PreparedStatement statement;
        try{
            statement = conn.prepareStatement(findstring);
            statement.setLong(1, companyId);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                
                ta = new TravelAgency(rs.getString(2), rs.getInt(3), rs.getString(4));
            }
        }
        catch(Exception e)
        {
            return null;
        }
        return ta;
    }    
    
    public boolean insertTravelAngecy(ArrayList<TravelAgency> TravelAngecyList, Connection conn) throws SQLException{
        System.out.println("travelagency mapper start");
        int rowsInserted = 0;
        String SQLString = "INSERT INTO TRAVELAGENCY "
                         + "VALUES (?,?,?,?,?)";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < TravelAngecyList.size(); i++){
            
            TravelAgency ta = TravelAngecyList.get(i);
            statement.setLong(1, ta.getCompanyId());
            statement.setString(2, ta.getCompanyName());
            statement.setInt(3, ta.getCompanyPhone());
            statement.setString(4, ta.getCompanyEmail());
            statement.setInt(5, ta.getVersion());
            rowsInserted += statement.executeUpdate();
            System.out.println("travelagency mapper for slut");
        }
        if (testRun)
        {
            System.out.println("insertTravelAgency(): " + (rowsInserted == TravelAngecyList.size()));
        }
        System.out.println("før return mapper");
        return (rowsInserted == TravelAngecyList.size());
        
        
        
        
    }
    
}
