package unidad07_Clases_A06;

/**
 *
 * @author loren
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer hora, minuto, segundo y número de veces
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = scanner.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundos = scanner.nextInt();

        System.out.print("Introduce el número de veces n: ");
        int n = scanner.nextInt();

        // Crear objeto Tiempo_A06
        Tiempo_A06 tiempoActual = new Tiempo_A06(hora, minutos, segundos);

        // Mostrar las horas consecutivas
        System.out.println("Horas consecutivas:");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%02d:%02d:%02d\n", tiempoActual.getHora(), tiempoActual.getMinuto(), tiempoActual.getSegundo());
            tiempoActual.incrementarSegundo();
        }
    }
}