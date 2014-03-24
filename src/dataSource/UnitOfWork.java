/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataSource;

import java.sql.*;

/**
 *
 * @author Phill
 */
public class UnitOfWork
  {
    Connection con = DBConnector.getConnection();
    
    private long getNextinSequence()
      {
        long nextseq = 0;
        try
        {
         String sqlIdentifier = "select SEQ_NUMBER.NEXTVAL from dual";
         PreparedStatement pst = con.prepareStatement(sqlIdentifier);
         ResultSet rs = pst.executeQuery();
         if (rs.next()) nextseq = rs.getLong(1);
         return nextseq;
 
        }
        catch (Exception e)
          {
              System.out.println("Error" + e.getMessage());
          }
        
        return nextseq;
      }
    public static void main(String[] args)
      {
        UnitOfWork uow = new UnitOfWork();
          System.out.println(uow.getNextinSequence());
        
      }
         
  }
