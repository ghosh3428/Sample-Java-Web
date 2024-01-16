
package DatabasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfig 
{
    public Connection getConnection() throws SQLException, ClassNotFoundException
    {
        
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/test";
        String user = "sa";
        String password="";
        
        return DriverManager.getConnection(url, user,password);
    }
    
}
