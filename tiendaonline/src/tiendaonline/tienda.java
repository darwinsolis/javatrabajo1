
package tiendaonline;
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();  

        Scanner scanner = new Scanner(System.in);
        boolean continuarCompra = true;

        while (continuarCompra) {
            try {
                
                System.out.print("Ingresa el precio del producto: $");
                double precio = scanner.nextDouble();

                System.out.print("Ingresa la cantidad que deseas comprar: ");
                int cantidad = scanner.nextInt();

                
                tienda.agregarProducto(precio, cantidad);

                
                System.out.print("¿Deseas agregar otro producto? (si/no): ");
                String respuesta = scanner.next().toLowerCase();

                if (!respuesta.equals("si")) {
                    continuarCompra = false;  
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingresa valores validos.");
                scanner.nextLine();  
            }
        }

        tienda.mostrarTotal();

        scanner.close();  
    }
}


