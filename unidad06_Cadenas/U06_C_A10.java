//10.- (U06-A10.java) Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra. 
//Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un programa que solicite al usuario dos palabras e indique si son anagramas una de otra.


package unidad06_Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class U06_C_A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String primeraPalabra = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String segundaPalabra = sc.nextLine();

        if (esAnagrama(primeraPalabra, segundaPalabra)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
    }

    public static boolean esAnagrama(String  palabra1, String  palabra2) {
        char[] palabra1Array = palabra1.toCharArray();
        char[] palabra2Array = palabra2.toCharArray();

        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);

        return Arrays.equals(palabra1Array, palabra2Array);
    }
}
