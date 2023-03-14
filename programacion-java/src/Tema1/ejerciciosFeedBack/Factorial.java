package Tema1.ejerciciosFeedBack;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /* Realizar un programa que calcule el factorial de un número positivo (n!). */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa calcula el factorial de un numero que introduzca el usuario");
        System.out.println();

        System.out.println("Introduce un numero:");
        long numero = teclado.nextInt();
        long factorial = 1;

        for (long i = 1; i <= numero; i++){
            factorial = i * factorial;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}
