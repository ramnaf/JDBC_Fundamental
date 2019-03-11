package Library;

import java.sql.Connection;
import java.sql.DriverManager;

public class myLib {

    public static Connection getconnect(String url, String username, String password){

        Connection mycon = null;

        try{
            mycon = DriverManager.getConnection(url, username, password);

        }catch (Exception e){}

        return mycon;
    }

}
