import java.util.*;

public class Operaciones2{
    
    private double nA;
    private double nB;

    
    public void setNA(double nA) {
        this.nA = nA;
    }
    
    public double getNA() {
        return nA;
    }

    public void setNB(double nB) {
        this.nB = nB;
    }

    public double getNB() {
        return nB;
    }    

    public double sumarAB(){
        return nA+nB;
    }

    public double restarAB(){
        return nA-nB;
    }
    public double multiplicarAB(){
        return nA*nB;
    }
    public double dividirAB(){
        return nA/nB;
    }

    
    public static void main(String[] args){
        Operaciones2 operaciones2 = new Operaciones2();
        Scanner scanner = new Scanner(System.in);
        int opc=0;
        System.out.println("dame el numero A");
        operaciones2.nA = scanner.nextDouble();
        System.out.println("dame el numero B");
        operaciones2.nB = scanner.nextDouble();
        while (opc!=4){
            System.out.println("1 SUMAR");
            System.out.println("2 RESTAR");
            System.out.println("3 MULTIPLICAR");
            System.out.println("4 DIVIDIR");
            opc=scanner.nextInt();
        switch (opc) {
            case 1:
                    System.out.println(operaciones2.sumarAB());
                break;
                
            case 2:      
                    System.out.println(operaciones2.restarAB());          
                break;
            
                
            case 3:
                    System.out.println(operaciones2.multiplicarAB());
                break;
        
            case 4:         
                    System.out.println(operaciones2.dividirAB());          
                break;
            default:
                    System.out.println("ADIOS");
                break;
            }
        }

    }
    //sumar,restar,multiplicar y dividir
}