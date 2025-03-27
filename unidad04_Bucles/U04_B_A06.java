package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A06 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
                //Lectura del número introducido
                System.out.println("Introduce un número aleatorio : ");
                int numAleatorio = sc.nextInt();
                
                //Bucle desde el 1 hasta N
                for (int i = 1; i <= numAleatorio; i++){
                        System.out.println(i);
                }
        }
}
