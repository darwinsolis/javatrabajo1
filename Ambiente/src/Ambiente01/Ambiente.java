
package Ambiente01;
import java.util.Scanner;

public class Ambiente {
    private double temperaturaActual;
    private final double umbralAlerta = 50.0; 

   
    public Ambiente(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }


    public String verificarTemperatura() {
        if (temperaturaActual > umbralAlerta) {
            return "!!!!!ALERTA!!!!!.... La temperatura esta por encima de la temperatura adecuada.";
        } else {
            return "...La temperatura es normalll....";
        }
    }  
}

     

