package unidad05_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class U05_T_A15 {
    public static void main(String[] args) {
        
        // Inicializa la tabla con valores predeterminados
        int[] t = {2, 4, 6, 8, 10};
        
        System.out.println("Tabla original: " + Arrays.toString(t));
        
        // Solicita al usuario un número entero para eliminar de la tabla
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para eliminar de la tabla: ");
        int numeroAEliminar = sc.nextInt();
        
        // Busca el índice del número a eliminar usando Arrays.binarySearch()
        int indice = Arrays.binarySearch(t, numeroAEliminar);
        
        // Si el número existe en la tabla
        if (indice >= 0) {
            // Desplaza los elementos hacia la izquierda
            System.arraycopy(t, indice + 1, t, indice, t.length - indice - 1);
            // Ajusta la longitud de la tabla
            t = Arrays.copyOf(t, t.length - 1);
            System.out.println("Tabla tras la eliminación: " + Arrays.toString(t));
        } else {
            // Si el número no está en la tabla
            System.out.println("El número " + numeroAEliminar + " no está en la tabla.");
        }
    }
}

