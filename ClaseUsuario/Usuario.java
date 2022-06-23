package ClaseUsuario;

/**
 *
 * @author marca
 */
public class Usuario {
    private Integer Id;
    private String nombre;
    private String apellido;
    private String rut;
    private Integer edad;
    private String correo;

    public Usuario() {
    }

    public Usuario(Integer Id, String nombre, String apellido, String rut, Integer edad, String correo) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.correo = correo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Datos Usuarios: " + "Id=" + Id + ", nombre=" + nombre + " , apellido=" + apellido
                + ", rut=" + rut + ", edad=" + edad + ", correo=" + correo ;
    }
    
    
    
    
}
