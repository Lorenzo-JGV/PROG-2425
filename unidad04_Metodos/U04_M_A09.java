package unidad04_Metodos;

public class U04_M_A09 {
    
    // POTENCIA VERSIÓN ITERATIVA =
    public static double potenciaIterativa(double base, int exp) {
        double res = 1;
        for (int i = 0; i < exp; i++) {
            res *= base;
        }
        return res;
    }

    //  POTENCIA EN VERSION RECURSIVA =
    public static double potenciaRecursiva(double base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potenciaRecursiva(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Iterativa: " + potenciaIterativa(2, 3));
        System.out.println("Recursiva: " + potenciaRecursiva(2, 3)); 
    }
}
