package suma;

public class Suma {

    private double sumaTotal;  

    public Suma() {
        this.sumaTotal = 0.0;  
    }

    public void agregarNumero(double numero) {
        this.sumaTotal += numero; 
    }

    public double getSumaTotal() {
        return sumaTotal;
    }

    public boolean esNumeroValido(String entrada) {
        try {
            
            Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            
            return false;
        }
    }
}
