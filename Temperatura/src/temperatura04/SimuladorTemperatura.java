
package temperatura04;

import java.util.Scanner;

public class SimuladorTemperatura{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa la temperatura actual (°C): ");
        double temperaturaUsuario = scanner.nextDouble();
        
        
        Temperatura sensor = new Temperatura(temperaturaUsuario);

        
        String mensaje = sensor.verificarTemperatura();
        System.out.println(mensaje);

        
        scanner.close();
    }
}


