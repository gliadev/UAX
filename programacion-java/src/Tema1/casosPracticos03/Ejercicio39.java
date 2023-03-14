package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        // Modifica el programa anterior para que al terminar cada partida pregunte al usuario si quiera jugar otra.
        // Se le da la opción de contestar ‘S’ para jugar otra, o ‘N’ para terminar.


        int numeroAdivinar = 97;
        int numeroIntroducido;
        Scanner teclado = new Scanner(System.in);
        String comprobante="";
        boolean empezar = true;


        do{
            if(empezar == true){
                System.out.println("En este juego tienes que adivinar un numero, te dare pistas de mayor o menor");
                do {
                    System.out.println("Introduce un numero");
                    numeroIntroducido = teclado.nextInt();
                    if (numeroIntroducido < numeroAdivinar) {
                        System.out.println("El numero es mayor");
                    } else if (numeroIntroducido > numeroAdivinar) {
                        System.out.println("El numero es menor");
                    }

                } while (numeroAdivinar != numeroIntroducido);{
                    System.out.println("Felicidades ACERTASTE!!");
                }

                System.out.println("Quieres volver a jugar? S o N");
                comprobante = teclado.next();
                if (comprobante.charAt(0) == 'S'){
                    empezar = true;
                } else if (comprobante.charAt(0) == 'N') {
                    empezar = false;
                }
            }
        }while(empezar != false);

    }
}
