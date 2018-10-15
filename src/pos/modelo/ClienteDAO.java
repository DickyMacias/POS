
package pos.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSet;

public class ClienteDAO extends DAO<ClienteVO>{

  public ClienteDAO(Conexion conexion) {
    super(conexion);
  }

  @Override
  public void darAlta(ClienteVO obj) {
    
    try { 
      indice = 1;
      ps = conexion.conect().prepareCall("Insert into cliente values (?,?,?)");
      ps.setInt(indice++, obj.getId());
      ps.setString(indice++, obj.getNombre());
      ps.setInt(indice++, obj.getTarjeta());
      
    } catch (SQLException ex) {
      
      Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
  }

  @Override
  public void darBaja(ClienteVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void modificar(ClienteVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResultSet consultar(String storedProcedure) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
  
  
  
  
  
}
