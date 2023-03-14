package Tema4.ejercicioFeedback;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Este programa pedira un numero de telefono al usuario por consola, lanzara una excepcion \n" +
                "considerando que es erróneo si no empieza por 6, 7 o 9 o si no tiene 9 dígitos");

        // uso Scanner para la entrada por teclado
        Scanner teclado = new Scanner(System.in);

        // me traigo la clase para comprobarlo
        ComprobarNumeroTelefono validarTelefono = new ComprobarNumeroTelefono();

        // hago un booleando en false para que no salga del bucle y pida el numero
        boolean telefonoOK = false;

        do{
            try {
                System.out.println("Introduce un numero de telefono");
                String numerotelefono = teclado.next();
                validarTelefono.validarTelefono(numerotelefono);
                telefonoOK = true;

            } catch (ControlarNumeroTelefonoException e ){
                System.out.println(e.getMessage());
            }
        } while (!telefonoOK);


    }
}
