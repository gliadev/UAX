/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {

        //FileReader f1 = new FileReader("adios.txt");
        //f1.read();
       
        //try with resources
        try(FileWriter f2 = new FileWriter("Hola");) 
        {     
            //Si no hay excepcion... continúa el program
            f2.write("1234");
            System.out.println("He escrito una cadena");

        }catch (FileNotFoundException e2) { //SI hay excpeción... ejecutamos lo que hay en el cathc     
            System.out.println("Hemos recogido la excepción de fichero no encontrado");
            e2.printStackTrace();
        }catch (IOException e){
            System.out.println("Hemos cogido la excepcon de Entrada / Salida");
        }finally{
            System.out.println("Es un bloque que se ejecuta siempre");
            //Para cerrar recursos
        }
        //f2.close();
    }
}
