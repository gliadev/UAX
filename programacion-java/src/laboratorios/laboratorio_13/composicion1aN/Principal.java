/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.composicion1aN;

import java.util.ArrayList;

/**
 *
 * @author damiansualdea
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Galleta> galletas = new ArrayList();
        System.out.println(galletas.size());
        Galleta g = new Galleta("Vanilla");
        Galleta g2 = new Galleta("Chocolate");
        for(int i = 1; i<= 20;i++){
            galletas.add(g);
            galletas.add(g2);
        }
        System.out.println(galletas.size());
        
        Caja n = new Caja("Campurrianas", galletas);
        
        for(Galleta galle:n.getGalletas()){
            System.out.println(galle.getSabor());
        }
    }
}
