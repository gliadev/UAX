package laboratorios.laboratorio_14;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damiansualdea
 */
public class JefeProyecto {
    private String nombre;
    private int numProyectos;
    private int horasExtra;
    private static final double PRECIOHORA=20.0;
    
    public JefeProyecto(String nombre, int numProyectos, int horasExtra) {
        this.nombre = nombre;
        this.numProyectos = numProyectos;
        this.horasExtra = horasExtra;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumProyectos() {
        return numProyectos;
    }
    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    public double calcularSueldo(){
        return Empresa.HORAS*4*PRECIOHORA + 300*numProyectos + horasExtra*2*PRECIOHORA;
    }
    
    public void visualizar(){
        System.out.println("Jefe de proyecto");
        System.out.println("Nombre: "+nombre);
        System.out.println("Nº de proyectos: "+numProyectos);
        System.out.println("Horas Extra: "+horasExtra);
        System.out.println("Sueldo: "+calcularSueldo());
        System.out.println("-------------------");
    }
    
    
}
