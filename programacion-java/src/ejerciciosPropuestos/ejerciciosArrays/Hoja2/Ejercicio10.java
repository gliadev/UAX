package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que pida 20 números enteros. Estos números se deben introducir en\n" +
                "un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y\n" +
                "columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la\n" +
                "esquina inferior derecha.\n");

        Scanner teclado = new Scanner(System.in);

        int [][]numeros = new int[4][5];


        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++ ){
                System.out.println("Dime un numero para la posicion de la fila: " + (i+1) +" de la columna " + (j+1) );
                numeros[i][j] = teclado.nextInt();
            }
        }





    }
}
