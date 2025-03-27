package unidad05_Tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class U05_T_A09 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        // Crear una tabla de 20 elementos con números aleatorios entre 1 y 100
        int[] t = new int[20];
        for (int i = 0; i < t.length; i++) {
            t[i] = rand.nextInt(100) + 1;
        }
        
        // Solicitar los índices
        System.out.print("Introduce el índice 'desde': ");
        int d = sc.nextInt();
        System.out.print("Introduce el índice 'hasta': ");
        int h = sc.nextInt();
        
        // Usar copyOfRange para obtener la nueva tabla
        int[] copiaRango = Arrays.copyOfRange(t, d, h);
        
        // Mostrar las tablas
        System.out.println("Tabla original: " + Arrays.toString(t));
        System.out.println("Rango copiado (" + d + " a " + h + "): " + Arrays.toString(copiaRango));
    }
}
