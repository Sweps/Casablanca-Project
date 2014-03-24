/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author christoffer
 */
public class DBConnector {
    
  private static DBConnector instance = null;

  //Insert ORACLE id and password SEM2_TEST_GR03 = test db SEM2_GR03 = rigtig db
  private static final String id = "SEM2_TEST_GR03"; 
  private static final String pw = "SEM2_TEST_GR03";
  private static Connection connection;
  
  private DBConnector(){
    }
  
  public static DBConnector getDBConnector(){
      if(instance == null){
          instance = new DBConnector();
      }
      return instance;
  }
  
  private static void intializeConnection() {
    try {
      connection = DriverManager.getConnection("jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat", id, pw);
    } catch (SQLException e) {
      System.out.println("\n*** Remember to insert your Oracle ID and PW in the DBConnector class! ***\n");
      System.out.println("Could not create a Connection in DBConnector.getConnection(): " + e);
    }
  }

  public static Connection getConnection() {
    if (connection == null) {
      intializeConnection();
    }
    return connection;
  }

  public static void releaseConnection(Connection con) {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e);
    }
  }
}