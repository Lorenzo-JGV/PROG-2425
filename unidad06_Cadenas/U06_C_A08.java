//8.- (U06-A8.java) Crear un programa que solicite palabras una a una. 
//Terminar cuando alguna de las palabras introducidas sea la cadena «fin» escrita con cualquier combinación de mayúsculas y minúsculas. 
//Mostrar la frase completa con todas las palabras introducidas separando las palabras introducidas con espacios en blanco. La cadena «fin» no aparecerá en la frase final.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String palabra;
        
        System.out.println("Introduce palabras una a una. Escribe 'fin' para terminar:");
        
        while (true) {
            palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            frase += palabra + " ";
        }
        
        System.out.println("Frase completa: " + frase.trim());
    }
}

