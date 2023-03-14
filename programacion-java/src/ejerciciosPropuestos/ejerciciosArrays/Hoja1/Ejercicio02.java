package ejerciciosPropuestos.ejerciciosArrays.Hoja1;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("2. Hacer un programa que cree un array de 10 posiciones de números aleatorios entre\n" +
                "1 y 100. Posteriormente\n" +
                "se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición.\n" +
                "Math.random() → Devuelve un numero entre 0.0 y 1.0\n" +
                "Math.floor(Math.random()*6) → Devuelve un numero entre 0 y 5\n");
        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[10];

        for ( int i = 0; i < numeros.length; i++){
            // le hago un casting para forzar el cambio de double a int
            numeros[i] = (int )Math.floor(Math.random()*100);
        }

        System.out.println(Arrays.toString(numeros));

        System.out.println("Introduce una posicion entre 0 y 10");
        int preguntaPosicion = teclado.nextInt();

        System.out.println(numeros[preguntaPosicion]);

    }
}
