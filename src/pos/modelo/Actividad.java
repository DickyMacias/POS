
package pos.modelo;


public abstract class Actividad {

public int folio;
public float total;
public int articulos;

  public Actividad() {
  }

  public Actividad(int folio, float total, int articulos) {
    this.folio = folio;
    this.total = total;
    this.articulos = articulos;
  }

  public int getFolio() {
    return folio;
  }

  public void setFolio(int folio) {
    this.folio = folio;
  }

  public float getTotal() {
    return total;
  }

  public void setTotal(float total) {
    this.total = total;
  }

  public int getArticulos() {
    return articulos;
  }

  public void setArticulos(int articulos) {
    this.articulos = articulos;
  }

  



}
