package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A01 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 01
        
        //Introduce un número
        System.out.println("Introduce un número: ");
        int num01 = sc.nextInt();
        
      //Calcula si el número es par o impar
       if(num01 %2 == 0 ){
           System.out.println("El número introducido es par: ");
       } else {
           System.out.println("El número introducido es impar");
       }
    }
}