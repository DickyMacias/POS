/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dicky
 */
public class ProductoDAO extends DAO<ProductoVO>{

  public ProductoDAO(Conexion conexion) {
    super(conexion);
  }

  @Override
  public void darAlta(ProductoVO obj) {
  
    try {
      indice = 1;
      ps = conexion.conect().prepareCall("insert into Producto values (?,?,?,?)");
      ps.setInt(indice++, obj.getId());
      ps.setString(indice++, obj.getNombre());
      ps.setFloat(indice++, obj.getPrecio());
      ps.setInt(indice++, obj.getExistencia());
      
      ps.execute();
      
      
    } catch (SQLException ex) {
      Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void darBaja(ProductoVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void modificar(ProductoVO obj) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ResultSet consultar(String storedProcedure) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
  
  
  
  
}
