import java.util.*;

public class Operacion{
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;

    
    public double setCal1(double cal1){
        return this.cal1 = cal1;
    }  

    
    public double setCal2(double cal2){
        return this.cal2 = cal2;
    } 
    
    public double setCal3(double cal3){
        return this.cal3 = cal3;
    } 

    public double promedio(){
        return promedio=(cal1+cal2+cal3)/3;
    }

    
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cual es la calificacion 1: ");
        double cal1 = scanner.nextDouble();
        operacion.setCal1(cal1);

        
        System.out.println("Cual es la calificacion 2: ");
        double cal2 = scanner.nextDouble();
        operacion.setCal2(cal2);
        
        
        System.out.println("Cual es la calificacion 3: ");
        double cal3 = scanner.nextDouble();
        operacion.setCal3(cal3);
        
        
        System.out.println(operacion.promedio());

    }
}


