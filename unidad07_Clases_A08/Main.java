package unidad07_Clases_A08;

import java.util.Scanner;
import unidad07_Clases_A06.Tiempo_A06;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minuto = scanner.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundo = scanner.nextInt();

        System.out.print("Introduce el número de veces a incrementar: ");
        int n = scanner.nextInt();

        Tiempo_A06 tiempo = new Tiempo_A06(hora, minuto, segundo);

        System.out.println("Hora inicial: " + tiempo.obtenerTiempoFormato());
        for (int i = 1; i <= n; i++) {
            tiempo.incrementarSegundo();
            System.out.println("Incremento " + i + ": " + tiempo.obtenerTiempoFormato());
        }
    }
}