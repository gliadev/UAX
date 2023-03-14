package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introducir un número telefónico en formato de cadena y lo convierta de la siguiente manera:\n" +
                "Número Telefónico: 916463080\n" +
                "Nueva Cadena: (91)-646-30 -80\n");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de telefono");
        String telefono = teclado.next();

        String telefonoModificado = "(" + telefono.substring(0, 2) + ")-" +
                telefono.substring(2, 5) + "-" +
                telefono.substring(5, 7) + "-" +
                telefono.substring(7);

        System.out.println(telefonoModificado);





    }
}
