package cuentaregresiva;
import java.util.Scanner;

class CuentaRegresiva {
    // Atributo
    private int numero;

    // Constructor
    public CuentaRegresiva(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
            this.numero = -1;  // Valor inválido para indicar que no se puede hacer la cuenta regresiva
        }
    }

    // Método para iniciar la cuenta regresiva
    public void iniciarCuentaRegresiva() {
        if (numero > 0) {
            System.out.println("Comenzando la cuenta regresiva...");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("¡Tiempo cumplido!");
        } else {
            System.out.println("No se puede iniciar la cuenta regresiva porque el número ingresado no es válido.");
        }
    }
}


