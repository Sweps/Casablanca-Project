/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import java.sql.Connection;
import java.util.ArrayList;
import domain.*;
import java.sql.*;

/**
 *
 * @author Charlie
 */
public class TravelAngecyMapper {
    
    
    public boolean insertTravelAngecy(ArrayList<TravelAngecy> TravelAngecyList, Connection conn) throws SQLException{
        
        int rowsInserted = 0;
        String SQLString = "INSERT INTO TRAVELAGENCY VALUES (?,?,?,?,?) ";
        PreparedStatement statement = null;
        statement = conn.prepareStatement(SQLString);
        
        for(int i = 0; i < TravelAngecyList.size(); i++){
            
            TravelAngecy ta = TravelAngecyList.get(i);
            statement.setLong(1, ta.getCompanyId());
            statement.setString(2, ta.getCompanyName());
            statement.setInt(3, ta.getCompanyPhone());
            statement.setString(4, ta.getCompanyEmail());
            statement.setInt(5, ta.getVersion());
            
        }
        
        return (rowsInserted == TravelAngecyList.size());
        
        
        
        
    }
    
}
