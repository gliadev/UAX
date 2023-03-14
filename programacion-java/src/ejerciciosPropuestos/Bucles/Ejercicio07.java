package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Realiza el control de acceso a una caja fuerte. " +
                "La combinación será un número de 4 cifras. " +
                "El programa pedirá la combinación para abrirla. Si no se acierta, se mostrará el mensaje " +
                "“Lo siento, esa no es la combinación” y si se acierta se dirá " +
                "“La caja fuerte se ha abierto”. Se tendrán cuatro oportunidades para abrir la caja fuerte.");

        int contraseña = 1234;
        int entrada;
        do{
            System.out.println("Introduce la contraseña");
            entrada = teclado.nextInt();
            if(entrada != contraseña){
                System.out.println("Lo siento, esa no es la combinación");
            } else{
                System.out.println("La caja fuerte se ha abierto");
            }

        } while(entrada!=contraseña);
    }
}
