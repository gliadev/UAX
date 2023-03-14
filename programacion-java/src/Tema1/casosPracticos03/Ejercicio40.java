package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        // Escribe un programa que pida un número y escriba su tabla de multiplicar.

        Scanner teclado = new Scanner(System.in);
        int numeroMultiplicar = 0;

        System.out.println("Este es un programa que pida un número y escriba su tabla de multiplicar.");
        System.out.println();
        System.out.println("Introduce un numero para multiplicar");
        numeroMultiplicar = teclado.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(i +  " x " + numeroMultiplicar + " " + " " + " = "  + (i*numeroMultiplicar));
        }

    }
}
