
package asistente;
import java.util.Scanner;

public class AsistenteNutricionista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese su peso en kilogramos (kg): ");
        double peso = sc.nextDouble();

        
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

       
        if (altura <= 0) {
            System.out.println("¡¡¡¡¡Error¡¡¡¡¡: La altura debe ser mayor .");
            return;
        }

        if (peso <= 0) {
            System.out.println("¡¡¡¡¡Error¡¡¡¡¡: El peso debe ser mayor.");
            return;
        }

        // Crear el objeto IMCCalculadora
        IMCCalculadora calculadora = new IMCCalculadora(peso, altura);

        // Calcular el IMC
        double imc = calculadora.calcularIMC();
        System.out.println("Su IMC es: " + imc);

        // Mostrar la categoría del IMC
        String categoria = calculadora.determinarCategoriaIMC();
        System.out.println("Categoría de IMC: " + categoria);

        sc.close();
    }
}
