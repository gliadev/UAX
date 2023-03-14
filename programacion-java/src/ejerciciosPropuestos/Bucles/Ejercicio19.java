package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirmide: ");
        int alturaFilas = teclado.nextInt();

        System.out.println("Introduce el caracter para imprimir");
        String caracter = teclado.next();
        System.out.println();


        // altura de la piramide
        for(int altura = 1; altura <= alturaFilas; altura++){

            //Espacios en blanco
            for(int espaciosBlancos = 1; espaciosBlancos<= alturaFilas-altura; espaciosBlancos++){
                System.out.print(" ");
            }

            // caracter que escogemos
            for(int caracterElegido=1; caracterElegido<=(altura*2)-1; caracterElegido++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}