
package cuentaregresiva;
import java.util.Scanner;
public class SimuladorCuentaRegresiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero positivo para la cuenta regresiva: ");
        int numero = scanner.nextInt();

        // Crear un objeto de la clase CuentaRegresiva
        CuentaRegresiva cuenta = new CuentaRegresiva(numero);

        // Iniciar la cuenta regresiva
        cuenta.iniciarCuentaRegresiva();

        scanner.close();
    }
}

