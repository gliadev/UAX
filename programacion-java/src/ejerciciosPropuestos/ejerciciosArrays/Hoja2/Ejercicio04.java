package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Random;

public class Ejercicio04 {
    public static void main(String[] args) {

        System.out.println("4º. Escribe un programa que genere aleatoriamente un array de 20 componentes y rote los\n" +
                "elementos del array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de\n" +
                "la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.\n" +
                "Finalmente, mostrar el contenido del array.\n");

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crear un array de 20 elementos
        int[] array = new int[20];

        // Llenar el array con números aleatorios entre 0 y 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Rotar el array
        int last = array[array.length - 1]; // Guardar el último elemento
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Desplazar los elementos hacia la derecha
        }
        array[0] = last; // Poner el último elemento en la primera posición

        // Mostrar el array rotado
        System.out.println("Array rotado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();



    }
}
