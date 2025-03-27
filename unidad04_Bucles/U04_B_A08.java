package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A08 {
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int sum = 0, contador = 10;
                
                System.out.println("Cálculo de la media de números enteros:" + contador);
                
                for (int i = 1; i <= contador; i++){
                        System.out.println("Introduce los números enteros: " + i);
                        sum += sc.nextInt();
                }
                
                double mediaNum = (double) sum / contador;
                System.out.println("La media de números enteros: "+ mediaNum);
         }
}
