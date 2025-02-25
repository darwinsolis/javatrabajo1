package asistente;
import java.util.Scanner;

class IMCCalculadora {
    private double peso;
    private double altura;

    
    public IMCCalculadora(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    
    public double calcularIMC() {
        return peso / (altura * altura); 
    }

    
    public String determinarCategoriaIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
