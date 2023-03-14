/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.variablesYmetodosEstáticos;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {

        Double max = Double.max(3.0, 9.0);
        
        System.out.println(max);
        //métodos y variables estáticas
        //variable global
        //quiero saber cuantos objetos creo de tipo Coche

        Coche c = new Coche("1234ABC");
        
        
       Coche c1 = new Coche("34566CBA");
        //System.out.println(c1.getContador());
        System.out.println(Coche.getContador());

    }
}
