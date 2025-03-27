// 5.- (U06-A5.java) Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, “Don Quijote de la Mancha" se mostrará «Dn Qjt d l Mnch».

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String nCompleto = sc.nextLine();

        String vocales = "aeiouáéíóú";
        String nombreSinVocales = "";

        for (int i = 0; i < nCompleto.length(); i++) {
            char letra = nCompleto.charAt(i);
            
            // Convertimos la letra a minúscula y verificar su índice esta en la cadena de vocales
            if (vocales.indexOf(Character.toLowerCase(letra)) == -1) {
                nombreSinVocales += letra;
            }
        }

        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }
}

