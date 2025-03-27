package unidad05_Tablas;

public class U05_T_A04 {
    public static void main(String[] args) {
        int tabla[] = {5, 3, 9, 1, 7};

        // Llamar a la función max y mostrar por pantalla el resultado
        int maxValor = maximo(tabla);
        System.out.println("El máximo valor en la tabla es: " + maxValor);
    }

    public static int maximo(int t[]) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i]; 
            }
        }
        return max;
    }
}
