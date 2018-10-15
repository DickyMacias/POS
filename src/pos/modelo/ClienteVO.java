//Es un objeto de valor para vincular al DAO y llamar a la BD
package pos.modelo;


public class ClienteVO extends Persona {
  
  private int tarjeta;

  public ClienteVO() {
  }


  public ClienteVO(int id, String nombre, int tarjeta) {
    super(id, nombre);
    this.tarjeta = tarjeta;
  }

  public int getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(int tarjeta) {
    this.tarjeta = tarjeta;
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
