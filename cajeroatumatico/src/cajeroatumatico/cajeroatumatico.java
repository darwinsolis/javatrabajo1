package Cajeroatumatico;

public class cajeroatumatico {

    private final String nombreTitular; 
    private final String numeroCuenta;   
    private double saldo;                

    
    public cajeroatumatico(String nombreTitular, String numeroCuenta, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

   
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: " + saldo);
    }

    
    public void procesarRetiro(double montoRetiro) {
        if (montoRetiro > saldo) {  
            System.out.println("Error: El monto a retirar es mayor que el saldo disponible.");
        } else if (montoRetiro <= 0) { 
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡Error¡¡¡¡¡¡¡¡¡¡¡¿: El monto a retirar debe ser mayor a cero.");
        } else {  
            saldo -= montoRetiro; 
            System.out.println("Retiro exitosoooo, vuelva prontooooo.");
            System.out.println("Saldo restante: " + saldo);
        }
    }
}