
package tiendaonline;

  public class TiendaOnline {
    private double totalCompra;

    
    public TiendaOnline() {
        this.totalCompra = 0; 
    }

    
    public void agregarProducto(double precio, int cantidad) {
        double costoProducto = precio * cantidad;
        totalCompra += costoProducto;
        System.out.println("Producto agregado: " + cantidad + " unidades a " + precio + " cada una. Costo total de este producto: " + costoProducto);
    }

    
    public void mostrarTotal() {
        System.out.println("El costo total de tu compra es: " + totalCompra);
    }
}


    

