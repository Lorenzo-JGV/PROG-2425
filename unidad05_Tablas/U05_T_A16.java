import java.util.Scanner;
import java.util.Random;

public class U05_T_A16 {

    public static boolean equals(int[] a, int[] b) {
        boolean iguales = a.length == b.length;
        for (int i = 0; i < a.length && iguales; i++) {
            iguales = a[i] == b[i];
        }
        return iguales;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de la Cámara Secreta!");
        System.out.print("Elige la longitud de la combinación (de 1 a 5): ");
        int longitud = sc.nextInt();

        while (longitud < 1 || longitud > 5) {
            System.out.print("Inválido. Elige una longitud entre 1 y 5: ");
            longitud = sc.nextInt();
        }

        int[] secreta = new int[longitud];
        for (int i = 0; i < longitud; i++) secreta[i] = random.nextInt(5) + 1;

        int[] intento = new int[longitud];
        boolean acertado;

        do {
            System.out.println("\nIntroduce tu combinación:");
            for (int i = 0; i < longitud; i++) {
                System.out.print("Número para posición " + (i + 1) + ": ");
                intento[i] = sc.nextInt();
                while (intento[i] < 1 || intento[i] > 5) {
                    System.out.print("Inválido. Intenta nuevamente: ");
                    intento[i] = sc.nextInt();
                }
            }

            acertado = equals(intento, secreta);
            if (!acertado) {
                System.out.println("\nCombinación incorrecta. ¡Intenta de nuevo!");
                for (int i = 0; i < longitud; i++) {
                    String mensaje = intento[i] < secreta[i] ? "más pequeño."
                            : intento[i] > secreta[i] ? "más grande."
                            : "correcto!";
                    System.out.println("Posición " + (i + 1) + ": " + mensaje);
                }
            }

        } while (!acertado);

        System.out.println("\n¡Felicidades! Has abierto la cámara secreta.");
    }
}
