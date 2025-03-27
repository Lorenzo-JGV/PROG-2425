package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A11 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int numF= sc.nextInt();
                int factorialNum =1;
                
                System.out.print("Por favor, introduce un número: ");
                
                for (int i = numF; i >0;  i--) {
                        factorialNum *= i;
                }
                
                System.out.println("El número factorial es: " + factorialNum);
        }
}
