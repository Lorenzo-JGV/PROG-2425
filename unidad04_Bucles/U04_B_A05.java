package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opCorrecta = 0;
            int resultado ;
            int numero01; 
            int numero02 ;
            
            
            do {
                     numero01 = (int) (Math.random() * 100+1);
                     numero02 = (int) (Math.random() * 100+1);
                    
                    System.out.println("La suma del " + numero01 + " + " + numero02 +" es: ");
                    resultado = sc.nextInt();
                    
                    if (resultado == (numero01 + numero02)){
                        opCorrecta ++;
                        System.out.println("Operción bien realizada");
                    } else {
                        System.out.println("Operción mal realizada, se ha acabado el juego");
                    }
                    System.out.println("Número de operaciones que has realizado bien: " + opCorrecta);
            } while ( resultado == (numero01 + numero02));
    }
            
}