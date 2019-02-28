import java.util.*;

public class Calificaciones {

    private double promedio ;
    private int Ncal;


    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNcal(int ncal) {
        this.Ncal = ncal;
    }

    public int getNcal() {
        return Ncal;
    }

    
    
    public void calcularPromedio(double sumar){
        promedio = sumar/Ncal;
    }


    public static void main(String[] args){
        Calificaciones c = new Calificaciones();
        Scanner scanner = new Scanner(System.in);

        double sumatoria=0;
        
        System.out.println("CUANTAS CALIFICACIONES LEERE");
        int n = scanner.nextInt();
        c.setNcal(n);
        for(int i=0;i<=c.getNcal();i++){
            System.out.println("ingresa la calificacion"+(i+1));
            double aux = scanner.nextDouble();
            sumatoria= sumatoria+aux;
        }
        c.setPromedio(sumatoria);
        System.out.println("EL PROMEDIO TOTAL ES DE :"+c.getPromedio());

    }

} 