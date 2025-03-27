package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A13 {
        public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
          
                System.out.println("Introduce el tamaño del  triángulo con asteriscos: : ");
                int tamanoA = sc.nextInt();
                
                for (int i =tamanoA; i >0; i--) {
                        for (int j = 0; j < i;  j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
}
