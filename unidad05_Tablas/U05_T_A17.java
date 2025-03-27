import java.util.Arrays;

/*public class U05_T_A17 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Llenar la matriz con valores
        for (int n = 0; n < matriz.length; n++) {
            for (int m = 0; m < matriz[n].length; m++) {
                matriz[n][m] = 10 * n + m;
            }
        }

        // Mostrar el contenido de la matriz utilizando Arrays.deepToString()
        System.out.println(Arrays.deepToString(matriz));
    }
}

*/
// for-each
public class U05_T_A17 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        // Rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 10 * i + j;
            }
        }
        
        // Mostrar el contenido de la matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}