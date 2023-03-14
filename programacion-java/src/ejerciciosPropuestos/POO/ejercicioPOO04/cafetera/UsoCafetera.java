package ejerciciosPropuestos.POO.ejercicioPOO04.cafetera;

public class UsoCafetera {
    public static void main(String[] args) {
        Cafetera deLonghi = new Cafetera();
        Cafetera nessPreso = new Cafetera(1500);
        Cafetera dolceGusto = new Cafetera(1600, 2000);


        deLonghi.setNombre("deLonghi");
        nessPreso.setNombre("nessPreso");
        dolceGusto.setNombre("dolceGusto");

        deLonghi.mostrarContenido();;
        nessPreso.mostrarContenido();
        dolceGusto.mostrarContenido();

        deLonghi.llenarCafetera();
        deLonghi.mostrarContenido();

        nessPreso.servirTaza(600);
        nessPreso.mostrarContenido();
        nessPreso.servirTaza(800);
        nessPreso.mostrarContenido();
        nessPreso.servirTaza(1000);
        nessPreso.mostrarContenido();

        dolceGusto.vaciarCafetera();
        dolceGusto.mostrarContenido();




    }
}
