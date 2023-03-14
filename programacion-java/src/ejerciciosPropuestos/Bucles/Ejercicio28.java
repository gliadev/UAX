package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que calcule el factorial de un número entero leído por teclado.\n" +
                "Ejemplo: Por favor, introduzca un número entero: 6\n" +
                "6! = 720");
        long factorial = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        for( int i= 1; i <= numero; i++){
            factorial =  i * factorial;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}
