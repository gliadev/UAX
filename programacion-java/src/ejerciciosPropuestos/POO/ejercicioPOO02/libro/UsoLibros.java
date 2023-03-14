package ejerciciosPropuestos.POO.ejercicioPOO02.libro;

public class UsoLibros {
    public static void main(String[] args) {

        // Programar una clase principal que defina 3 libros y pruebe la funcionalidad de la clase.
        Libro libro1 = new Libro("El señor de los anillos", "Noseque Tolkien", 253,false);
        Libro libro2 = new Libro("las dos torres", "Vete a saber", 124,true);
        Libro Libro3 = new Libro("Susanita tiene un ratos", "Miliko", 245,false);


        System.out.println(libro1.isPrestado());
        libro1.prestarLibro();
        System.out.println(libro1.isPrestado());
        libro1.devolverLibro();
        System.out.println(libro1.isPrestado());

    }

}
