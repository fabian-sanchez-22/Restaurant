
package jugo;

public class Jugo {
  
    public int id;
    public String nombre;
    public int precio;
    public int cantidad;
    public int litrosJugo;
  

    public Jugo(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
   
    public Jugo(int id, String nombre, int precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
      
    }
    
    
}
