import java.util.*;


public class Password{
    private int longitud;
    private String password;



    public void setPassword(String password){
        this.password = password;
    }    
    public String getPassword(){
        return password;
    }
    

    public void setLongitud(int longitud){
        this.longitud = longitud;
    }    
    public int getLongitud(){
        return longitud;
    }    
    public boolean esFuerte(){
        if (password.length()>8){
        return true;
        }else{
        return false;
        }
    }

    public static void main(String[] args) {
        Password newpassword = new Password();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cual es la contraseña");
        String password = scanner.next();
        newpassword.setPassword(password);

        if (newpassword.esFuerte()){
            System.out.println("ES FUERTE");
        }else{
            System.out.println("ES DEBIL");
        }
    }
}