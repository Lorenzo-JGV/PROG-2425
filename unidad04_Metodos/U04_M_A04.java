package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A04 {
        public static int numMax(int  num1, int  num2){
                return (num1 >num2) ? num1 : num2;
        }
        
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                //Imprimir el primer número introducido
                System.out.println("Introduce tu primer número: ");
                int num1 = sc.nextInt();
                
                //Imprimir el primer número introducido
                System.out.println("Introduce tu segundo número: ");
                int num2 = sc.nextInt();
                
                //Imprimir por pantalla el numero más mayor 
                System.out.println("El número máximo es: " + numMax(num1, num2) );
        }

}
