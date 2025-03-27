package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A01 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); 
                int num;
                    
               //Número introducido por pantalla
                System.out.print("Introduce un número (0 - SALIR): ");
                num = sc.nextInt();
                
                //El número sea diferente de 0
                while ( num != 0) {
                        // Número  Par o Impar
                        if(num % 2 == 0){
                            System.out.println("El número introducido es par : " + num );
                        } else {
                            System.out.println("El número introducido es impar: "+ num );
                        }
                        
                        // Número  Positivo o Negativo
                        if(num > 0){
                            System.out.println("El número introducido es positivo : " + num );
                        } else {
                            System.out.println("El número introducido es negativo: "+ num );
                        }
                        
                        //Cálculo y muestro el cuadrado de num
                        int cuadrado = num * num;
                        System.out.println("El número introducido" + num + " es " + cuadrado);
                        
                        //Introducir otro número
                        System.out.println("El número introducido número  (0 - SALIR ): ");
                        num = sc.nextInt();
                }
                System.out.println("Se ha salido del programa...");
    }
}
