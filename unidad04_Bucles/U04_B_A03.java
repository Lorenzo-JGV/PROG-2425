package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A03 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        
                //Generar número aleatorioa del 1 al 100
                int numSecreto =(int) (Math.random()*100+1);
                int prueba = 0;
                int numUsuario = 0;

                System.out.println("Bienvenido al juego - (ADIVINA EL NÚMERO SECRETO)");
                System.out.println("Introduce un número del 1 al 100 (SALIR -  PRESIONA -1): ");

                // Adivinar el número 
                while (prueba <10 && numUsuario !=  -1 && numUsuario != numSecreto) {
                    System.out.println("Introduce un número: ");
                    numUsuario = sc.nextInt();

                    if(numUsuario == -1) {
                        System.out.println("Has salido del juego. El número secreto es:  " + numSecreto);
                    } else if ( numUsuario == numSecreto){
                        System.out.println("Has acertado el número secreto:");
                    } else if ( numUsuario > numSecreto){  
                        System.out.println("El número secreto es menor");
                    } else {
                        System.out.println("El número secreto es mayor");
                    }

                    prueba ++;
                }
                if (prueba >= 10 && numUsuario != numSecreto) {
                    System.out.println("Has superado los intentos, el número secreto es: " + numSecreto);
                }          
    }
}
