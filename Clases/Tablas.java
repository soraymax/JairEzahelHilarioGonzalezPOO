import java.util.*;

public class Tablas{
    /**
     *
     */

    private static final int _10 = 10;

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int aux = 0;
        int opc = 0;
        do {
            System.out.println(
                    "Que tabla quieres multiplicar \n tabla 1 \n tabla 2 \n tabla 3 \n tabla 4 \n tabla 5 \n tabla 6 \n tabla 7 \n tabla 8 \n tabla 9 \n tabla 10");
            opc = numero.nextInt();
        } while (1 <= opc && opc <= 10);
        // while (opc!=10);
        switch (opc) {
        case 1:
            do {
                System.out.println(1 + "x" + aux + "=" + (1 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;

        case 2:
            do {
                System.out.println(2 + "x" + aux + "=" + (2 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 3:
            do {
                System.out.println(3 + "x" + aux + "=" + (3 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 4:
            do {
                System.out.println(4 + "x" + aux + "=" + (4 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 5:
            do {
                System.out.println(5 + "x" + aux + "=" + (5 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 6:
            do {
                System.out.println(6 + "x" + aux + "=" + (6 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 7:
            do {
                System.out.println(7 + "x" + aux + "=" + (7 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 8:
            do {
                System.out.println(8 + "x" + aux + "=" + (8 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 9:
            do {
                System.out.println(9 + "x" + aux + "=" + (9 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
        case 10:
            do {
                System.out.println(10 + "x" + aux + "=" + (10 * aux));
                aux = aux + 1;
            } while (aux <= 10);
            break;
                
                default:
                        System.out.println("ADIOS");
                    break;
                } 
            }
        }