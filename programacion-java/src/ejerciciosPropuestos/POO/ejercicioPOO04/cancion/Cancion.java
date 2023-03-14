package ejerciciosPropuestos.POO.ejercicioPOO04.cancion;


/*
*   clase Canción con los siguientes atributos:
 _ titulo: una variable String que guarda el título de la canción.
 _ autor: una variable String que guarda el autor de la canción.
*
* */
public class Cancion {
    private String titulo;
    private String autor;


    // Constructor que recibe como parametros el titulo y el autor
    public Cancion (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor predeterminado que inicializa el titulo y el autor a cadenas texto vacias
    public Cancion(){
        titulo = "";
        autor = "";
    }

    // Devuelve el titulo de la cancion es GET dameCancion
    public String dameTitulo(){
        return titulo;
    }

    // Devuelve el autor de la cancion es GET dameAutor
    public String dameAutor(){
        return autor;
    }

    // Establece el titulo de la cancion es un SET pontitulo
    public void ponTitulo (String titulo){
        this.titulo = titulo;
    }
    // Establece el titulo de la cancion es un SET ponautor
    public  void ponAutor(String autor){
        this.autor = autor;
    }






}
