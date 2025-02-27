
package agenda;

public class Contacto {

    private String nombre;
    private String telefono;
    
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }
}
