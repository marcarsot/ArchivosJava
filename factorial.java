
import java.util.Scanner;

public class factorial {
     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero ; //numero a calcular
        int factorial =1;//almacenar numero final
        
        System.out.println("Ingrese numero para calcular su factorial: ");
        numero = leer.nextInt();
        int numero1 = numero;
        //
        while(numero != 0){
            
            factorial *= numero;
            numero --; // se decrementa pq factorial multiplica hacia atras
            
        }
        System.out.println("El factorial de: "+numero1+ " es "+ factorial);
        
    }
    

}
