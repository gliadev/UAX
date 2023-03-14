package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que permita ir introduciendo una serie indeterminada de números\n" +
                "mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total\n" +
                "acumulado, el contador de los números introducidos y la media.");
        System.out.println();

        Scanner teclado = new Scanner(System.in);
        int contadorNumerosIntroducidos = 0;
        int limiteContarNumerosIntroducidos = 100000;
        int numerosIntroducidos = 0;
        int almacen = 0;

        do{
            System.out.println("Introduce un numero cuando lleguemos a 10000 se termina");
            numerosIntroducidos = teclado.nextInt();
            almacen = numerosIntroducidos + almacen;

            contadorNumerosIntroducidos++;



        }while (contadorNumerosIntroducidos!=limiteContarNumerosIntroducidos);
        System.out.println("Programa finalizado");
        System.out.println(numerosIntroducidos);
        System.out.println(almacen);



    }
}
