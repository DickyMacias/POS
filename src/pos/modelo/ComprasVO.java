
package pos.modelo;


public class ComprasVO extends Actividad {
  
  private int proveedor;

  public ComprasVO() {
  }

  public ComprasVO(int folio, float total, int articulos, int proveedor) {
    super(folio, total, articulos);
    this.proveedor = proveedor;
  }

  public int getProveedor() {
    return proveedor;
  }

  public void setProveedor(int proveedor) {
    this.proveedor = proveedor;
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
