package unidad05_Tablas;

import java.util.Scanner;
import java.util.Arrays; // Asegúrate de importar la clase Arrays

public class U05_T_A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int n = sc.nextInt();
        int[] t = new int[n];

        // Leer los números
        System.out.println("Introduce los números:");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        // Crear arreglos para pares e impares
        int[] par= new int[n];
        int[] impar = new int[n];

        // Clasificar los números
        for (int i = 0, p = 0, im = 0; i < n; i++) {
            if (t[i] % 2 == 0) {
                par[p] = t[i];
                p++;
            } else {
                impar[im] = t[i];
                im++;
            }
        }

        // Ordenar los arreglos pares e impares
        Arrays.sort(par);
        Arrays.sort(impar);

        // Mostrar resultados
        System.out.print("Pares: ");
        for (int i = 0; i < n; i++) {
            // Ignorar ceros en el array
            if (par[i] != 0) { 
                System.out.print(par[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Impares: ");
        for (int i = 0; i < n; i++) {
            // Ignorar ceros en el array
            if (impar[i] != 0) { 
                System.out.print(impar[i] + " ");
            }
        }
        System.out.println();
    }
}