
package Tienda;
import java.util.Scanner;
public class Producto {
    public static void main(String[] args) {

        double precioA = 100; 
        double precioV = 200; 
        double precioE = 300; 

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el tipo de producto (A: Alimentos, V: Vestimenta, E: Electronicos): ");
            char tipoProducto = scanner.next().charAt(0);
            
            
            while (tipoProducto != 'A' && tipoProducto != 'V' && tipoProducto != 'E') {
                System.out.println("Tipo de producto no válido. Ingrese A, V o E.");
                System.out.print("Ingrese el tipo de producto (A: Alimentos, V: Vestimenta, E: Electronicos): ");
                tipoProducto = scanner.next().charAt(0); 
            }
            
            
            int cantidad;
            do {
                System.out.print("Ingrese la cantidad de unidades: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor ingrese un numero valido.");
                    scanner.next();
                }
                cantidad = scanner.nextInt();
            } while (cantidad <= 0);
            
            
            double precioBase = 0;
            double descuento = 0;
            
            
            switch (tipoProducto) {
                case 'A' -> {
                    precioBase = precioA;
                    descuento = 0.10;
                }
                case 'V' -> {
                    precioBase = precioV;
                    descuento = 0.05;
                }
                case 'E' -> {
                    precioBase = precioE;
                    descuento = 0.0;
                }
            }
            
            
            double costoSinDescuento = precioBase * cantidad;
            double costoConDescuento = costoSinDescuento * (1 - descuento);
            
            System.out.printf("Costo sin descuento: $%.2f%n", costoSinDescuento);
            System.out.printf("Costo con descuento: $%.2f%n", costoConDescuento);
        }
    }
}
