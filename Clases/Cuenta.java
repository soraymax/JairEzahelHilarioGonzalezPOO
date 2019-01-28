import java.util.Scanner;
public class Cuenta{
    //atributos
    private String titular;
    private double cantidad;
    private double ingresar;
    private double retirar;
    private double operacion;

    //métodos
    public void ingresar(double cantidad){
        this.cantidad = this.cantidad + cantidad;
    }

    public void retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
    }

    public String toString(){
        return "Titular " + titular;
    }

    public double toCantidad(){
        if(ingresar>retirar){
            cantidad=ingresar-retirar;
            System.out.println("SALDO RESTANTE EN LA TARJETA: "+cantidad);
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
        return cantidad;
    }

    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public double getIngresar(){
        return ingresar;
    }
    public double getRetirar(){
        return retirar;
    }


    public void setRetirar(double retirar){
        this.retirar = retirar;
    }
    public void setIngresar(double ingresar){
        this.ingresar = ingresar;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre :");
        cliente1.titular = scanner.next();

        System.out.println("Ingresa la cantidad a agregar");
        cliente1.ingresar = scanner.nextDouble();

        System.out.println("Ingresa la cantidad a retirar");
        cliente1.retirar = scanner.nextDouble();

    
        System.out.println(cliente1.toString());
        System.out.println(cliente1.toCantidad());


        


    }
}