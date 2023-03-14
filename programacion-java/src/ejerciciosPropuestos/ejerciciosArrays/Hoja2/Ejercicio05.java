package ejerciciosPropuestos.ejerciciosArrays.Hoja2;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por\n" +
                "pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a\n" +
                "continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista\n" +
                "generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.");


        // Generamos una lista con 100 números aleatorios del 0 al 20
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(21);
        }

        // Mostramos la lista en pantalla
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Pedimos al usuario que introduzca dos valores
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el primer valor: ");
        int val1 = scanner.nextInt();
        System.out.print("Introduce el segundo valor: ");
        int val2 = scanner.nextInt();

        // Recorremos la lista y cambiamos las ocurrencias del primer valor por el segundo
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == val1) {
                numbers[i] = val2;
                System.out.print("\"" + val2 + "\" ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }

        // Mostramos la lista modificada en pantalla
        System.out.println();
    }
}
