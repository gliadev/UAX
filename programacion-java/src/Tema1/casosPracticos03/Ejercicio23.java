package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Escribe un programa que lea un número de teléfono y nos diga si es un número móvil o no.
        // Utiliza el método charAt() de la clase String. Busca su referencia en Internet.



        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de movil");
        String numeroTelefono = teclado.next();

        System.out.println(numeroTelefono);
        if (numeroTelefono.charAt(0)=='6' || numeroTelefono.charAt(0)=='7'){
            System.out.println("Es un numero de movil correcto");
        } else {
            System.out.println("Esto no es un numero de movil");
        }

        teclado.close();
    }
}
