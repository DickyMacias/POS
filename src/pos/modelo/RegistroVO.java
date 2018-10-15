
package pos.modelo;


public class RegistroVO {
  
  private int id;
  private int folio;
  private int actividad;

  public RegistroVO() {
  }

  public RegistroVO(int id, int folio, int actividad) {
    this.id = id;
    this.folio = folio;
    this.actividad = actividad;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getFolio() {
    return folio;
  }

  public void setFolio(int folio) {
    this.folio = folio;
  }

  public int getActividad() {
    return actividad;
  }

  public void setActividad(int actividad) {
    this.actividad = actividad;
  }
  
  
  
}
