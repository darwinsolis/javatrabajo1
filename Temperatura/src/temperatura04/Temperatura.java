
package temperatura04;

public class Temperatura {
    
    private double temperaturaActual;
    private final double rangoMinimo = 18.0;
    private final double rangoMaximo = 25.0;

    
    public Temperatura(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }


    public String verificarTemperatura() {
        if (temperaturaActual >= rangoMinimo && temperaturaActual <= rangoMaximo) {
            return "La temperatura es adecuada.....";
        } else {
            return "!!!!Error!!!!!....La temperatura esta fuera del rango deseado....";
        }
    }
}

  
    

