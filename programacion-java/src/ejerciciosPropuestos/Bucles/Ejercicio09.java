package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.");
        System.out.println();
        System.out.println("introduce un numero");
        String numero = teclado.next();
        System.out.println(numero + " Tiene " + numero.length() + " digitos");


    }
}
