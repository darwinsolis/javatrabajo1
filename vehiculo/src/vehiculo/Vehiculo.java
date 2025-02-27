package vehiculo;
public class Vehiculo {
   
    private String placa;
    private String horaIngreso;
    
    public Vehiculo(String placa, String horaIngreso) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getHoraIngreso() {
        return horaIngreso;
    }
    
    public String toString() {
        return "Placa: " + placa + ", Hora de Ingreso: " + horaIngreso;
    }
}
