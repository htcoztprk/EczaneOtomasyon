
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    
    public  Connection connect(){
        Connection c=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/eczane?user=root&password=");
            System.out.println("Basarılı");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());    
        }
        
        return c;
    }
}