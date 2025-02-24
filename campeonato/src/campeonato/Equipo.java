package campeonato;

public class Equipo {

    private final String nombre;  
    private int puntos; 

 
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;  
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public int getPuntos() {
        return puntos;
    }

       public void mostrarClasificacion() {
        System.out.println(nombre + " - Puntos: " + puntos);
    }
}
