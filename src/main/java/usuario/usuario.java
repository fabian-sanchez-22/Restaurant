package usuario;

public class usuario {

    public int id;

    public usuario(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public String nombre;
    public String usuario;
    public String contrasena;

    public usuario(int id, String nombre, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    

}
