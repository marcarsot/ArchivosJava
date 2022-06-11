
import java.util.Scanner;


public class Ejerwhile {
    public static void main (String args[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = leer.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exp = leer.nextInt();
        int resultado = 1;
        for(int i=1;i<=exp;i++)
            resultado = resultado * base;
        System.out.println("El resultado de:" +base+" elevado a "+ exp+", es: "+ resultado);
        
        
    }
    
}
