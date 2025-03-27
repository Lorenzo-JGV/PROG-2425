
package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número del 1 al 7: ");
        int diaSem = sc.nextInt();
        
        switch (diaSem) {
            case 1-> {
                System.out.println("El primer día es el Lunes");
            }
            case 2 -> {
                System.out.println("El primer día es el Martes");
            }
            case 3 -> {
                System.out.println("El primer día es el Miércoles");
            }
            case 4 ->{
                System.out.println("El primer día es el Jueves");
            }
            case 5 ->{
                System.out.println("El primer día es el Viernes");
            }
            case 6 ->{
                System.out.println("El primer día es el Sábado");
            }
            case 7 -> {
                System.out.println("El primer día es el Domingo");
            }
            default  ->{
                System.out.println("No es ningun día de la semana");
            }
        }
    }
}
