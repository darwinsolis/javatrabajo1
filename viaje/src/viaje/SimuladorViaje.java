
package viaje;

import java.util.Scanner;

public class SimuladorViaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
         
            System.out.print("Ingrese la distancia total del viaje en kilometros: ");
            double distancia = scanner.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche en km/h: ");
            double velocidadPromedio = scanner.nextDouble();

            
            Viaje viaje = new Viaje(distancia, velocidadPromedio);

            
            viaje.mostrarTiempoEstimado();

            
            System.out.print("¿Desea hacer otro viaje? (si/no): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("!!!!!Gracias por usar el simulador de viajes!!!!!");
        scanner.close();
    }
}





