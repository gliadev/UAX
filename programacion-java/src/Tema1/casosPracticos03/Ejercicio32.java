package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        //Modifica el programa anterior para que sea el usuario quien diga cuántos números quiere incluir en el producto.


        Scanner telcado = new Scanner(System.in);
        System.out.println("Introduce el numero maximo de producto");
        int producto = telcado.nextInt();

        for (int i = 0; i <= producto; i++) {
            System.out.println("El producto de " + i + " x " + i + " es = " + (i * i));
        }
    }
}
