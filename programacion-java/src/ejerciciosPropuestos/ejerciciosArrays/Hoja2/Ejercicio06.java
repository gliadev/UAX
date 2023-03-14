package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("6º. Realiza un programa que pida la temperatura media que ha hecho en cada mes de un\n" +
                "determinado año y que muestre a continuación un diagrama de barras horizontales con esos\n" +
                "datos. Las barras del diagrama se pueden dibujar a base de asteriscos.\n");

        // Creamos un array para almacenar las temperaturas de cada mes
        int[] temperatures = new int[12];

        // Pedimos al usuario que introduzca la temperatura media de cada mes
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Introduce la temperatura media del mes " + (i + 1) + ": ");
            temperatures[i] = teclado.nextInt();
        }

        // Mostramos un diagrama de barras con los datos de temperatura
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (int j = 0; j < temperatures[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


