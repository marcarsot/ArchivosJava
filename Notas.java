
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Notas {
    public static void main (String args[]){
        Scanner leer = new Scanner(System.in);
        List<Float> listaNotas = new ArrayList<>();
        
        Integer cantNotas, indicador;
        
        float suma = 0;
        float promedio = 0;
        
        System.out.println("Ingrese la cantidad de Notas a promediar:");
        cantNotas = leer.nextInt();
        
        for(int i = 0; i < cantNotas ; i++){
            indicador = i+1 ;
                        
            System.out.println("Ingrese la nota numero:"+ indicador);
            //en el listado de notas se agregan las notas ingresadas      
            listaNotas.add(leer.nextFloat());
            
            suma = suma + listaNotas.get(i);
            promedio = suma / listaNotas.size();
                
    }
        System.out.println("El promedio de Notas ingresadas es:"+ promedio);
        if(promedio<=3.96){
            System.out.println("Reprobado");
        }else{
            System.out.println("Aprobado");
        }
       
        
                
    }
    
}
