//Pojo para datos del usuario 
package pos.modelo;


public class UsuarioVO extends Persona {
  
  private int acceso;
  private String contrasena;

  public UsuarioVO() {
  }

  public UsuarioVO(int id, String nombre, int acceso, String contrasena) {
    super(id, nombre);
    this.acceso = acceso;
    this.contrasena = contrasena;
  }

  public int getAcceso() {
    return acceso;
  }

  public void setAcceso(int acceso) {
    this.acceso = acceso;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  
}
