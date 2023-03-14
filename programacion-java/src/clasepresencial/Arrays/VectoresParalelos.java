package clasepresencial.Arrays;
/**
 * Vectores paralelos. Se pretende emular el almacén de una tienda virtual a través de vectores paralelos. Para ello se dispone de los siguientes arrays:
 *
 * ·       Nombre del producto
 *
 * ·       Precios del producto
 *
 * ·       Stock del producto
 *
 *
 *
 *      Lápiz        Bolígrafo      Sacapuntas      Borrador        Tiza
        1.95         9.99           0.99            0.89            4.99
        200          145            300             500             1000
 *
 *  Se pide que el programa realice las siguientes operaciones:
 *
 * a)    Visualizar por pantalla un resumen de todo lo que hay en el almacén.
 *
 * b)    Si se vendiera todo, ¿cuánto dinero recibiría la tienda?
 *
 * c)     Mostar aquellos productos que tengan un stock menor de 250.
 *
 * d)    Debido a la huelga de transportes, vamos a incrementar el precio de los productos un 10%,.
 *       Crea un nuevo vector con el valor calculado (no se modfica el de precios)
 *
 */

public class VectoresParalelos {
    public static void main(String[] args) {


        String[] productos = {"Lápiz", "Bolígrafo", "Sacapuntas", "Borrador", "Tiza"};
        double[] precios = {1.95, 9.99, 0.99, 0.89, 4.99};
        int[] stock = {200, 145, 300, 500, 1000};

        // a) Visualizar por pantalla un resumen de todo lo que hay en el almacén.
        System.out.println("Resumen del almacén:");
        System.out.println("Producto\tPrecio\tStock");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + "\t\t" + precios[i] + "\t" + stock[i]);
        }

        // b) Si se vendiera todo, ¿cuánto dinero recibiría la tienda?
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += precios[i] * stock[i];
        }
        System.out.println("\nSi se vendiera todo, la tienda recibiría " + total + "€");

        // c) Mostar aquellos productos que tengan un stock menor de 250.
        System.out.println("\nProductos con stock menor de 250:");
        System.out.println("Producto\tStock");
        for (int i = 0; i < productos.length; i++) {
            if (stock[i] < 250) {
                System.out.println(productos[i] + "\t\t" + stock[i]);
            }
        }

        // d) Debido a la huelga de transportes, vamos a incrementar el precio de los productos un 10%.
        System.out.println("\nNuevos precios con un incremento del 10%:");
        System.out.println("Producto\tPrecio");
        double[] nuevosPrecios = new double[precios.length];
        for (int i = 0; i < productos.length; i++) {
            nuevosPrecios[i] = precios[i] * 1.10;
            System.out.println(productos[i] + "\t\t" + nuevosPrecios[i]);
        }
    }
}





