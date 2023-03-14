package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
      //  Modifica el anterior programa para que sea el usuario quien indique cuántos números
        //  de la serie quiere ver por pantalla.


        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos nuemro de la serie Fibonacci quieres imprimir");
        int maximo = teclado.nextInt();

        int num1 = 0;
        int num2 = 1;
        int suma = 1;

        System.out.println(num1);

        for(int i = 1; i< maximo; i++ ){
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        teclado.close();
    }

}
