package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Lee dos cadenas por teclado y escríbelas separadas por un espacio en blanco.");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la primera cadena de texto");
        String cadenaUno = teclado.next();

        System.out.println("introduce la segunda cadena de texto");
        String cadenaDos = teclado.next();

        System.out.printf("Las cadenas de texto son :");
        System.out.println(cadenaUno + " " + cadenaDos);
    }
}
