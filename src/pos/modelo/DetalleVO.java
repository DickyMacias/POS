
package pos.modelo;


public class DetalleVO {
  
  private int id;
  private ProductoVO producto[];
  private float precio;

  public DetalleVO() {
  }

  public DetalleVO(int id, ProductoVO[] producto, float precio) {
    this.id = id;
    this.producto = producto;
    this.precio = precio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ProductoVO[] getProducto() {
    return producto;
  }

  public void setProducto(ProductoVO[] producto) {
    this.producto = producto;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }
  
  
  
}
