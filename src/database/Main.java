package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
       final String DB_URL ="jdbc:mysql://localhost:3306/ideas";
       final String USERNAME = "root";
       final String PASSWORD ="13d53a?sheet";

       Connection conn =null;
       Statement stmt =null;

       try{
           conn = DriverManager.getConnection(DB_URL,USERNAME, PASSWORD);
           System.out.println("connection succesful");

           stmt = conn.createStatement();
           String sql = "INSERT INTO idea(name,)" +
                        "VALUES('sara')";
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
