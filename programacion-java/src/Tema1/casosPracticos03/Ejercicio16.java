package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
       // Haz un programa que nos diga si un número introducido por teclado es par o impar.

        Scanner telcado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = telcado.nextInt();

        if(numero % 2 == 0){
            System.out.println( numero + " Es un numero par");
        } else {
            System.out.println(numero +  " Es un numero inpar");
        }
    }
}
