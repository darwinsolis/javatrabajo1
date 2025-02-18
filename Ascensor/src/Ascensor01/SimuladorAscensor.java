package Ascensor01; 
import java.util.Scanner;  

public class SimuladorAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(500.0); 

        Scanner scanner = new Scanner(System.in);  

        System.out.print("Ingresa tu peso en kg: ");
        double pesoUsuario = scanner.nextDouble();

        System.out.print("Ingrese el piso al que desea ir: ");
        int pisoDestino = scanner.nextInt();

        ascensor.agregarPeso(pesoUsuario); 
        
        ascensor.moverAscensor(pisoDestino); 

        scanner.close(); 
    }
}
