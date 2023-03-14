/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_16;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author damiansualdea
 */
public class Principal2 {
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        try {
            if(linea.length()>=10)
                throw new ExcepcionMetro();//lanzar excepciones
            
            System.out.println("Estohy por aquí");
        }catch(ExcepcionMetro comoqueramos){
            System.out.println("Hemo recogido nuestra excepción...");
            comoqueramos.printStackTrace();
            JOptionPane.showConfirmDialog(null, "hemos detectado una "
                    + "excepción", "Exceptiooooon",JOptionPane.WARNING_MESSAGE, 0);
            
        }
    }
}
