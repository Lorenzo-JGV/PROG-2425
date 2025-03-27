//1. Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducción de las frases por teclado
        System.out.println("Introduce la primera frase:");
        String primeraFrase = sc.nextLine();
        System.out.println("Introduce la segunda frase:");
        String segndaFrase= sc.nextLine();

        // Comparación de las longitudes de las frases
        if (primeraFrase .length() < segndaFrase.length()) {
            System.out.println("La primera frase es la más corta.");
        } else if (primeraFrase .length() > segndaFrase.length()) {
            System.out.println("La segunda frase es la más corta.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
}
