package ejerciciosPropuestos.excepciones.ejercicio01;

public class ComprobarDivision {

    public void validarDivision(double operador1, double operador2)throws ControlarNumeroException{
        try{
            double resultado = operador1 / operador2;

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
