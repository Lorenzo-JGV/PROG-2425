package unidad05_Tablas;

import java.util.Arrays;
import java.util.Random;

public class U05_T_A05 {
    public static void main(String[] args) {
        int tabla[] = rellenarPares(10, 100);
        System.out.println("Tabla de números pares aleatorios: " + Arrays.toString(tabla));
    }

    public static int[] rellenarPares(int longitud, int fin) {
        int tabla[] = new int[longitud];
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            int numPar;
            do {
                numPar = 2 * (rand.nextInt(fin / 2) + 1);
            } while (numPar > fin);
            tabla[i] = numPar;
        }

        Arrays.sort(tabla); 
        return tabla;
    }
}
