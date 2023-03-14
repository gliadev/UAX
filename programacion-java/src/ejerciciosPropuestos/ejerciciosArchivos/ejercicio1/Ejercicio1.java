package ejerciciosPropuestos.ejerciciosArchivos.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Crear un archivo de texto y escribir en él una lista de nombres de personas. Luego,\n " +
                "leer el archivo y mostrar los nombres en la consola.");
        // ruta del archivo
        String fichero = "G:\\GITHUB\\UAX\\programacion\\src\\ejerciciosPropuestos\\ejerciciosArchivos\\ejercicio1\\fichero.txt";

        // creo el archivo en la ruta, con true añado lo a lo que contenga
        FileWriter entradaFichero = new FileWriter(fichero, false);

        entradaFichero.write("Patata\n");
        entradaFichero.write("Patatin\n");
        entradaFichero.write("Pataton\n");
        entradaFichero.write("PatatoPattin\n");

        // cierro la entrada al fichero
        entradaFichero.close();

        // abro el fichero para poderlo leer
        File leerFichero = new File(fichero);
        Scanner paraleerFichero = new Scanner(leerFichero);

        // metodo while para leer linea a linea
        while (paraleerFichero.hasNextLine()){
            // tengo que merter esa linea en algun sitio si no no puedo sacarla
            String lineadelTexto = paraleerFichero.nextLine();
            System.out.println(lineadelTexto);
        }
        paraleerFichero.close();


    }
}
