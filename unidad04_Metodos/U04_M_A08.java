package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A08 {
    // Método para encontrar el máximo de dos números
    public static int numMax(int num1, int num2) {
        return (num1 >= num2) ? num1 : num2;
    }

    // Método para encontrar el máximo de tres números
    public static int numMax(int num1, int num2, int num3) {
        return numMax(numMax(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar los números para el método que encuentra el máximo de dos números
        System.out.println("Introduce el primer número para comparar dos números: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número para comparar dos números: ");
        int num2 = sc.nextInt();
        System.out.println("El número máximo entre dos es: " + numMax(num1, num2));
        
        // Solicitar los números para el método que encuentra el máximo de tres números
        System.out.println("Introduce el primer número para comparar tres números: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el segundo número para comparar tres números: ");
        int num4 = sc.nextInt();
        System.out.println("Introduce el tercer número para comparar tres números: ");
        int num5 = sc.nextInt();
        System.out.println("El número máximo entre tres es: " + numMax(num3, num4, num5));
    }
}
