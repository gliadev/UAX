package ejerciciosPropuestos.excepciones.ejercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que pida al usuario que ingrese su edad. Si el usuario ingresa un valor no numérico,\n " +
                "el programa debe mostrar un mensaje de error y volver a pedirle que ingrese su edad. Una vez que el usuario ingresa una edad válida, \n " +
                "el programa debe imprimir un mensaje que indique si el usuario es mayor de edad o no.");
        ComprobarEdad validarEdad = new ComprobarEdad();
        boolean edadOK = false;
        Scanner teclado = new Scanner(System.in);

        do{
            try{
                System.out.println("Introduce tu edad en digitos: ");
                String edadTeclado = teclado.next();
                validarEdad.validadEdad(edadTeclado);
                edadOK = true;

            } catch (ControlarEdadNumeroException e){
                System.out.println(e.getMessage());
            }
        } while (!edadOK);

    }

}
