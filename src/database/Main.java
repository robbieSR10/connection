package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

       Connection conn =null;
       Statement stmt =null;

       try{
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ideas","root","KR1fH2Fy");
           System.out.println("connection succesful");

           stmt = conn.createStatement();
           String sql = "INSERT INTO idea (name,suggestion)" +
                        "VALUES('Warinda', '4-3-3')";
            stmt.executeUpdate(sql);
            System.out.println("Idea submitted! ");           
       }catch(Exception e){
           e.printStackTrace();
       }

       try{
           if(stmt!=null)
           stmt.close();
           if(conn!=null)
           conn.close();
       }catch(Exception e){
           e.printStackTrace();
       }
        
    }
    
}
