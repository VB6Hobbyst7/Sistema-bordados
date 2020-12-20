
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class coneccion {
    Connection con;
            
    public coneccion(){
        try {
            Class.forName("con.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema","root","28362000");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("error" + e);
            
        }
        
    }
    
}
