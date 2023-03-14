package ejerciciosPropuestos.ejerciciosArrays.Hoja1;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("4. Hacer un programa que calcule la letra de un DNI. Se pedirá el DNI por teclado y devolverá el DNI la letra.\n" +
                "Para bus car la letra, se calcula el resto de dividir el dni entre 23, y con el resultado que estará entre 0 y 22,\n" +
                "se busca en el array de caracteres la letra correspondiente. El orden de los caracteres es:\n" +
                "T, R, W, A, G, M,Y, F, P, D, X, B, N, J, Z, S, Q,V, H, L, C, K, E\n");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu numero de DNI sin letra");
        int dni = teclado.nextInt();

        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int posicion = dni % 23;

        System.out.println(letra[posicion]);
    }
}
