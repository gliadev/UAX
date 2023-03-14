package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. " +
                "Se debe comprobar que el dato introducido es correcto (que es un número positivo).");

        Scanner teclado = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Introduce un numero positivo");
            numero = teclado.nextInt();
            for (int i = numero; i <= 100; i++){
                numero = numero + 1;
            }

        } while ( numero >0);
        System.out.println("Fin del programa");

        System.out.println("El numero final es: "  + numero);
    }
}
