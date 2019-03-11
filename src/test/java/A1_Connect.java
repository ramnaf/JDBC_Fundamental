import Library.myLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A1_Connect {

  /*
   1.connectivity
   username: as it is
   password: as it is
    */
// URL : (we have to mention JDBC at the beginnning )
  //JDBC:postgresql//hostname:port number /database
  //host = room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com
  //database = hr
  //user = hr
  //password = hr
  //port = 5432 (default for postgres)
  //URL: jdbc:postgresql://host:port/database;
  //String username = "hr";
  //String password = "hr";
//postgresql: jdbc ning databaseni ulaydighan driver

  /*
  2.connect java to database
   */
  public static void main(String[] args) {

    String url = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";
    String username = "hr";
    String password = "hr";
 //connects the java to the sql database
  //  Connection myconnect = DriverManager.getConnection(url, username, password);
   Connection mycon = myLib.getconnect(url ,username,password);
    Statement statement;

    System.out.println("connected");
  }
}