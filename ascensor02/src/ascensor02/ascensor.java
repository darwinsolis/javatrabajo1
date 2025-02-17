package ascensor02;
import java.util.Scanner;

public class ascensor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pisoMinimo = 1;
            int pisoMaximo = 10;
            int pisoActual = 1;
            
            System.out.println("Bienvenido al sistema del ascensor.");
            System.out.println("El ascensor se encuentra actualmente en el piso " + pisoActual + ".");
            
            
            System.out.print("Ingrese el piso al que desea ir (del " + pisoMinimo + " al " + pisoMaximo + "): ");
            int pisoDeseado = scanner.nextInt();
            
            
            if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
              
                System.out.println("El ascensor se mueve al piso " + pisoDeseado + ".");
                pisoActual = pisoDeseado;
                System.out.println("Ahora estás en el piso " + pisoActual + ".");
            } else {
              
                System.out.println("Error: El piso " + pisoDeseado + " no es válido. Los pisos válidos son del " + pisoMinimo + " al " + pisoMaximo + ".");
            }
        }
    }
}
