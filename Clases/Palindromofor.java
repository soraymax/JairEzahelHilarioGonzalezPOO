import java.util.*;

class Palindromofor{
    private String palabra;
    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public String cambiarPalabra(){
        String palabraCambiada = "";
        int longitud = palabra.length();
        while(longitud>0){
            palabraCambiada += palabra.charAt(longitud-1);
            longitud--;

        }
        return palabraCambiada;
    }

    public void evaluarPalabras(String palabra2){
        if(palabra.equalsIgnoreCase(palabra2)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }


    public static void main(String[] args){
        Palindromofor p = new Palindromofor();
        Scanner scanner = new Scanner(System.in);
        int opc=0;
        String aux="";
        int NLL;

        
            System.out.println("CUANTA LETRAS VOY A LEER");
            NLL = scanner.nextInt();

        for (int i=0; i<=NLL; i++){
        while (opc!=3){
            System.out.println("-----PALINDROMOS------");
            System.out.println("1 pedir palabra");
            System.out.println("2 evaluar palabra");
            System.out.println("3 salir");
            opc=scanner.nextInt();
        switch (opc) {
            case 1:

                    System.out.println("Introduco la palabra");
                    aux = scanner.next();
                break;
                
            case 2:
                    p.setPalabra(aux);
                    String cambiada = p.cambiarPalabra();
                    p.evaluarPalabras(cambiada);                    
                break;
            
            default:
                    System.out.println("ADIOS");
                break;
                }
            }
        }
    }
}