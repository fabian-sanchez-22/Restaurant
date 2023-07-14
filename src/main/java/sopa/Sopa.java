
package sopa;

public class Sopa {
    
    public int id;
    public String nombre;
    public int precio;
    public int cantidad;
   

    public Sopa(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Sopa(int id, String nombre, int precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    
    
    
}
