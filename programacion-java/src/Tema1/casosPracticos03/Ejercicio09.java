package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
       /* Haz un programa que lea un número y escriba su cuadrado.
            Utiliza este código para leer el número:
            Scanner teclado = new Scanner(System.in);
            int num=0;
            System.out.println ("Introduce un numero: ");
            num = teclado.nextInt(); */

            Scanner telcado = new Scanner(System.in);
            int num = 0;
            System.out.println("Introduce un numero");
            num = telcado.nextInt();
            double operacion = Math.pow(num, 2);
            System.out.println("El cuadrado de " + num + " es: " + operacion);


    }
}
