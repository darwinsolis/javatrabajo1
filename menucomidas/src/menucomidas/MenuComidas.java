
package menucomidas;

    public class MenuComidas {
    
    private String nombre;
    private double precio;

    
    public MenuComidas(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    
    public String mostrarInformacion() {
        return nombre + " - Precio: $" + precio;
    }
}


    
