package laboratorios.laboratorio_14;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        JefeProyecto j1 = new JefeProyecto("María", 3, 20);
        Analista a1 = new Analista("Ana", 2, 20);
        Programador p1 = new Programador("Elena", 0);
        
        //System.out.println(Empresa.getEmpleados());
        
        ArrayList<JefeProyecto> jefes = new ArrayList();
        ArrayList<Analista> analistas = new ArrayList();
        ArrayList<Programador> programadores = new ArrayList();

        Empresa e = new Empresa("Zara", jefes, analistas, programadores);
        
        JefeProyecto j2 = new JefeProyecto("Juan", 1, 20);
        
        e.anyadirJefe(j1);
        e.anyadirJefe(j2);
        
        e.anyadirAnalista(a1);
        
        e.anyadirProgramador(p1);
        
        e.listarJefes();
        
        Analista a2=new Analista();
        System.out.println(a2.getNombre());
        System.out.println(a2.getAntiguedad());
        
    }
}
