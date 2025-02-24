
package Cajeroatumatico;
import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {
        
        cajeroatumatico cajero = new cajeroatumatico("Juan pablo Paez", "123456789", 5000.00);

       
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¡¡¡¡Bienvenido a tu cajero de confianzaaaa¡¡¡.");
            cajero.mostrarInformacion();
            
            
            System.out.print("Ingrese el monto que desea retirar: ");
            double montoRetiro = scanner.nextDouble();
            
            cajero.procesarRetiro(montoRetiro);
        }
    }
}
