package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),\n" +
                " saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.\n " +
                "No se deben utilizar funciones de exponenciación. \n" +
                "Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25\n");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una base");
        int base = teclado.nextInt();

        System.out.println("Introduce un exponente");
        int exponente = teclado.nextInt();

        for ( int i = 1; i <= exponente; i++ ){
            System.out.println(base + " elevado a " + i + " es " + Math.round(Math.pow(base, i)));
        }

    }
}
