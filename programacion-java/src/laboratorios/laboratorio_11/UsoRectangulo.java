package laboratorios.laboratorio_11;

import org.w3c.dom.css.Rect;

public class UsoRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3, 6.0);

        Rectangulo rectangulo2 = new Rectangulo(1,11);


        System.out.println("Area de R1" + rectangulo1.area());
        System.out.println("Perimetro del R2" + rectangulo1.perimetro());
        System.out.println(rectangulo1.getLado1());
        rectangulo1.setLado1(45);
        System.out.println(rectangulo1.getLado1());


    }
}
