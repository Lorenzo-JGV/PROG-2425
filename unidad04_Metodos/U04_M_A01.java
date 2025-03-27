package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A01 {
    public static void mensajeEco(int numVeces) {
        for (int i = 0; i < numVeces; i++) {
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola! Bienvenido al programa de eco.");
        System.out.print("Introduce el número de veces que quieres escuchar 'Eco...': ");
        int numVeces = scanner.nextInt();
        System.out.println("¡Genial! Aquí van tus ecos:");
        mensajeEco(numVeces);
        System.out.println("¡Espero que hayas disfrutado de los ecos!");
    }
}
