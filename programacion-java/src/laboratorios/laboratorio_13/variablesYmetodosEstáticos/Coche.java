/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.variablesYmetodosEstáticos;

/**
 *
 * @author damiansualdea
 */
public class Coche {
    private String matricula;
    private static int contador=0;

    public static int  getContador() {
        return contador;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        contador++; 
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
        
}
