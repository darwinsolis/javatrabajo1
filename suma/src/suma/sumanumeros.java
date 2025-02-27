
package suma;
 import java.util.Scanner;

public class sumanumeros {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suma suma = new Suma(); 
        boolean seguirIngresando = true;

        System.out.println("!!!Bienvenido al programa de suma conmigoo jaja !!!!");

      
        while (seguirIngresando) {
            System.out.print("Ingrese un numero (o 'fin' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                seguirIngresando = false;
            } else if (suma.esNumeroValido(entrada)) {
            
                double numero = Double.parseDouble(entrada);
                suma.agregarNumero(numero);
            } else {
           
                System.out.println("!!!!Entrada no valida!!!! Por favor ingrese un numero.");
            }
        }

        System.out.println("La suma total de los números ingresados es: " + suma.getSumaTotal());

        scanner.close();
    }
}


