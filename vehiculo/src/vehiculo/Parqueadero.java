package vehiculo;

import java.util.Scanner;

public class Parqueadero {
    
    private Vehiculo[] vehiculos;
    private int contador;

    public Parqueadero(int cantidad) {
        vehiculos = new Vehiculo[cantidad]; 
        contador = 0;
    }

    // Método para registrar vehículos
    public void registrarVehiculos(int cantidad) {
        Scanner scanner = new Scanner(System.in);
      
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la placa del vehículo #" + (i + 1) + ": ");
            String placa = scanner.nextLine();
   
            System.out.print("Ingrese la hora de ingreso del vehículo #" + (i + 1) + " (formato HH:MM): ");
            String horaIngreso = scanner.nextLine();
      
            Vehiculo vehiculo = new Vehiculo(placa, horaIngreso);
            vehiculos[contador++] = vehiculo; 
        }
    }

    public void mostrarResumen() {
        System.out.println("\nResumen de vehículos registrados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(vehiculos[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de vehículos que ingresaran al parqueadero: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  
        
        Parqueadero parqueadero = new Parqueadero(cantidad);
        
        parqueadero.registrarVehiculos(cantidad);
     
        parqueadero.mostrarResumen();
        
        scanner.close();
    }
}
