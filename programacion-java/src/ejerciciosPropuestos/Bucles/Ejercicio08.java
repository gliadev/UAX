package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Muestra la tabla de multiplicar de un número introducido por teclado.");
        System.out.println();
        System.out.println("Introduce el numero para saber su tabla de multiplicar");
        int numero = teclado.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " X " + numero + " = "  + ( i * numero ));
        }
        System.out.println();

        System.out.println("Este es otra manera");
        for(int i = 0; i <= 10; i++){
            int calculo = i * numero;
            System.out.println(i + " X " + numero + " = "  + calculo);
        }



    }
}
