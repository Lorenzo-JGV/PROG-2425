package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A03 {
    public static void calcularCilindro(int tipoCalculo, double radioBase, double alturaCilindro) {
        final double PI = Math.PI;
        switch (tipoCalculo) {
            case 1 -> {
                double area = 2 * PI * radioBase * (radioBase + alturaCilindro);
                System.out.println("El área del cilindro es: " + area);
            }
            case 2 -> {
                double volumen = PI * radioBase * radioBase * alturaCilindro;
                System.out.println("El volumen del cilindro es: " + volumen);
            }
            default -> System.out.println("Opción inválida");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la opción (1 para área, 2 para volumen): ");
        int opcionUsuario = sc.nextInt();
        System.out.print("Introduce el radio del cilindro: ");
        double radioUsuario = sc.nextDouble();
        System.out.print("Introduce la altura del cilindro: ");
        double alturaUsuario = sc.nextDouble();
        calcularCilindro(opcionUsuario, radioUsuario, alturaUsuario);
    }
}
