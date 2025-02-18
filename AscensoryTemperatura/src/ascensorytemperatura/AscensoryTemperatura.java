package ascensorytemperatura;

public class AscensoryTemperatura {
    private double temperaturaActual;
    private final double rangoMinimo = 18.0; 
    private final double rangoMaximo = 25.0; 
    private int pisoActual = 0;
    
    public AscensoryTemperatura(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }
    
   
    public boolean verificarTemperatura() {
        return temperaturaActual >= rangoMinimo && temperaturaActual <= rangoMaximo;
    }

    
    public String moverAscensor(int pisoDeseado) {
        if (verificarTemperatura()) {
            pisoActual = pisoDeseado;
            return "Tu piso es correcto y tu temperatura es adecuada, moviendo al piso " + pisoDeseado + ".";
        } else {
            return "!!!Error!!!! La temperatura no es adecuada.";
        }
    }
    
    public String estadoAscensor() {
        return "El ascensor se esta moviendo al piso " + pisoActual + ".";
    }
}
