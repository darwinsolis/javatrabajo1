
package calculadoraimc;

public class CalculadoraIMC {
 
    private double peso;
    private double altura;

    
    public CalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return Math.round((peso / (altura * altura)) * 100.0) / 100.0;
    }

    public String determinarCategoria() {
        double imc = calcularIMC();
        if (imc > 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc > 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    
    public String obtenerResultado() {
        double imc = calcularIMC();
        String categoria = determinarCategoria();
        return "Tu IMC es " + imc + ", lo cual indica: " + categoria;
    }
}

