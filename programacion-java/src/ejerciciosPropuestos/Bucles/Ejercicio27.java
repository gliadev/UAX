package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que muestre, cuente y sume los múltiplos de 3 \n " +
                "que hay entre 1 y un número leído por teclado.");

        int sumaNumeros = 0;
        int contadorNumeros = 0;

        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido = teclado.nextInt();

        System.out.println("Los multipos de 3, del 1 hasta el " + numeroIntroducido + " son: ");

        for( int i = 1; i <= numeroIntroducido; i++){
            int calculo = i * 3;
            contadorNumeros++;
            sumaNumeros = calculo + sumaNumeros;
            System.out.print(calculo + ", ");

        }

        System.out.println();
        System.out.println("Suma de los numeros es: " + sumaNumeros);
        System.out.println("El contador de numeros es: " + contadorNumeros);






    }
}
