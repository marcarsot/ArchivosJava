
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Promedio {
    public static void main(String args[]){
            Scanner leer = new Scanner(System.in);
            List<Double> listaNotas = new ArrayList<>();
        
        Integer cantNotas, indicador;
        
        double nota;
        double suma=0;
        double promedio=0;
        System.out.println("***** Programa Calculo Promedio **** \n*** Notas deben ser entre 2 y 7 ***");
               
        System.out.println("Ingrese la cantidad de Notas a promediar:");
        cantNotas = leer.nextInt();
        
        for(int i = 0; i < cantNotas ; i++){
            indicador = i+1 ;
                        
            System.out.println("Ingrese la nota numero:"+ indicador);
           
            nota = leer.nextDouble();
           
            if (nota < 2.0 || nota > 7.0){
                System.out.println("Nota no valida, favor reingresar nota: "+ indicador);
                nota = leer.nextDouble();
            
                while(nota < 2.0 || nota > 7.0){
                    System.out.println("Nota no valida, favor reingresar nota: "+ indicador);
                    nota = leer.nextDouble();
                }
                //si se cumple el while se agrega la nota al listado
                listaNotas.add(nota);
            // si se cumple el if se agrega la nota al listado de notas
            }else{
                listaNotas.add(nota);
            }
          
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

