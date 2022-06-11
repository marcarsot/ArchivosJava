
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NumPar {
    public static void main(String args[]){
        Scanner numeros = new Scanner(System.in);
        //vamos a crear 2 array una para pares y otra para impares
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        //creamos 2 variables list y num
        int list, num;
        //se inicializan variables 
        int numPar=0;
        int numImpar=0;
        
        //pedimos informacion por teclado
        System.out.println("Ingrese cantidad de numeros a evaluar: ");
        list=numeros.nextInt();
        //creamos un for para recorrer los numeros ingreados
        //para cada numero ingresado que este dentro de la lista
        for(int i=1 ; i < list; i ++){
            System.out.println("Ingrese el numero:"+ i);
            num = numeros.nextInt();
            //si diferncia en division del nro es equivalenta a cero se agrega 
            // a lista par sino(else)se agrega a lista de impares
            if( num % 2 == 0){
                par.add(num);
                //sumaPar = sumaPar + par.get(i);
                numPar=numPar+1;
                
            }else{
                impar.add(num);
                //sumaImpar = sumaImpar+ impar.get(i);
                numImpar=numImpar+1;
            }
            
           
            
                     
    }
        System.out.println("Los par son los numeros:"+ par+ " y los impar son: "+ impar);
        System.out.println("Los numeros par son:"+ numPar + " y los impar son:"+ numImpar);
    }
    
}
