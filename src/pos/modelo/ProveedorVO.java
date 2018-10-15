package pos.modelo;


import pos.modelo.Persona;

//es un pojo que almacena datos
//
public class ProveedorVO extends Persona {
  
  private String telefono;

  public ProveedorVO() {
  }

  public ProveedorVO(String telefono) {
    this.telefono = telefono;
  }

  public ProveedorVO(int id, String nombre, String telefono) {
    super(id, nombre);
    this.telefono = telefono;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
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
