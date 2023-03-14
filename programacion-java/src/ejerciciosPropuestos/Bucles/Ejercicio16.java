package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que diga si un número introducido por teclado es o no primo. " +
                "Un número primo es aquel que sólo es divisible entre él mismo y la unidad.");
        /*
            La solucion es el contador
            si el contador es 2 el mismo y la unidad que es, es primo
            si el contador es != de 2 no es primo
         */
        int contador = 0;

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        for ( int i = numero;  i >= 1; i--){
            if(numero % i == 0){
                contador++;
            }
            if(contador == 2)
                System.out.println("El numero: " + numero + " es primo");
            else {
                System.out.println("El numero: " + numero + " no es primo");
            }
        }


    }
}

