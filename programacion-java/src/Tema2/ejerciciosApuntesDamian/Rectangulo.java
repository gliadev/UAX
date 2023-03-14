package Tema2.ejerciciosApuntesDamian;

public class Rectangulo {

    int lado1;
    int lado2;

    public double area(){
        double calculoArea = lado1 * lado2;
        return calculoArea;
    }

    public double perimetro(){
        double caculoPerimetro = ( lado1 * 2 ) + ( lado2 * 2 );
        return caculoPerimetro;
    }
}
