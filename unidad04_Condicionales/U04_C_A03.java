package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A03 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 03
        
        //Introduce dos números
        System.out.println("Introduce el primer número: ");
        int num031 = sc.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        int num032 = sc.nextInt();
        
        //Comprobar que número es mayor
        
        //OPCION 01
       int num031MayorNum032 = num031 > num032 ? num031 : num032;
        System.out.println("Numero mayor: " + num031MayorNum032);
        
       //OPCION 02
       if (num031 >num032) {
            System.out.println("El primer número mayor" );
        }else if (num032 >num031) {
            System.out.println("El segundo número mayor");
        }else {
            System.out.println("Has introducido dos números diferentes");
        }
        
        //Mostrar el número mayor 
        System.out.println("Numero mayor: " + num031MayorNum032);
    }
}