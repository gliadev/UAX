package ejerciciosPropuestos.POO.ejercicioPOO02.libro;

public class Libro {

    // Atributos

    // Hacer un programa que cree una clase Libro con los atributos título, autor y número de páginas

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean prestado;

    // Constructores

    // La clase contendrá un constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroPaginas = 0;
        this.prestado = false;
    }

    // Un constructor con parámetros
    public Libro (String titulo, String autor, int numeroPaginas, boolean prestado){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = prestado;
    }

    // Metodos

    // Metodo prestamo
    public void prestarLibro(){
        prestado = true;
    }

    // Metodo devolver libro
    public void devolverLibro(){
        prestado = false;
    }



    // Metodos GET y SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
