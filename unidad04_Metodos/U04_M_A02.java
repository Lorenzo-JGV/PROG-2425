
package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A02 {
        public static void mostrarNumeros (int  num1, int num2) {
                if(num1 > num2) {
                    int intercambio = num1;
                    num1 = num2;
                    num2 = intercambio;
                }
                for(int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
                }
        }
        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el primer número: ");
                int primerNum = sc.nextInt();
                System.out.println("Introduce el segundo número: ");
                int segundoNum = sc.nextInt();
                System.out.println("Números entre " + primerNum + " y " + segundoNum);
                mostrarNumeros(primerNum, segundoNum);
        }

}
