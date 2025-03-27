
package unidad05_Tablas;

public class Ejemplo_02 {
    public static void main(String[] args) {
        double a1[], b2[], c3[];

        a1 = new double[10];
        b2 = new double[10];
        c3 = new double[10];

        b2 = c3;
        c3 = a1; 

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
    }
}
