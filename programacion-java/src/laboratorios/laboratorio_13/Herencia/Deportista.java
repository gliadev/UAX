/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.Herencia;

/**
 *
 * @author damiansualdea
 */
public class Deportista extends Persona{
    private String deporte;

    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String deporte, String nombre) {
        super(nombre);
        this.deporte = deporte;
    }
    
    @Override
    public void andar(){
        
        //System.out.println("Estoy andando a 20km");
        super.andar();
    }
    
}
