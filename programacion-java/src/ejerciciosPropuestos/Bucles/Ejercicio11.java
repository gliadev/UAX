package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que muestre en tres columnas, " +
                "el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double numero = teclado.nextDouble();

        for (double i = numero; i <= numero + 4; i ++  ){

            System.out.println(numero);
        }

    }
}
