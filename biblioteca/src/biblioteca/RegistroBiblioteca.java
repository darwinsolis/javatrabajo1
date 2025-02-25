
package biblioteca;
  import java.util.Scanner;


public class RegistroBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder registroLibros = new StringBuilder();  
        boolean continuar = true;

        
        while (continuar) {
            
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            
            System.out.print("Ingrese el numero de paginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); 

            
            Biblioteca libro = new Biblioteca(titulo, autor, paginas);

            
            registroLibros.append(libro.mostrarInformacion()).append("\n");

            
            System.out.print("¿Deseas registrar otro libro? (si/no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        
        System.out.println("\nLibros registrados:");
        System.out.println(registroLibros.toString());
        
        scanner.close();
    }
}


