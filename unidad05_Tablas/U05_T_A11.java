package unidad05_Tablas;

public class U05_T_A11 {
    public static int[] sinRepetidos(int[] t) {
        int[] resultado = new int[t.length];
        int contador = 0;
        
        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < contador; j++) {
                if (t[i] == resultado[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                resultado[contador] = t[i];
                contador++;
            }
        }
        
        // Crear un arreglo de tamaño exacto
        int[] finalResult = new int[contador];
        System.arraycopy(resultado, 0, finalResult, 0, contador);
        return finalResult;
    }

    public static void main(String[] args) {
        int[] tabla = {1, 2, 2, 3, 4, 4};
        int[] sinRepetidos = sinRepetidos(tabla);
        System.out.println(java.util.Arrays.toString(sinRepetidos));
    }
}