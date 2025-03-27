package unidad05_Tablas;

import java.util.Arrays;

public class U05_T_A07 {
    public static void main(String[] args) {
        int[] apuesta = {6, 4, 3, 7, 9, 1};
        int[] ganadora = {5, 1, 2, 5, 3, 5};

        // Ordena la tabla ganadora para aplicar búsquedas binaria
        Arrays.sort(ganadora);

        // Llamar al método comprobarAciertos y mostrar el resultado
        int aciertos = comprobarAciertos(apuesta, ganadora);
        System.out.println("Número de aciertos: " + aciertos);
    }

    public static int comprobarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;
        for (int numApuesta : apuesta) {
            // Usar búsqueda binaria para comprobar si el número de la apuesta está en la combinación ganadora
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }
}

