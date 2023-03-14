package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
         // Escribe un programa que le un número entre 0 y 99999 y nos diga cuántos dígitos tiene.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 99999 te diremos cuantos digitos tiene");
        int numero = teclado.nextInt();


        if( numero < 0  || numero > 99999){
            System.out.println("Te has pasado un poco de los limites");
        } else {
            System.out.println(numero +  "  Tiene  un numero  digitos de:  " + Integer.toString(numero).length());

        }

    }
}
