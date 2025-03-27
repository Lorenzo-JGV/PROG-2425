package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una nota del 0 al 10: ");
        int nota = sc.nextInt();
        
        switch(nota){
            case 0,1,2,3,4 :
                System.out.println("Insuficiente: " + nota);
                break ;
                
            case 5 :
                System.out.println("Suficiente: " + nota);
                break ;
                
            case 6 :
                System.out.println("Bien: " + nota);
                break ;
                
            case 7,8 :
                System.out.println("Notable: " + nota);
                break ;
                
            case 9,10 :
                System.out.println("Sobresaliente: " + nota);
                break ;
            
            default  :
                System.out.println("Incorrecto");
            }
        }
    }
