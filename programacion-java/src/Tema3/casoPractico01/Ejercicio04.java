package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Modifica el código Java del anterior ejercicio para que el nombre y la edad se lean por teclado.\n" +
                "import java.util.Scanner;");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.next();

        System.out.println("Introduce tu edad: ");
        String edad = teclado.next();

        System.out.println(nombre +" tiene " + edad + " años.");
    }
}
