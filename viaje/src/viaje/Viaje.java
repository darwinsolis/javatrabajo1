
package viaje;

import java.util.Scanner;

    
 
class Viaje {
    
    private double distancia;
    private double velocidadPromedio;
    private double tiempoEstimado;

    public Viaje(double distancia, double velocidadPromedio) {
        this.distancia = distancia;
        this.velocidadPromedio = velocidadPromedio;
        this.tiempoEstimado = calcularTiempo();
    }

    
    private double calcularTiempo() {
        return distancia / velocidadPromedio;
    }

    
    public void mostrarTiempoEstimado() {
        System.out.println("El tiempo estimado de viaje es: " + tiempoEstimado + " horas.");
    }
}

