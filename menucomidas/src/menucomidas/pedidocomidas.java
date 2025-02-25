
package menucomidas;
import java.util.Scanner;


public class pedidocomidas {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPedido = 0.0;  
        boolean continuar = true;

        
        MenuComidas[] menu = {
            new MenuComidas("Hamburguesa", 5.500),
            new MenuComidas("Papas fritas", 2.300),
            new MenuComidas("Refresco", 2.000),
            new MenuComidas("Pizza", 8.000),
            new MenuComidas("Hot Dog", 10.00)
        };

       
        while (continuar) {
           
            System.out.println("Menu de Comidas Rapidas:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].mostrarInformacion());
            }

       
            System.out.print("\nSeleccione el nunmero del producto que desea agregar al pedido (0 para finalizar): ");
            int opcion = scanner.nextInt();
            
            if (opcion == 0) {
                continuar = false;
            } else if (opcion > 0 && opcion <= menu.length) {
                
                totalPedido += menu[opcion - 1].getPrecio();
                System.out.println("¡¡¡¡Producto agregado!!!! Total hasta ahora: $" + totalPedido);
            } else {
                System.out.println("Opcion no valida. Intente nuevamente.");
            }

           
            System.out.print("\n¿Desea agregar mas productos al pedido? (si/no): ");
            scanner.nextLine();  
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        
        System.out.println("\nTotal de su pedido: $" + totalPedido);
        System.out.println("¡MUCHA GRACIAS POR TU COMPRAA! ¡DIOS LO BENDIGA!");
        
        scanner.close();
    }
}


