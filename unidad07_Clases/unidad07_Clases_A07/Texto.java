package unidad07_Clases_A07;

/**
 *
 * @author loren
 */
import java.time.LocalDateTime;

public class Texto {
    private String cadena;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;

    // Constructor
    public Texto(int longitudMaxima) {
        this.cadena = "";
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDateTime.now();
        this.ultimaModificacion = LocalDateTime.now();
    }

    // Método para añadir un carácter al inicio
    public boolean añadirCaracterInicio(char caracter) {
        if (cadena.length() + 1 <= longitudMaxima) {
            cadena = caracter + cadena;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // Método para añadir un carácter al final
    public boolean añadirCaracterFin(char caracter) {
        if (cadena.length() + 1 <= longitudMaxima) {
            cadena = cadena + caracter;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // Método para añadir una cadena al inicio
    public boolean añadirCadenaInicio(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            cadena = texto + cadena;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // Método para añadir una cadena al final
    public boolean añadirCadenaFin(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            cadena = cadena + texto; // Añade la cadena al final
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // Método para contar las vocales (mayúsculas y minúsculas) en la cadena
    public int contarVocales() {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método para mostrar la información del texto
    public void mostrarInformacion() {
        System.out.println("Texto: " + cadena);
        System.out.println("Longitud máxima permitida: " + longitudMaxima);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Última modificación: " + ultimaModificacion);
        System.out.println("Número de vocales en el texto: " + contarVocales());
    }

    // Método privado para actualizar la fecha y hora de la última modificación
    private void actualizarUltimaModificacion() {
        this.ultimaModificacion = LocalDateTime.now();
    }
}