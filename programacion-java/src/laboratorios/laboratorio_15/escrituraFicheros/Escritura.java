package laboratorios.laboratorio_15.escrituraFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) throws IOException {
        // para escribir usamos Filewriter
        //con FileWriter

        String fichero = "G:\\GITHUB\\UAX\\programacion\\src\\laboratorios\\laboratorio_15\\escrituraFicheros\\laboratorio15.txt";
        FileWriter flujoSalida = new FileWriter(fichero, false);
        flujoSalida.write("Hola a todos");
        flujoSalida.write(" Qué tal 222222");
        flujoSalida.write(System.lineSeparator());

        Scanner teclado = new Scanner(System.in);
        String comentario = teclado.nextLine();

        comentario = comentario.toUpperCase();

        //poner el número de a's que tiene el comentario
        int contador = 0;
        for (int i = 0; i < comentario.length(); i++) {
            if (comentario.charAt(i) == 'A') {
                contador++;
            }
        }


        flujoSalida.write(String.valueOf(contador));
        flujoSalida.write(": ");


        flujoSalida.write(comentario);

        flujoSalida.close();;


    }
}
