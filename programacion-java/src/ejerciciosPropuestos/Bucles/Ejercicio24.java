package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Realiza un programa que pida un número por teclado y que luego muestre ese número al\n" +
                "revés.");
        int resto;
        int invertido = 0;
        int numero = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para que le demos la vuelta");
         numero = teclado.nextInt();

        while ( numero > 0){
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println("El numero al reves es " + invertido);


    }
}
