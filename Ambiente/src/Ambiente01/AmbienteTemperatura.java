
package Ambiente01;
import java.util.Scanner;

public class AmbienteTemperatura {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura actual del ambiente: ");
        double temperaturaUsuario = scanner.nextDouble();
        Ambiente sensor = new Ambiente (temperaturaUsuario);

        String mensaje = sensor.verificarTemperatura();
        System.out.println(mensaje);

        
        scanner.close();
    }
}

