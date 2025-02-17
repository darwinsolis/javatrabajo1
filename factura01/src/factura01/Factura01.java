
package factura01;

public final class Factura01 {

    private String nombreCliente;
    private String cedula;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean esEstudiante;
    private char tipoCliente;
    private final double total;

  
    public Factura01(String nombreCliente, String cedula, String producto, int cantidad, double precioUnitario, boolean esEstudiante, char tipoCliente) {
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
        this.total = calcularTotal(); 
    }

   
    public double calcularTotal() {
        double total = precioUnitario * cantidad;  
        if (esEstudiante) {
            total *= 0.90;         }
        return total;
    }

    
    public void mostrarFactura() {
        System.out.println("\n---- Factura de Compra ----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cédula: " + cedula);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("¿Es estudiante?: " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Total a Pagar: $" + total);
    }

    public double getTotal() {
        return total;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
