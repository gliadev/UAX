package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. " +
                "El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula sumando los dos anteriores, " +
                "por lo que tendríamos que los términos son 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… " +
                "El número n se debe introducir por teclado.");

        Scanner teclado = new Scanner(System.in);
        long primeraPosicion = 1;
        long segundaPosicion = 1;
        long suma = 0;

        System.out.println("introduce un numero para hacer la secuencia Fibo");
        int posiciones = teclado.nextInt();
        System.out.println("La serie es:  ");
        for ( int i = 3; i <= posiciones; i++ ){
            System.out.print(  suma + ", ");
            suma = primeraPosicion + segundaPosicion;
            primeraPosicion = segundaPosicion;
            segundaPosicion = suma;
        }


    }
}
