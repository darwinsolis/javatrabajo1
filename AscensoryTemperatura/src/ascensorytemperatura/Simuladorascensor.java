
package ascensorytemperatura;

import java.util.Scanner;

public class Simuladorascensor {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Ingresa la temperatura actual: ");
        double temperaturaUsuario = scanner.nextDouble();


        AscensoryTemperatura ascensor = new AscensoryTemperatura(temperaturaUsuario);

       
        if (!ascensor.verificarTemperatura()) {
            System.out.println("La temperatura no es adecuada para mover el ascensor.");
        } else {
            
            System.out.print("Ingresa el numero del piso al que deseas ir: ");
            int pisoDeseado = scanner.nextInt();

         
            if (pisoDeseado < 0) {
                System.out.println("!!!Error!!!! El numero del piso no es valido.");
            } else {
              
                String resultado = ascensor.moverAscensor(pisoDeseado);
                System.out.println(resultado);
            }
        }

       
        System.out.println(ascensor.estadoAscensor());

       
        scanner.close();
    }
}
