package campeonato;
import java.util.Scanner;

public class Campeonato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Equipo equipo1 = new Equipo("Equipo Realmadrid");
        Equipo equipo2 = new Equipo("Equipo Barcelona");

        
        System.out.print("Resultado del partido ha (ganado/perdido/empate): ");
        String resultado = scanner.nextLine().toLowerCase();

       
        switch (resultado) {
            case "ganado" -> {
                equipo1.agregarPuntos(3); 
                System.out.println(equipo1.getNombre() + " ha ganado!");
                System.out.println("Puntos otorgados a " + equipo1.getNombre() + ": 3 puntos.");
            }
            case "perdido" -> {
                equipo2.agregarPuntos(3);
                System.out.println(equipo2.getNombre() + " ha ganado!");
                System.out.println("Puntos otorgados a " + equipo2.getNombre() + ": 3 puntos.");
            }
            case "empate" -> {
                equipo1.agregarPuntos(1); 
                equipo2.agregarPuntos(1);
                System.out.println("El partido terminó en empate.");
                System.out.println("Puntos otorgados a ambos equipos: 1 punto cada uno.");
            }
            default -> {
                System.out.println("Resultado no válido. Intente de nuevo.");
                return; 
            }
        }

        
        System.out.println("\nClasificación actual:");
        equipo1.mostrarClasificacion();
        equipo2.mostrarClasificacion();

        // Cerrar el scanner
        scanner.close();
    }
}
