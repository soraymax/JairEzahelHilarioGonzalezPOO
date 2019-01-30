import java.util.*;
import java.lang.Object;

public class Persona{

    private String nombre;
    private char sexo;
    private String rfc;
    private double altura;
    private double peso;
    private int edad;
    private boolean mayor;
    private int rest;


    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public String getNombre(){
        return nombre;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }    
    public char getSexo(){
        return sexo;
    }    
    
    public void setRfc(String rfc){
        this.rfc = rfc;
    }    
    
    public String getRfc(){
        return rfc;
    }    
    
    public void setAltura(double altura){
        this.altura = altura;
    }    
    
    public double getAltura(){
        return altura;
    }    
    
    public void setPeso(double peso){
        this.peso = peso;
    }    
    
    public double getPeso(){
        return peso;
    }    
    
    public void setEdad(int edad){
        this.edad = edad;
    }    
    
    public int getEdad(){
        return edad;
    }
    public int calcularImc(){
        double imc=peso/Math.pow(altura,2);
        int rest =0;
        if (imc <20){
            System.out.println("IMC BAJO");
            rest= -1;
        }else if(imc<=20 && imc>=25){
            System.out.println("IMC NORMAL");
            rest= 0;
        }else{
            System.out.println("IMC ALTO");
            rest= 1;
        }
        return rest;
    }

    public boolean esMayorEdad(){
        boolean mayor = false;
        if (edad>=18){
            System.out.println("ES MAYOR DE EDAD");
            mayor=true;
        }else{
            System.out.println("ES MENOR DE EDAD");
            mayor=false;
        }
        return mayor;
    }
    
    public String toString(){
    String mensaje = "Nombre: "+nombre+
                            "\nSexo: "+ sexo+
                            "\nRFC: "+ rfc+
                            "\nPeso: "+ peso+
                            "\nAltura: "+ altura+
                            "\nEdad: "+ edad+
                            "\n¿Mayor de edad?: "+ mayor+
                            "\nIMC: "+rest;
                            return mensaje;
    }

    public static void main(String[] args) {
        Persona humano = new Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre");
        String nombre = scanner.next();
        humano.setNombre(nombre);

        System.out.println("Cual es tu sexo");
        String s = scanner.next();
        humano.setSexo(s.charAt(0));
        
        System.out.println("cual es tu RFC");
        String rfc = scanner.next();
        humano.setRfc(rfc);
        
        System.out.println("Cual es tu peso");
        Double peso = scanner.nextDouble();
        humano.setPeso(peso);

        System.out.println("Cual es tu altura");
        Double altura = scanner.nextDouble();
        humano.setAltura(altura);
        
        System.out.println("Cual es tu edad");
        int edad = scanner.nextInt();
        humano.setEdad(edad);

        
        System.out.println(humano.toString());

    }


}