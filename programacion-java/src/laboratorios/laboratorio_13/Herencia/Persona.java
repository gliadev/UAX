/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.Herencia;

/**
 *
 * @author damiansualdea
 */
public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void andar(){
        System.out.println("Estoy andando a 5km/h");
    }
}
