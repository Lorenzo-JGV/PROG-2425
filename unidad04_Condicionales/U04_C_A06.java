package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //EJERCICIO 06
        
        //Introduce tres números 
        System.out.println("Introduce el primer número: ");
        int num061 = sc.nextInt() ;
        
        System.out.println("Introduce el segundo número: ");
        int num062 = sc.nextInt() ;
        
        System.out.println("Introduce el primer número: ");
        int num063 = sc.nextInt() ;
        
        //Ordenarlos de mayor a menor mediante anidados
        if(num061 >=  num062 && num061 >= num063){
            System.out.println("El orden de mayor a menor es : " + num061 + "," + (num062 >= num063 ?  num062 + "," + num063: num063 + "," + num062));
        } else if (num062 >= num061 && num062 >= num063){
            System.out.println("El orden de mayor a menor es : " + num062 + "," + (num061 >= num063 ?  num061 + "," + num063: num063 + "," + num061));
        } else {
            System.out.println("El orden de mayor a menor es : " + num063 + "," + (num061 >= num062 ?  num061 + "," + num062: num062 + "," + num061));
        }
    }
}
