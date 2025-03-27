//4. Diseñar el juego «Acierta la contraseña». 
//La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la acierte.

// Version_1 -> El programa indicará si la palabra introducida es mayor o menor alfabéticamente que la contraseña.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A04_V1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1, introduce la contraseña: ");
        String password = sc.nextLine();

        System.out.println("Jugador 2, intenta adivinar la contraseña.");

        String intentos;
        do {
            System.out.print("Introduce una palabra: ");
            intentos = sc.nextLine();

            if (intentos.compareTo(password) < 0) {
                System.out.println("La palabra introducida es menor alfabéticamente que la contraseña.");
            } else if (intentos.compareTo(password) > 0) {
                System.out.println("La palabra introducida es mayor alfabéticamente que la contraseña.");
            }

        } while (!intentos.equals(password));

        System.out.println("¡Has acertado la contraseña!");
    }
}
