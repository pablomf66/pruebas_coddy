package prueba_coddy;

import java.util.Arrays;
import java.util.Scanner;


public class Prueba_Arrays {
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] resultado = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, resultado,0,arr1.length);
        System.arraycopy(arr2, 0, resultado,arr1.length,arr2.length);
        Arrays.sort(resultado);

        return resultado;
    }

    public static void main(String[] args) {
    	System.out.println("Introduce 2 arrays separados por comas");
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}