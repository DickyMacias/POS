//
package pos.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public abstract class DAO<T> {
  
  protected int indice;
  protected PreparedStatement ps;
  protected ResultSet rs;
  protected Conexion conexion;

  public DAO(Conexion conexion) {
    this.conexion = conexion;
  }
  
  public abstract void darAlta(T obj);
  public abstract void darBaja(T obj);
  public abstract void modificar(T obj);
  public abstract ResultSet consultar(String storedProcedure);
  
  
}
