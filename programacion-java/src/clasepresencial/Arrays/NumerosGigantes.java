package clasepresencial.Arrays;

import java.util.ArrayList;


public class NumerosGigantes {
    public static ArrayList<Integer> sumar(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        int acarreo = 0;
        int i = num1.size() - 1;
        int j = num2.size() - 1;
        while (i >= 0 || j >= 0) {
            int suma = acarreo;
            if (i >= 0) {
                suma += num1.get(i);
                i--;
            }
            if (j >= 0) {
                suma += num2.get(j);
                j--;
            }
            resultado.add(suma % 10);
            acarreo = suma / 10;
        }
        if (acarreo > 0) {
            resultado.add(acarreo);
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(9);
        num1.add(2);
        num1.add(4);
        num1.add(5);
        num1.add(7);
        num1.add(3);
        num1.add(2);
        num1.add(4);
        num2.add(9);
        num2.add(5);
        num2.add(1);
        num2.add(5);
        num2.add(1);
        num2.add(9);
        num2.add(1);
        num2.add(3);
        num2.add(2);
        ArrayList<Integer> resultado = sumar(num1, num2);
        System.out.print("Resultado: ");
        for (int i = resultado.size() - 1; i >= 0; i--) {
            System.out.print(resultado.get(i));
        }
        System.out.println();
    }
}


