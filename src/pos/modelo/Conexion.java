//Conexión a la BD con Singleton 
package pos.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;



public class Conexion {
  
  private static Conexion con;
  private Connection connection;

  private Conexion() throws ClassNotFoundException, SQLException {
    
    Class.forName("com.mysql.jdbc.Driver");
    
    connection = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/POS",
            "root",
            ""
    );
    
  }
  
  public static Conexion conectar() throws ClassNotFoundException, SQLException{
    
    if (con == null){
      
      con = new Conexion();
    
    }
  
    return con;
  }
  
  public Connection conect() {
    
   return connection; 
  }
  
}
