import java.util.*;
public class Circle{
    //Atributos
    double area;
    double length;
    double perimeter;
    double width;
    //Metodos
    public void calcArea(){
        area = Math.PI * Math.pow((width / 2),2);
        //constantes siempre la primera con mayuscula
        //NOTA IMPORTANTE: invocacion de Math investigar como invocarlo
        //esta area de Math.PI invoca el pi o cualquier otro simbolo que tenga valor numerico
    }

    public void calcPerimeter(){
        perimeter = 2 * Math.PI * (width/2);
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setLength(double length){

    }

	public static void main(String[]args){
        //Cirle circle1;
        //circle1 = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.width = 5.2d;
        circle2.width = 10d;
        circle3.width = 20d;
    
        circle1.calcArea();
        circle2.calcArea();
        circle3.calcArea();

        System.out.println("El area del circulo 1 es de : "+circle1.getArea());
        System.out.println("El area del circulo 2 es de : "+circle2.getArea());
        System.out.println("El area del circulo 3 es de : "+circle3.getArea());

        
        circle1.calcPerimeter();
        circle2.calcPerimeter();
        circle3.calcPerimeter();

        System.out.println("El perimetro del circulo 1 es de : "+circle1.getPerimeter());
        System.out.println("El perimetro del circulo 2 es de : "+circle2.getPerimeter());
        System.out.println("El perimetro del circulo 3 es de : "+circle3.getPerimeter());
    }

}
