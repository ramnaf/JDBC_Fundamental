package JDBCs;

import Library.myLib;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class simpleStatement {
    public static void main(String[] args) throws Exception{

       //1.connect

        String username = "hr",
                password = "hr",
                URL = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";
        Connection mycon = myLib.getconnect(URL, username, password);
        System.out.println("connected");

        //  2. create statement(is a translator)
    /*
    we need to create a statement to write a query then let java knows that query
     */

        Statement mystatement = mycon.createStatement();
        String sql = "select * from account;";
        //to open table
      //excute query then let all the info assign to the resultset
        ResultSet myset = mystatement.executeQuery(sql);
        while (myset.next()){
            System.out.println(myset.getString("password"));
        }


        Set<String>myset1 = new HashSet<>();
        myset1.add("ramile");
        myset1.add("ramile");
        myset1.add("ramile");
        myset1.add("ramile");
        Iterator<String> iterator = myset1.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}