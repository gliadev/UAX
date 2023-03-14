package ejerciciosPropuestos.ejerciciosVarios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ParaBorrar {
    public static void main(String[] args) throws IOException {
        String fichero = "G:\\GITHUB\\UAX\\programacion\\src\\ejerciciosPropuestos\\ejerciciosVarios\\fichero.txt";

        Scanner teclado = new Scanner(System.in);
        FileWriter entradaFichero = new FileWriter(fichero, false);

        System.out.println("Introduce lo que quieras añadir al fichero: ");
        String texto = teclado.nextLine();
        entradaFichero.write(texto);


        entradaFichero.close();







    }
}
