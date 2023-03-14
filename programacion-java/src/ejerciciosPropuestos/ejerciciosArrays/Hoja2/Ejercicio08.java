package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que muestre por pantalla un array de 10 números enteros generados al\n" +
                "azar entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe\n" +
                "comprobar que el número introducido por teclado se encuentra dentro del array, en caso\n" +
                "contrario se mostrará un mensaje por pantalla y se volverá a pedir un número; así hasta que\n" +
                "el usuario introduzca uno correctamente. A continuación, el programa rotará el array hacia la\n" +
                "derecha las veces que haga falta hasta que el número introducido quede situado en la posición\n" +
                "0 del array. Por último, se mostrará el array rotado por pantalla.\n");
        Scanner teclado = new Scanner(System.in);

            // genero el array
            int []arrayDeNumeros = new int[10];
            // genero los numeros aleatorios
            Random numeroAleatorio = new Random();

            // relleno el array con numeros aleatorios entre 0 y 100 incluidos
            for (int i = 0; i < arrayDeNumeros.length; i++){
                arrayDeNumeros[i] = numeroAleatorio.nextInt(101);
            }

            // guardo el numero
        int numeroComprobar ;







    }
}
