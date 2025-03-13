
package calculadoraimc;

import java.util.Scanner;

public class Main {
   
    public static double[] obtenerDatosUsuario() {
        Scanner scanner = new Scanner(System.in);
        double[] datos = new double[3];
        
        while (true) {
            try {
                System.out.print("Introduce tu peso en kg: ");
                datos[0] = scanner.nextDouble();
                System.out.print("Introduce tu altura en metros: ");
                datos[1] = scanner.nextDouble();
                
                if (datos[0] > 0 && datos[1] > 0) {
                    break;  
                } else {
                    System.out.println("Por favor, ingresa valores positivos.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingresa valores numericos validos.");
                scanner.next(); 
            }
        }
        return datos;
    }

    public static void main(String[] args) {
        // Obtener los datos del usuario
        double[] datos = obtenerDatosUsuario();
        double peso = datos[0];
        double altura = datos[1];

        CalculadoraIMC calculadora = new CalculadoraIMC(peso, altura);

        String resultado = calculadora.obtenerResultado();
        System.out.println(resultado);
    }
}
