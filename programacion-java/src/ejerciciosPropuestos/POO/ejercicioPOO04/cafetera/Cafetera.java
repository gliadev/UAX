package ejerciciosPropuestos.POO.ejercicioPOO04.cafetera;

/*
      Programar una clase Cafetera con los siguientes atributos:
      capacidadMaxima: cantidad máxima de café que puede contener la cafetera
      cantidadActual: cantidad actual de café que hay en la cafetera.
   */
public class Cafetera {
    private String nombre;
    private int capacidadMaxima;
    private int cantidadActual;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
        Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.)
        y la actual en cero (cafetera vacía).
         */
    public Cafetera(){
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }
    /*
    Constructor con la capacidad máxima de la cafetera:
    inicializa la cantidad actual de café igual a la capacidad máxima.
     */
    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }
    /*
    Constructor con la capacidad máxima y la cantidad actual:
    Si la cantidad actual es mayor que la capacidad máxima de la cafetera,
    la ajustará al máximo.
     */

    public Cafetera(int capacidadMaxima, int cantidadActual){
        if (cantidadActual > capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    // constructores

    /*
    llenarCafetera():hace que la cantidad actual sea igual a la capacidad máxima.
     */
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }

    /*
    servirTaza(int): simula la acción de servir una taza con la
    capacidad indicada como parametro. Si la cantidad actual de café
    “no alcanza” para llenar la taza, se sirve lo que quede.
     */
    public void servirTaza(int centilitros){
        if( cantidadActual < centilitros ) {
            cantidadActual = 0  ;
        } else {
            cantidadActual = cantidadActual - centilitros;
        }
    }

    /*
    vaciarCafetera(): pone la cantidad de café actual en cero. H
    ay que controlar que no se sobrepase la capacidad máxima
     */

    public void vaciarCafetera(){
        cantidadActual = 0;
    }

    /*
    mostrarContenido(): escribe en pantalla la cantidad de café que queda en la cafetera
     */
    public void mostrarContenido(){
        System.out.println(nombre + " le quedan: " + cantidadActual + " centilitros");
    }


}

