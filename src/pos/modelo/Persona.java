//Clase abstracta que hereda a cliente, proveedor y usuario.

package pos.modelo;

//Es abstracta porque es la clase padre y no se va implementar, solo hereda. 
public abstract class Persona {
  
  public int id;
  public String nombre;

  public Persona() {
  }
  

  public Persona(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
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
