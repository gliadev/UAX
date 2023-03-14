package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
                //  Escribe un programa que lea un número que hay que adivinar.
                // A continuación, comienza a leer números, y para cada uno nos dice si es menor o mayor que el que hay que adivinar.
                // El programa termina cuando se adivine el número.

        int numeroAdivinar = 97;
        int numeroIntroducido;
        Scanner teclado = new Scanner(System.in);
        System.out.println("En este juego tienes que adivinar un numero, te dare pistas de mayor o menor");
        System.out.println();


        do {
            System.out.println("Introduce un numero");
            numeroIntroducido = teclado.nextInt();
            if (numeroIntroducido < numeroAdivinar) {
                System.out.println("El numero es mayor");
            } else if (numeroIntroducido > numeroAdivinar) {
                System.out.println("El numero es menor");
            }

        } while (numeroAdivinar != numeroIntroducido);{
            System.out.println("Felicidades ACERTASTE!!");
        }

    }
}
