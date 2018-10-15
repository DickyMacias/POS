
package pos.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProveedorDAO extends DAO<ProveedorVO>{

  public ProveedorDAO(Conexion conexion) {
    super(conexion);
  }

  @Override
  public void darAlta(ProveedorVO obj) {
    try {
      indice = 1;
      ps = conexion.conect().prepareCall("insert into proveedor values (?,?)");
      ps.setInt(indice++, obj.getId());
      ps.setString(indice++, obj.getNombre());
      
    } catch (SQLException ex) {
      
      Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void darBaja(ProveedorVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void modificar(ProveedorVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResultSet consultar(String storedProcedure) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
  
}
