package laboratorios.laboratorio_06;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
         /*
        Escribe un programa que calcule la media de un conjunto de números positivos introducidos
        por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
        indicará que ha terminado de introducir los datos cuando meta un número negativo.
         */

        //Media es la suma de todos los elementos / número de elementos
        Scanner teclado = new Scanner(System.in);
        double num, suma = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un número (negativo para salir)");
            num = teclado.nextInt();

            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);//condición de rotura --> num <0;
        double media = suma / contador;
        System.out.println("La media es: " + media);
    }
}
