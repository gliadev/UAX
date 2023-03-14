package laboratorios.laboratorio_15.lecturaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    public static void main(String[] args) throws IOException {
        String fichero = "fichero.txt";
        FileReader flujoEntrada = new FileReader(fichero);
        //Almacena todo el documento
        BufferedReader lectura = new BufferedReader(flujoEntrada);

        //Hay que leer linea a linea mientras no sea nulo
        String linea;
        int acumulador = 0;
        while ((linea = lectura.readLine()) != null) {
            //Estamos leyendo
            System.out.println(linea);
            // Hacer operaciones
            //contar el número de palabras que hay por línea
            int contarPalabrasLinea = 0;
            for(int i = 0 ; i<linea.length();i++){
                if(linea.charAt(i)==' ')
                    contarPalabrasLinea++;
            }
            System.out.println("Palabras por línea: "+Integer.valueOf(contarPalabrasLinea+1));
            acumulador += contarPalabrasLinea+1;
            String[] lineaArray = linea.split(" ");
            System.out.println(lineaArray.length);

            //Mostar el texto con el cambio de e a 3
            String linea4 = linea.replace("hola", "buenas");
            System.out.println(linea4);

            //Saber si hay una palabra
            if(linea.contains("hola")){
                System.out.println("Si está la palabra hola");
            }

            //

        }
        System.out.println("En total son..."+acumulador);
        flujoEntrada.close();
    }
}
