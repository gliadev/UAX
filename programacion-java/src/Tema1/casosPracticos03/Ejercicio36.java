package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        // Escribe un programa que lea dos números y recorra los números existentes entre los dos
        // para decirnos cuáles son pares y cuáles impares.



        Scanner teclado = new Scanner(System.in);
        System.out.println("Este Programa te pide dos numeros inicial y final te dira los numeros pares e impares entre ellos ");

        System.out.println("Dime un numero para empezar");
        int numeroInicial = teclado.nextInt();

        System.out.println("Dime un segundo numero para finalizar");
        int numeroFinal = teclado.nextInt();


        for( int i = numeroInicial; i <= numeroFinal; i++){
            if( i % 2 == 0 ){
                System.out.println( i + " Es un numero Par");
            } else {
                System.out.println(i +" Es un numero Impar");
            }
        }


    }
}
