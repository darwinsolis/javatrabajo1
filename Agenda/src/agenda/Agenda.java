
package agenda;

 import java.util.Scanner;
public class Agenda {
    
    private Contacto[] contactos;  
    private int contador;  
    
    public Agenda(int capacidad) {
        contactos = new Contacto[capacidad];  
        contador = 0;  
    }

   
    public void agregarContacto() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        
    
        System.out.print("Ingrese el número de teléfono del contacto: ");
        String telefono = scanner.nextLine();
        
        
        Contacto contacto = new Contacto(nombre, telefono);
        contactos[contador++] = contacto; 
    }

    public void mostrarAgenda() {
        System.out.println("\nLista de contactos registrados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(contactos[i]); 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Ingrese la cantidad maxima de contactos en la agenda: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();  
       
        Agenda agenda = new Agenda(capacidad);
        
        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            agenda.agregarContacto();
            System.out.print("¿¿¿Deseas agregar otro contacto???? (S/N): ");
            continuar = scanner.nextLine().charAt(0); 
        }
    
        agenda.mostrarAgenda();
        
        scanner.close();
    }
}


