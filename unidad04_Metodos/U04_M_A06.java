package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A06 {
        public static void pares(int num) {
                for (int i = 0; i < num; i++){
                        System.out.println(i * 2);
                }
        }
        
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Introduce un número: ");
                int num = sc.nextInt();
                
                System.out.println("Los primeros " + num +  " numeros pares son: ");
                pares(num);
        }
}
