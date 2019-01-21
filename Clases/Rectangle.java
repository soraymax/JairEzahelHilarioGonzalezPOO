import java.util.*;
public class Rectangle{
    //Atributos
    double area;
    double length;
    double perimeter;
    double width;
    //Metodos
    public void calcArea(){
        area = length*width;
    }

    public void calcPerimeter(){
        perimeter = 2*(length+width);
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setLength(double length){

    }
//en parentesis tiene un parametro en donde se retorna
    public void setWidth(double width){

    }

	public static void main(String[]args){
        //Rectangle rectangle1;
        //rectangle1 = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();

        rectangle1.width = 5.1d;
        rectangle2.width = 10.1d;
        rectangle3.width = 20.1d;
    
        rectangle1.length = 3.1d;
        rectangle2.length = 8.1d;
        rectangle3.length = 15.1d;

        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();

        System.out.println("El area del circulo 1 es de : "+rectangle1.getArea());
        System.out.println("El area del circulo 2 es de : "+rectangle2.getArea());
        System.out.println("El area del circulo 3 es de : "+rectangle3.getArea());

        
        rectangle1.calcPerimeter();
        rectangle2.calcPerimeter();
        rectangle3.calcPerimeter();

        System.out.println("El area del perimetro 1 es de : "+rectangle1.getPerimeter());
        System.out.println("El area del perimetro 2 es de : "+rectangle2.getPerimeter());
        System.out.println("El area del perimetro 3 es de : "+rectangle3.getPerimeter());
    }    

}