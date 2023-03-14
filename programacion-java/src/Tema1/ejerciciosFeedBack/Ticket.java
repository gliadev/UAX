package Tema1.ejerciciosFeedBack;

import java.util.Scanner;

public class Ticket {
   /* Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
   Mostrar lo que debe abonar el comprador teniendo en cuenta una rebaja de un 20%.
    */
    static final int DESCUENTO = 20;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadProductos;
        double precioProducto;

        System.out.println("Este programa te pedira, la cantiddad de productors y precio de estos, " +
                "mostrara el precio, la rebaja y el total a pagar.");

        System.out.println("Introduce la cantidad de productos que llevas");
        cantidadProductos = teclado.nextInt();

        System.out.println("Introduce el precio del producto");
        precioProducto = teclado.nextDouble();

        double precioSinDescuento = cantidadProductos * precioProducto;
        double descuento = (precioSinDescuento * DESCUENTO) / 100;
        double precioTotal = precioSinDescuento - descuento;

        System.out.println("Este es tu ticket");
        System.out.println("Llevas un total de : " + cantidadProductos + " producto-s");
        System.out.println("Con un valor de: " + precioProducto);
        System.out.println();
        System.out.println("Se te aplica un descuento del " + DESCUENTO + "% sobre el valor");
        System.out.println();
        System.out.println("El valor de la compra sin descuento es: " + precioSinDescuento + " %");
        System.out.println();
        System.out.println("Tines un descuento de: " + descuento + " Euros");
        System.out.println();
        System.out.println("El precio Total con el descuento de la compra es: " + precioTotal + " Euros");
        System.out.println("Gracias por comprar con nosotros");



    }
}
