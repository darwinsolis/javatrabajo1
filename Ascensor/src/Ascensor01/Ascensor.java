package Ascensor01;

public class Ascensor{
    private final double limitePeso; 
    private double pesoActual;  

   
    public Ascensor(double limitePeso) {
        this.limitePeso = limitePeso;
        this.pesoActual = 0;  
    }

    
    public void agregarPeso(double pesoUsuario) {
        this.pesoActual += pesoUsuario;
    }

    
    public boolean puedeMoverse() {
        return pesoActual <= limitePeso;
    }

    
    public void moverAscensor(int pisoDestino) {
        if (puedeMoverse()) {
            System.out.println("El ascensor se esta moviendo al piso " + pisoDestino + "...");
        } else {
            System.out.println("!!!!!!!ERROR!!!!!!! !El ascensor esta sobrecargado! No se puede mover.");
        }
    }
}