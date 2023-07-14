package RestauranteSena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jugo.Jugo;
import platoPrincipal.PlatoPrincipal;
import postre.Postre;
import sopa.Sopa;

public class RestauranteSena {

    static int opcion;
    static Scanner entrada = new Scanner(System.in);
    static List<PlatoPrincipal> platosPrincipales = new ArrayList<>();
    static List<Sopa> sopas = new ArrayList<>();
    static List<Jugo> jugos = new ArrayList<>();
    static List<Postre> postres = new ArrayList<>();

    public static void main(String[] args) {

        while (opcion != 3) {
            
            System.out.println("\n");
            System.out.println(" ***** BIENVENIDOS **** ");
            System.out.println(" ***** RESTAURANTE SENA **** ");
            System.out.println("1. Crear un menu");
            System.out.println("2. Ver el menu");
            System.out.println("3. Salir");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    // crear el menu
                    crearMenu();

                    break;
                case 2:
                    // ver el menu

                    verMenu();
                    break;

                case 3:
                    //salir
                    break;

                default:
                    throw new AssertionError();

            }

        }

    }

    private static void crearMenu() {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Platos principales ");
            System.out.println("2. Sopas ");
            System.out.println("3. Jugos ");
            System.out.println("4. Postres ");
            System.out.println("5. Atras ");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Nombre plato");
                    String nombre = entrada.nextLine();
                    System.out.println("Precio");
                    int precio = Integer.parseInt(entrada.nextLine());
                    System.out.println("cantidad");
                    int cantidad = Integer.parseInt(entrada.nextLine());

                    PlatoPrincipal platillo = new PlatoPrincipal(nombre, precio, cantidad);
                    platosPrincipales.add(platillo);
                    break;

                case 2:
                    System.out.println("Nombre sopa");
                    String nombreSopa = entrada.nextLine();
                    System.out.println("precio");
                    int precioSopa = Integer.parseInt(entrada.nextLine());
                    System.out.println("cantidad");
                    int cantidadSopa = Integer.parseInt(entrada.nextLine());

                    Sopa sopita = new Sopa(nombreSopa, precioSopa, cantidadSopa);
                    sopas.add(sopita);
                    break;

                case 3:
                    System.out.println("Nombre jugo");
                    String nombreJugo = entrada.nextLine();
                    System.out.println("precio");
                    int precioJugo = Integer.parseInt(entrada.nextLine());
                    System.out.println("cantidad");
                    int cantidadJugo = Integer.parseInt(entrada.nextLine());

                    Jugo juguito = new Jugo(nombreJugo, precioJugo, cantidadJugo);
//                    juguito.preparar();
                    jugos.add(juguito);
                    break;

                case 4:
                    System.out.println("nombre postre");
                    String nombrePostre = entrada.nextLine();
                    System.out.println("precio");
                    int precioPostre = Integer.parseInt(entrada.nextLine());
                    System.out.println("cantidad");
                    int cantidadPostre = Integer.parseInt(entrada.nextLine());
                    Postre postresito = new Postre(nombrePostre, precioPostre, cantidadPostre);
                    postres.add(postresito);
                    break;
            }
        }

    }

    private static void verMenu() {
  
        System.out.println("****Menu del dia**** ");
        System.out.println("\n");
        System.out.println("Platos principales ");
        System.out.println("Nombre \t Precio \t Cantidad");
        
        platosPrincipales.forEach(platosPrincipales -> {
            System.out.println(platosPrincipales.nombrePlato + "\t" + platosPrincipales.precio + "\t" + platosPrincipales.cantidad);
        });
        
        
        System.out.println("\n");
        System.out.println("Sopas ");
        System.out.println("Nombre \t Precio \t Cantidad");
        
        sopas.forEach(sopas -> {
            System.out.println(sopas.nombre + "\t" + sopas.precio + "\t" + sopas.cantidad);
        });
        
        
        System.out.println("\n");
        System.out.println("Jugos ");
        System.out.println("Nombre \t Precio \t Cantidad \t Litros");
        
        jugos.forEach(jugos -> {
            System.out.println( jugos.nombre + "\t" + jugos.precio + "\t" + jugos.cantidad + "\t" + jugos.litrosJugo);
        });
        
        System.out.println("\n");
        System.out.println("Postres ");
        System.out.println("Nombre \t Precio \t Cantidad");
        
        postres.forEach(postres -> {
            System.out.println(postres.nombre + "\t" + postres.precio + "\t" + postres.cantidad);
        });
    }

}
