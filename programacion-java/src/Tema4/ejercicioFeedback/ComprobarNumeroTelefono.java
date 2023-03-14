package Tema4.ejercicioFeedback;

public class ComprobarNumeroTelefono {

    public void validarTelefono(String numeroTelefono) throws ControlarNumeroTelefonoException {

        // si la longitud del numero de telefono es distinto a 9
        // y el segundo si es distinto de 6, 7 o 9 movil o fijo paso el mensaje de error
        // le meto dos if if porque quiero que controle esos dos coasas no si if uno otro else
        // y por el char controlo ese pimer digito
        char digito0 = numeroTelefono.charAt(0);

        if(numeroTelefono.length() != 9) {
            throw new ControlarNumeroTelefonoException("El numero de telefono tiene que terner 9 numeros ");
        }

        if(digito0 != '6'&& digito0 != '7' && digito0 != '9' ){
            throw new ControlarNumeroTelefonoException("Error los numeros de Telefono empiezan por:  6, 7 o 9");
        }
        if (digito0 != '6'&& digito0 != '7' && digito0 != '9' && numeroTelefono.length() != 9  ){
            throw new ControlarNumeroTelefonoException("El telefono tiene que tener 9 digitos y empezar por 6,7 o 9");
        }
    }
}
