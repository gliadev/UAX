package Tema2.ejercicioFeedBack;

import java.util.Scanner;

/**
 * The type Uso poblacion.
 */
public class usoPoblacion {
    /**
     * Aqui hago la solicitud de los datos, un lo creo por teclado y mediante los set los añado y con los get los
     * imprimo, el segundo lo hecho a sido crear priemro el objeto Patron y lo añadido al objeto Poblacion.
     * Espero que este OK nos vemos en clase
     *
     *
     *
     */
    public static void main(String[] args) {
        // voy hacer una entrada por teclado de la info
        Scanner teclado = new Scanner(System.in);

        // creo los dos objetos

        // este lo voy a pedir por teclado
        Poblacion poblacion1 = new Poblacion();
        Padron padron1 = new Padron();

        System.out.println("Este programa pide unos datos para Generar un Padron.\n");

        System.out.println("Introduce al año del padron");
        padron1.setAnyoPadron(teclado.nextInt());

        System.out.println("Introduce la Comunidad Autonoma");
        poblacion1.setComunidadAutonoma(teclado.next());

        System.out.println("Introduce la pronvincia");
        poblacion1.setProvincia(teclado.next());

        System.out.println("Introduce la poblacion");
        poblacion1.setPoblacion(teclado.next());

        System.out.println("Introduce el numero de habitantes");
        padron1.setNumeroHabitantes(teclado.nextInt());

        System.out.println("introduce la variacion de Habitantes / año anterior");
        padron1.setPorcentajeVariacionHabitantes(teclado.nextDouble());

        // Imprimo los datos con algo de formato
        System.out.println("Estos son los datos del Padron que has introducidos\n");
        System.out.print("Año de Padron " + padron1.getAnyoPadron());
        System.out.println("Comunidad Autonoma: ");
        System.out.println("Provincia " + poblacion1.getProvincia() + " Poblacion " + poblacion1.getPoblacion());
        System.out.println(poblacion1.getPoblacion() + ", tiene una variacion respesto al año anterior de: " + padron1.getPorcentajeVariacionHabitantes());


        // Este lo voy a crear yo manualmente
        Padron padron2 = new Padron(2025,150000,12.32);
        Poblacion poblacion2 = new Poblacion("Patatin","Patata", "Vitoria",padron2);

        // Lo mismo que el de arriba lo imprimo
        System.out.println("Estos son los datos del Padron que has introducidos\n");
        System.out.print("Año de Padron " + padron2.getAnyoPadron());
        System.out.println("Comunidad Autonoma: ");
        System.out.println("Provincia " + poblacion2.getProvincia() + " Poblacion " + poblacion2.getPoblacion());
        System.out.println(poblacion2.getPoblacion() + ", tiene una variacion respesto al año anterior de: " + padron2.getPorcentajeVariacionHabitantes());







    }
}
