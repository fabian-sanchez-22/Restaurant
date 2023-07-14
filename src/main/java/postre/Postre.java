
package postre;

public class Postre {
    
    public int id;
    public String nombre;
    public int precio;
    public int cantidad;
    

    public Postre(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Postre(int id, String nombre, int precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
}
