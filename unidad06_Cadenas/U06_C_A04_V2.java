import java.util.Scanner;

public class  U06_C_A04_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer jugador, introduce la contraseña:");
        String contrasena = sc.nextLine();

        int longitud = contrasena.length();
        System.out.println("La longitud de la contraseña es: " + longitud);

        String intento;
        do {
            System.out.println("Segundo jugador, introduce tu intento:");
            intento = sc.nextLine();

            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < longitud; i++) {
                if (i < intento.length() && intento.charAt(i) == contrasena.charAt(i)) {
                    resultado.append(intento.charAt(i));
                } else {
                    resultado.append('*');
                }
            }

            System.out.println("Resultado: " + resultado.toString());

            if (intento.equals(contrasena)) {
                System.out.println("¡Has acertado la contraseña!");
            }
        } while (!intento.equals(contrasena));
    }
}
