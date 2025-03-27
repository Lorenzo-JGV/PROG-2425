package unidad05_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class U05_T_A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar tamaño de la tabla
        System.out.print("Introduce el tamaño de la tabla: ");
        int tamaño = sc.nextInt();
        
        int[] tabla = new int[tamaño];
        
        // Solicitar los valores de la tabla
        System.out.println("Introduce los " + tamaño + " valores para la tabla:");
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = sc.nextInt();
        }
        
        // Crear una copia de la tabla con 5 elementos adicionales
        int[] copia = Arrays.copyOf(tabla, tamaño + 5);
        
        // Mostrar la tabla original y la copia
        System.out.println("Tabla original: " + Arrays.toString(tabla));
        System.out.println("Copia de la tabla (con 5 elementos adicionales): " + Arrays.toString(copia));
    }
}
