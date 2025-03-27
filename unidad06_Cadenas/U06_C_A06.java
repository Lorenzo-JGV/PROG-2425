//6.- (U06-A6.java) Diseñar un programa que solicite al usuario una frase y una palabra. A continuación, buscará cuántas veces aparece la palabra en la frase.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();

        // Convertir la frase a minúsculas para buscar entre mayúsculas/minúsculas
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        // Contar las veces que se repite la palabra
        int contador = 0;
        int index = frase.indexOf(palabra);
        while (index != -1) {
            contador++;
            index = frase.indexOf(palabra, index + palabra.length());
        }

        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en la frase.");
    }
}
