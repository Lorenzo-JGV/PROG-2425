package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A05 {
    public static boolean esVocal(String letra) {
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        String input = sc.nextLine();

        if (input.length() == 1) {
            if (esVocal(input)) {
                System.out.println("La letra introducida " + input + " es una vocal.");
            } else {
                System.out.println("La letra introducida " + input + " no es una vocal.");
            }
        } else {
            System.out.println("Por favor, introduce solo una letra.");
        }
    }
}
