package restaurante;
import java.util.ArrayList;

class Plato {
    String nombre;
    double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Bebida {
    String nombre;
    double precio;

    public Bebida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Pedido {
    ArrayList<Plato> platos = new ArrayList<>();
    ArrayList<Bebida> bebidas = new ArrayList<>();
    String metodoPago;

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato p : platos) total += p.precio;
        for (Bebida b : bebidas) total += b.precio;
        return total;
    }

    public double aplicarDescuento(double total) {
        if ("efectivo".equalsIgnoreCase(metodoPago)) {
            return total * 0.9; // 10% de descuento
        } else if ("tarjeta".equalsIgnoreCase(metodoPago)) {
            return total * 0.95; // 5% de descuento
        } else if ("cheque".equalsIgnoreCase(metodoPago)) {
            return total * 0.92; // 8% de descuento
        }
        return total;
    }
}
