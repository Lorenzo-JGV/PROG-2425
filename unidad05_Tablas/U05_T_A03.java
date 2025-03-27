package unidad05_Tablas;

import java.util.Scanner;

public class U05_T_A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario cuántos números desea introducir
        System.out.println("¿Cuántos números deseas introducir?");
        int cantidad = sc.nextInt();

        // Crear un array para almacenar los números
        int num[] = new int[cantidad];

        // Introduce los números por teclado
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            num[i] = sc.nextInt();
        }

        // Mostrar el número contrario introducido
        System.out.println("Los números en orden contrario son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
