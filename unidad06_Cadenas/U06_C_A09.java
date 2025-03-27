//9.- (U06-A9.java) Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. 
//Un ejemplo de frase palíndroma es: «Dábale arroz a la zorra el abad».
//Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String salida = sc.nextLine();
        
        // Eliminamos espacios y convertimos a minúsculas
        String fraseLimpia = salida.replaceAll("\\s+", "").toLowerCase();
        
        // Verificamos si es palíndromañp
        boolean esPalindrome = esPalindrome(fraseLimpia);
        
        if (esPalindrome) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }
    
    public static boolean esPalindrome(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        
        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
