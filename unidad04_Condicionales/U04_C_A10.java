package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A10 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce el día: ");
            int day = sc.nextInt();
            
            System.out.println("Introduce el mes: ");
            int month =sc.nextInt();
            
            System.out.println("Introduce el año: ");
            int year = sc.nextInt();
            
            boolean fechaA = true ;
           
            // DÍA y AÑO 
            if (month >=1 && month <=12 && year >= 0 && year <=2025){
                
            // MES 
           switch (month) {
                case 1,3,5,7,8,10,12 :
                    if(day < 1 || day >31){
                        System.out.println("La fecha es INCORRECTA!!");
                            fechaA = false;
                      }  else {
                            System.out.println("La fecha es: " + day + "-" + month+"-" + year);
                            fechaA = true;
                    }
                    break;
                    
                   case  4,6,9,11 :
                       if(day < 1 || day >30){
                           System.out.println("La fecha es INCORRECTA!!");
                            fechaA = false;
                      }  else {
                            System.out.println("La fecha es: " + day + "-" + month+"-" + year);
                            fechaA = true;
                       }
                       break;
                       
                       
                    case  2 :
                      if(day < 1 || day >28){
                            System.out.println("La fecha es INCORRECTA!!");
                            fechaA = false;
                      }  else {
                            System.out.println("La fecha es: " + day + "-" + month+"-" + year);
                            fechaA = true;
                      }
                      break;
                    
              }
        }
    }
}