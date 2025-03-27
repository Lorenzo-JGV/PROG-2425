package unidad05_Tablas;

public class U05_T_A06 {
    public static void main(String[] args) {
        int[] tablaB= {10, 20, 30, 40, 50};
        int clave = 30;
        int posicion = buscar(tablaB, clave);

        if (posicion != -1) {
            System.out.println("¡Éxito! La clave " + clave + " la encontramos en la posición " + posicion + " de la tabla.");
        } else {
            System.out.println("Vaya, no encontramos la clave " + clave + " en nuestra tabla. Intenta con otro número.");
        }
    }

    public static int buscar(int[] tabla, int clave) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
