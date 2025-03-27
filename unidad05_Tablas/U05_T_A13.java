package unidad05_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class U05_T_A13 {
    public static void main(String[] args) {
        // Tabla inicial ordenada
        int[] t = {1, 3, 5, 7, 9}; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para insertar en la tabla: ");
        int num = sc.nextInt();

        // Encontrar el índice de inserción
        int indInsercion = 0;
        while (indInsercion < t.length && t[indInsercion] < num) {
            indInsercion++;
        }

        // Crear una nueva tabla con un espacio adicional
        int[] nuevaT = new int[t.length + 1];
        for (int i = 0; i < indInsercion; i++) {
            nuevaT[i] = t[i];
        }
        nuevaT[indInsercion] = num;
        for (int i = indInsercion; i < t.length; i++) {
            nuevaT[i + 1] = t[i];
        }

        // Mostrar la tabla original y la resultante
        System.out.println("Tabla original: " + Arrays.toString(t));
        System.out.println("Tabla resultante: " + Arrays.toString(nuevaT));
    }
}
