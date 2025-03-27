package unidad04_Metodos;

import java.util.Scanner;


public class U04_M_A07 {
        public static int calcularSeg(int dias, int horas, int minutos) {
                int segundos = (dias * 24* 3600) + (horas * 3600) + (minutos * 60);
                return segundos;
        }
        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Introduce el número de días: ");
                int dias =sc.nextInt();
                System.out.println("Introduce el número de horas: ");
                int horas =sc.nextInt();
                System.out.println("Introduce el número de minutos: ");
                int minutos =sc.nextInt();
                
                int segundosTotales = calcularSeg(dias, horas, minutos);
                System.out.println("El total de los segundos es: " + segundosTotales);
        }
}
 