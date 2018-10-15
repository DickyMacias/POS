
package pos.modelo;


public class VentasVO extends Actividad {
  
  private int cliente;

  public VentasVO() {
  }

  public VentasVO(int cliente) {
    this.cliente = cliente;
  }

  public VentasVO(int folio, float total, int articulos, int cliente) {
    super(folio, total, articulos);
    this.cliente = cliente;
  }

  public int getCliente() {
    return cliente;
  }

  public void setCliente(int cliente) {
    this.cliente = cliente;
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
