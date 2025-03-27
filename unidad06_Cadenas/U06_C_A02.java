//2. Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducción de la frase por teclado
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        // Contador de espacios en blanco
        int contarEspacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contarEspacios++;
            }
        }

        // Mostrar el número de espacios en blanco
        System.out.println("La frase tiene " + contarEspacios + " espacios en blanco.");
    }
}
