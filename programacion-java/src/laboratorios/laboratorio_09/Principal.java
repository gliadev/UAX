/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[5];
        numeros[0] = 6;
        numeros[1] = 8;
        numeros[2] = 2;
        numeros[3] = 9;
        numeros[4] = 0;

        System.out.println(numeros);
        //Mostrar el contenido de un array... 
        System.out.println(Arrays.toString(numeros));
        //Búsqueda binaria... NO ESTÁ ORDENADO
        System.out.println(Arrays.binarySearch(numeros, 2));
        //Ordenamos el array ascendente natural
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.binarySearch(numeros, 10));

        double[] numeros2 = new double[5];
        numeros2[0] = 6;
        numeros2[1] = 8;
        numeros2[2] = 2;
        numeros2[3] = 9;
        numeros2[4] = 0;

        int a = 7;
        int b = a;
        System.out.println(a + " " + b);
        System.out.println(a == b);

        double[] numerosCopia = numeros2;
        System.out.println(Arrays.toString(numerosCopia));
        numeros2[0] = 58;
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numerosCopia));

        System.out.println(numeros2 == numerosCopia);

        //Estamos referenciando a la misma posición de memoria....
        //Para hacer una array nuevo hay que clonar el array con el método clone()
        System.out.println(Arrays.toString(numeros2));
        numerosCopia = numeros2.clone();
        numeros2[0] = 99;
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numerosCopia));

        numeros2[0] = 58;
        System.out.println(numeros2 == numerosCopia);
        //comparación
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numerosCopia));

        System.out.println(Arrays.equals(numeros2, numerosCopia));

        //quiero saber si dos arrays son iguales
        numeros2[2] = 99;
        boolean sonIguales = true;
        if (numeros2.length != numerosCopia.length) {
            sonIguales = false;
        } else {
            int i = 0;
            while (sonIguales && i < numeros2.length) {
                if (numeros2[i] != numerosCopia[i]) {
                    sonIguales = false;
                }
                i++;
            }
            System.out.println(i);
        }
        System.out.println(sonIguales);
        //quiero emular un toString() de núemeros 2
        System.out.print("[");
        for (int i = 0; i < numeros2.length; i++) {
            if (i == numeros2.length - 1) {
                System.out.print(numeros2[i]);
            } else {
                System.out.print(numeros2[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println("");

        //emular el método clonar... numeros2
        double[] numeros3 = new double[numeros2.length];
        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = numeros2[i];
        }
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numeros3));

        //búsqueda binaria.... devuelve int posición o -1 si no existe partimos de un array ordenado
        Arrays.sort(numeros3);
        System.out.println(Arrays.toString(numeros3));
        int n = 78;
        int posicion = 0;
        for (int i = 0; i < numeros3.length; i++) {
            if (numeros3[i] == n) {
                posicion = i;
            }
            if (posicion == 0 && i == numeros.length - 1) {
                posicion = -1;
            }
        }
        System.out.println(posicion);
        
        //ordenación.... 

    }
}
