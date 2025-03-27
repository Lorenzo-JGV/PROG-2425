package unidad05_Tablas; 

import java.util.Scanner;

public class U05_T_A02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        // Pedir al usuario que introduzca 5 números decimales
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número decimal (" + (i + 1) + "/5): ");
            numeros[i] = scanner.nextDouble();
        }

        // Mostrar los números en orden
        System.out.println("Los números introducidos son:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

    }
}
