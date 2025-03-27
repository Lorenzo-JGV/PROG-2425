package unidad05_Tablas;

public class U05_T_A01 {
    public static void main(String[] args) {
        int[] tabla = new int[10];

        llenarTabla(tabla, 0);

        int suma = sumarTabla(tabla, 0);

        System.out.println("Suma de todos los números: " + suma);
    }

    public static void llenarTabla(int[] tabla, int indice) {
        if (indice < tabla.length) {
            tabla[indice] = (int) (Math.random() * 100) + 1;
            llenarTabla(tabla, indice + 1);
        }
    }

    public static int sumarTabla(int[] tabla, int indice) {
        if (indice == tabla.length) {
            return 0;
        } else {
            return tabla[indice] + sumarTabla(tabla, indice + 1);
        }
    }
}
