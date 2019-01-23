import java.util.*;

public class operaciones{

    public double a;
    public double b;
//metodos
    public double sumarNumeros(){
        return a + b;
    }

    public double restarNumeros(){
        return a - b;
    }

    public double multiplicarNumeros(){
        return a * b;
    }


    public static void main(String[] args){
        operaciones operaciones1 = new operaciones();
        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMERO 1 : ");
        operaciones1.a = scanner.nextDouble();
        
        System.out.println("NUMERO 2 : ");
        operaciones1.b = scanner.nextDouble();


        double suma = operaciones1.sumarNumeros();
        System.out.println("EL RESULTADO DE SUMA: " + suma);

        double resta = operaciones1.restarNumeros();
        System.out.println("EL RESULTADO DE LA RESTA ES: " + resta);

        double multiplicar = operaciones1.multiplicarNumeros();
        System.out.println("EL RESULTADO ES DE: " + multiplicar);        
    
}