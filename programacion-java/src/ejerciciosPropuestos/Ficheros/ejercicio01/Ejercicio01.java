package ejerciciosPropuestos.Ficheros.ejercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("G:\\GITHUB\\UAX\\programacion\\src\\laboratorios\\laboratorio_15\\lecturaFicheros\\fichero.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
