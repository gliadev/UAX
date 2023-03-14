package ejerciciosPropuestos.POO.ejercicioPOO04.cancion;
/*
 *
 * Hacer una clase Principal, que cree 4 canciones 2 de cada tipo de
 * constructor y pruebe la funcionalidad de los métodos programados
 *
 * */


public class UsoCancion {
    public static void main(String[] args) {


        Cancion cancionUno = new Cancion();
        Cancion cancionDos = new Cancion();
        Cancion cancionTres = new Cancion("Viva la fiesta", "Paco Pil");
        Cancion cancionCuatro = new Cancion("Esta si esta no", "Chimo Bayo");

        cancionUno.ponAutor("Shakira");
        cancionUno.ponTitulo("Salpike");


        System.out.println("Titulo de la cancion " + cancionUno.dameAutor());
        System.out.println("Titulo de la cancion " + cancionUno.dameTitulo());



    }


}
