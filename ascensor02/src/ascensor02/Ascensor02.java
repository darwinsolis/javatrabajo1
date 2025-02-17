
    
package ascensor02;
import java.util.Scanner;
public class Ascensor02 {
 
    private static final int PISO_MINIMO = 1;
    private static final int PISO_MAXIMO = 10;
    private static int pisoActual = 1;

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema del ascensor.");
        System.out.println("El ascensor se encuentra actualmente en el piso " + pisoActual + ".");

       
        moverAscensor(scanner);
        
        scanner.close();
    }

    // Método privado para manejar la lógica del movimiento del ascensor
    private static void moverAscensor(Scanner scanner) {
        System.out.print("Ingrese el piso al que desea ir (del " + PISO_MINIMO + " al " + PISO_MAXIMO + "): ");
        int pisoDeseado = scanner.nextInt();

        // Validar si el piso deseado está en el rango válido
        if (pisoDeseado >= PISO_MINIMO && pisoDeseado <= PISO_MAXIMO) {
            System.out.println("El ascensor se mueve al piso " + pisoDeseado + ".");
            pisoActual = pisoDeseado;
            System.out.println("Ahora estás en el piso " + pisoActual + ".");
        } else {
            System.out.println("Error: El piso " + pisoDeseado + " no es válido. Los pisos válidos son del " + PISO_MINIMO + " al " + PISO_MAXIMO + ".");
        }
    }
}


