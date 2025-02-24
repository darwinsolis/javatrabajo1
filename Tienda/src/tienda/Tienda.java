package Tienda;

public class Tienda {
    private String tipo;
    private double precioBase;
    private double descuento;

   
    public Tienda(String tipo) {
        this.tipo = tipo;
        
        switch (tipo) {
            case "A" -> { 
                this.precioBase = 100;
                this.descuento = 0.10;
            }
            case "V" -> { 
                this.precioBase = 200;
                this.descuento = 0.05;
            }
            case "E" -> { 
                this.precioBase = 300;
                this.descuento = 0.0;
            }
            default -> {
                this.precioBase = 0;
                this.descuento = 0;
            }
        }
    }

    
    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    
    public double calcularCostoSinDescuento(int cantidad) {
        return precioBase * cantidad;
    }

    
    public double calcularCostoConDescuento(int cantidad) {
        return calcularCostoSinDescuento(cantidad) * (1 - descuento);
    }  
}
