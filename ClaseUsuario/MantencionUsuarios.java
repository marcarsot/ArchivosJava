package ClaseUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MantencionUsuarios {
    

        public static void main(String[] args) {
        //para leer datos por teclado
        Scanner leer = new Scanner(System.in);
        //crear una lista para guardar usuarios
        List<Usuario> usuarios = new ArrayList<>();
        
        System.out.println( "Digite cantidad de usuarios a ingresar: ");
        //creamos variable cantidad de usuarios e indicador
        Integer indicador;
        Integer cantUsuarios = leer.nextInt();
        //se recorre la cantidad para agregar a lista
        for(int i = 0; i <cantUsuarios; i++){
            indicador = i+1;
            if (cantUsuarios>10){
                System.out.println("Cantidad excede maximo de '10', favor reingresar: ");
                cantUsuarios=leer.nextInt();
                while(cantUsuarios>10){
                    System.out.println("Cantidad excede maximo '10', favro reingresar: ");
                    cantUsuarios=leer.nextInt();
                }

            }else{
                Usuario usu= new Usuario();
            }
            
            Usuario usu = new Usuario();
            
            System.out.println("Digite el 'Id' del Usuario:"+ indicador);
            Integer Id = leer.nextInt();
            usu.setId(Id); //lo obtengo de clase Usuario
            System.out.println("Digite el Nombre del Usuario:"+indicador);
            String nombre = leer.next();
            usu.setNombre(nombre);
            leer.nextLine(); //para que salte linea
            System.out.println("Digite el Apellido del Usuario:"+ indicador);
            String apellido = leer.next();
            usu.setApellido(apellido);
            leer.nextLine();
            System.out.println("Digite el Rut del Usuario:"+ indicador);
            String rut = leer.next();
            usu.setRut(rut);
            leer.nextLine();
            System.out.println("Digite la edad del Usuario:"+ indicador);
            Integer edad = leer.nextInt();
            usu.setEdad(edad);
            leer.nextLine();
            System.out.println("Digite e-mail del Usuario:"+ indicador);
            String correo = leer.next();
            usu.setCorreo(correo);
            leer.nextLine();
            usuarios.add(usu);
            
                     
        }
        System.out.println("Cantidad de Usuarios ingresados:"+ cantUsuarios+ ",lista Datos: ");
        for(Usuario usuario:usuarios){
            System.out.println(usuario.toString());
                         
        }
        
        System.out.println("Necesita editar algun registro?, digite 'S' para si o 'N' para no:");
        String respEditar = leer.nextLine();
        if(respEditar.toUpperCase().equals("S")){
            System.out.println("Digite la posicion que necesita editar");
            Integer posicion = leer.nextInt();
            
            System.out.println("Digite el nuevo 'Id' :");
            Integer nuevoId = leer.nextInt();
            usuarios.get(posicion).setId(nuevoId);
            
            System.out.println("Digite el nuevo Nombre:");
            String nuevoNombre = leer.next();
            usuarios.get(posicion).setNombre(nuevoNombre);
            
            System.out.println("Digite el nuevo Apellido");
            String nuevoApellido = leer.next();
            usuarios.get(posicion).setApellido(nuevoApellido);
            
            System.out.println("Digite el nuevo RUT:");
            String nuevoRut=leer.next();
            usuarios.get(posicion).setRut(nuevoRut);
            
            System.out.println("Digite edad a corregir:");
            Integer nuevaEdad= leer.nextInt();
            usuarios.get(posicion).setEdad(nuevaEdad);
            
            System.out.println("Digite nuevo correo:");
            String nuevoCorreo=leer.next();
            usuarios.get(posicion).setCorreo(nuevoCorreo);
                       
        }
        System.out.println("Lista Datos  Editados");
        for(Usuario usuario:usuarios){
            System.out.println(usuario.toString());
                         
        }
        System.out.println("Necesita eliminar algun registro?, digite 'S' para si o 'N' para no:");
        String respEliminar = leer.nextLine();
        if(respEliminar.toUpperCase().equals("S")){
            System.out.println("Digite la posicion que necesita eliminar,posicion debe ser entre 0'cero'y" +  (cantUsuarios-1));
            usuarios.remove(leer.nextInt());
            System.out.println("Lista Datos sin eliminar ");
            for(Usuario usuario:usuarios){
             System.out.println(usuario.toString());
            }      
        
        }
        
    }       
            
}