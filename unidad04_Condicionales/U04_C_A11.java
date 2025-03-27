package unidad04_Condicionales;

import java.util.Scanner;
        
public class U04_C_A11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la hora actual con esta estructura(hh mm ss): ");
        int hora = sc.nextInt();
        int min =sc.nextInt();
        int sec = sc.nextInt();
       
        boolean horaC = true;
        
           // HORAS
               if(hora <0 || hora >23){
                  horaC = false;
               }
           
           //MINUTOS
              if(min <0 || min >59){
                  horaC = false;
                      System.out.println("Los minutos estan mal: "); 
               }
                       
            //SEGUNDOS
                if(sec <0 || sec >59){
                    horaC = false;
                        System.out.println("Los segundos estan mal: ");   
                 }
                      
            // Condicionales para sumar  1  y reiniciarlos 
                       if(horaC){
                           
                       // SEGUNDOS 
                        sec ++;
                        if(sec > 59){
                             sec = 0;
                             min ++;
                        }
                        // MINUTOS
                        if(min > 59){
                            min = 0;
                            hora ++;      
                        }    
                       // HORAS
                        if(hora > 23){
                            hora = 0;
                       }

            // Mostrar la hora actual
            System.out.println("La hora actual es: " + hora + "-" + min + "-" + sec);
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }
}
