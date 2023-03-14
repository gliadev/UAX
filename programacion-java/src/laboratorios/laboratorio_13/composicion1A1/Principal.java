/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorios.laboratorio_13.composicion1A1;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        Galleta g = new Galleta("Oreo", 1.3);

        Sobre s = new Sobre("Azul y negro", g);

        System.out.println(s.getColor() + " " + s.getGalleta().getSabor() + " " + s.getGalleta().getPrecio());

        Sobre s2 = new Sobre("Transparente", new Galleta("Mantequilla", 0.3));
        System.out.println(s2.getColor() + " " + s2.getGalleta().getSabor() + " " + s2.getGalleta().getPrecio());

        Galleta g2 = s2.getGalleta();
        g2.setPrecio(3.0);
        g2.setSabor("Carbón");
        
        System.out.println(s2.getGalleta().getSabor());
        
        String c = s2.getColor();
        c = "Azul verdoso";
        System.out.println(s2.getColor());
        
        
        
        
    }

}
