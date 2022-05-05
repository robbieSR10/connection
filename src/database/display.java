package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class display {
    public static void main(String[] args) throws Exception {
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ideas","root","KR1fH2Fy");
    
    System.out.println("connecting to DB");
    PreparedStatement stmt=con.prepareStatement("select * from idea");
    
    ResultSet result=stmt.executeQuery();
    while (result.next())
    {
        System.out.println( result.getString(1) +""  +  result.getString(2)  +""   + result.getString(3));
    }
        
    }
}
