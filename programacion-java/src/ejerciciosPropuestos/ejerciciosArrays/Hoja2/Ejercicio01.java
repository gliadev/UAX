package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("1º. Escribe un programa que lea 10 números por teclado y que luego los muestre en orden\n" +
                "inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.");

          Scanner teclado = new Scanner(System.in);

          int []numeros = new int[10];


          for ( int i = 0; i < 10; i++ ){
              numeros[i] = teclado.nextInt();
          }

          for (int i = numeros.length-1; i >= 0; i--){
              System.out.println("El array en inverso es " + numeros[i]);
          }
    }
}
