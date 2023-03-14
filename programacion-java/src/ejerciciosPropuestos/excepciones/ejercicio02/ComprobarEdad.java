package ejerciciosPropuestos.excepciones.ejercicio02;

public class ComprobarEdad {
    public void validadEdad(String entrada) throws ControlarEdadNumeroException {
        int edad;
        try {
            edad = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            throw new ControlarEdadNumeroException("Tienes que introducir un número válido");
        }
    }
}