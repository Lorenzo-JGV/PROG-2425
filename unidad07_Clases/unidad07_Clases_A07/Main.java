package unidad07_Clases_A07;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Texto con una longitud máxima de 20 caracteres
        Texto texto = new Texto(20);

        // Añadir un carácter al final
        texto.añadirCaracterFin('A');
        
        // Añadir un carácter al principio
        texto.añadirCaracterInicio('B');

        // Añadir una cadena al final
        texto.añadirCadenaFin("CD");

        // Añadir una cadena al principio
        texto.añadirCadenaInicio("Hola");

        // Mostrar la información del texto
        texto.mostrarInformacion();

        // Intentar añadir una cadena que excede la longitud máxima
        boolean añadido = texto.añadirCadenaFin("12345678901234567890"); // Excede el tamaño
        if (!añadido) {
            System.out.println("No se pudo añadir la cadena porque excede el tamaño máximo.");
        }

        // Contar las vocales y mostrar el resultado
        System.out.println("Número de vocales: " + texto.contarVocales());
    }
}
