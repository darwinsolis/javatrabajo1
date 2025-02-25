
package restaurante;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Plato[] platos = {
            new Plato("Pizza Margherita", 12.50),
            new Plato("Pasta Carbonara", 10.00),
            new Plato("Ensalada César", 8.50)
        };
        
        Bebida[] bebidas = {
            new Bebida("Coca Cola", 2.50),
            new Bebida("Agua Mineral", 1.50),
            new Bebida("Jugo de Naranja", 3.00)
        };

        Pedido pedido = new Pedido();

        // Seleccionar platos
        System.out.println("Seleccione los platos:");
        for (int i = 0; i < platos.length; i++) {
            System.out.println((i + 1) + ". " + platos[i].nombre + " - $" + platos[i].precio);
        }
        System.out.println("Ingrese el número de plato que desea (0 para terminar):");
        int opcionPlato;
        while ((opcionPlato = sc.nextInt()) != 0) {
            if (opcionPlato >= 1 && opcionPlato <= platos.length) {
                pedido.agregarPlato(platos[opcionPlato - 1]);
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println("Seleccione otro plato o ingrese 0 para terminar:");
        }

        // Seleccionar bebidas
        System.out.println("Seleccione las bebidas:");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println((i + 1) + ". " + bebidas[i].nombre + " - $" + bebidas[i].precio);
        }
        System.out.println("Ingrese el número de bebida que desea (0 para terminar):");
        int opcionBebida;
        while ((opcionBebida = sc.nextInt()) != 0) {
            if (opcionBebida >= 1 && opcionBebida <= bebidas.length) {
                pedido.agregarBebida(bebidas[opcionBebida - 1]);
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println("Seleccione otra bebida o ingrese 0 para terminar:");
        }

        // Seleccionar método de pago
        System.out.println("Ingrese el método de pago (efectivo, tarjeta, cheque):");
        sc.nextLine();  // Limpiar el buffer
        String metodoPago = sc.nextLine();
        pedido.setMetodoPago(metodoPago);

        // Mostrar resumen del pedido
        double total = pedido.calcularTotal();
        double totalConDescuento = pedido.aplicarDescuento(total);
        System.out.println("\n----- Resumen del Pedido -----");
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Total con descuento: $" + totalConDescuento);
        
        sc.close();
    }
}


