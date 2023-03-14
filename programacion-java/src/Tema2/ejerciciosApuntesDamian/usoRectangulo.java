package Tema2.ejerciciosApuntesDamian;

public class usoRectangulo {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.lado1 = 14;
        rectangulo1.lado2 = 15;

        System.out.println(rectangulo1.perimetro());


        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.lado1 = 21;




        rectangulo2.lado2 = 34;

        System.out.println("El Area del Rectangulo2 es: " + rectangulo2.area());

    }
}
