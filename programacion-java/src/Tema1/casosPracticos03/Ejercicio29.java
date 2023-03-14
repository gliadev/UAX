package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
           /* Escribe un programa que lea caracteres que introduce un usuario y cuente el número de cada una de las vocales que introduzca.
            El programa termina cuando el usuario introduzca un asterisco,
            momento en el cual se debe imprimir el recuento de cada una de las vocales,
            el total de letras introducidas y el número de letras que no eran vocales.
        */

        int contadorCaracteres = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String cadena = "";

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Introduce una palabra");
            cadena = teclado.nextLine();
            contadorCaracteres ++;
            switch (cadena.length()){
                case 'a': a++;
                break;
                case 'e': e++;
                break;
                case 'i': i++;
                break;
                case 'o': o++;
                break;
                case 'u': u++;
                break;
            }

        } while (cadena.charAt(0)!='*');{
            teclado.close();
        }
        System.out.println("Tecleaste la letras a: " + a +  " veces." );



    }
}
