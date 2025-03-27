package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce la fecha: ");

            System.out.println("Introduce el Día: ");
            int day = sc.nextInt();

            System.out.println("Introduce el Mes: ");
            int month = sc.nextInt();

            System.out.println("Introduce el Año: ");
            int year = sc.nextInt();

            boolean esBis = false;

            //AÑO BISIESTO
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                esBis = true;
            }
     
            // Incremento de más 1 día 
            day ++;
    
            // DÍAS AL MES
            switch (month) {
                case 1,3,5,7,8,10,12 :
                    if (day >31){
                        day = 1;
                        month ++;
                    }
                    break;
                case 4,6,9,11 :
                    if (day >30){
                        day = 1;
                        month ++;
                    }
                    break;
                case 2 :
                    if (day >28){
                        day = 1;
                        month ++;
                    }
                    break;
             default :
                    System.out.println("Mes incorrecto: ");
            }
            
            if (month > 12) {
                month = 1;
                year ++;
            }
            
            //Mostrar la fecha del siguiente día
                 System.out.println("La fecha del día siguiente es : " + day + "-" + month + "-" + year); 
                    
          }
}