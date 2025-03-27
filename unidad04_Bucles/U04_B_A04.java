package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A04 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int etiqueta = 0;
                int arbolAlto = -1;
                int alturaMax = -1;
                int alto ;
                
               System.out.println("Introduce la altura del arbol en cm (SALIR - PRESEIONA -1): " );
               alto = sc.nextInt();
                        
                while (alto != -1){      
                        etiqueta ++;
                        if( alto > alturaMax) {
                            arbolAlto = etiqueta;
                            alturaMax = alto;
                        }
                        System.out.println("Introduce la altura del arbol en cm (SALIR - PRESEIONA -1):");
                        alto = sc.nextInt();
                }       
                
                if (arbolAlto != -1) {
                    System.out.println("El arbol mas alto es " + arbolAlto + "  con la altura " + alturaMax + " cm: " );
                } else {
                    System.out.println("Los datos introducidos están mal... ");
                }
        }
}
 