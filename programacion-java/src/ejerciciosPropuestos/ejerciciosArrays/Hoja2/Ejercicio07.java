package ejerciciosPropuestos.ejerciciosArrays.Hoja2;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("7º. Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios\n" +
                "comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array\n" +
                "y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente\n" +
                "se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.\n" +
                "Ejemplo:\n" +
                "159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13\n" +
                "¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1\n" +
                "159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13\n");


        // Rellenamos un array de 20 elementos con números aleatorios del 0 al 400
        int[] numeros = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(401);
        }

        // Mostramos el array en pantalla
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Pedimos al usuario que elija qué números quiere resaltar
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int eleccion = scanner.nextInt();

        // Mostramos el array de nuevo, resaltando los números seleccionados
        if (eleccion == 1) {
            for (int numero : numeros) {
                if (numero % 5 == 0) {
                    System.out.print("[" + numero + "] ");
                } else {
                    System.out.print(numero + " ");
                }
            }
        } else if (eleccion == 2) {
            for (int numero : numeros) {
                if (numero % 7 == 0) {
                    System.out.print("[" + numero + "] ");
                }
            }
        }
    }
}