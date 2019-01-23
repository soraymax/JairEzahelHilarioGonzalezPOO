import java.util.*;

public class estudiante{

    public long anioNacimiento;
    public long anioActual;
    public String nombre;
//metodos

    public long calcularEdad(){
        return anioActual-anioNacimiento;
    }
    public String verNombre(){
        return nombre;
    }

    public static void main(String[] args){
        estudiante Estudiante1 = new estudiante();
        Scanner scanner = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("COMO TE LLAMAS : ");
        Estudiante1.nombre = teclado.nextLine();

        System.out.println("EN QUE AÑO NACISTES : ");
        Estudiante1.anioNacimiento = scanner.nextLong();
        
        System.out.println("QUE AÑO ES ACTUALMENTE : ");
        Estudiante1.anioActual = scanner.nextLong();

        String nombre1 = Estudiante1.verNombre();
        System.out.println("HOLA " + nombre1);
        
        long edad = Estudiante1.calcularEdad();
        System.out.println("LA EDAD QUE TIENES ACTUALMENTE ES DE : " + edad);
       
    }
}