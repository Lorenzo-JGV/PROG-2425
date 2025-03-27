package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A09 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
       
                System.out.println("Introduce un número: ");
                int numListado = sc.nextInt();
                        
                System.out.println("La tabla de multiplicar del:" + numListado);
                for (int i =1; i <=10; i++) {
                      System.out.println(numListado + "x" + i +"=" + (numListado * i) );
                }
        }
}
