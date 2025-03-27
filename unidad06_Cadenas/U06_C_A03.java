//3. Diseñar un método al que se le pase una cadena de caracteres y la devuelva invertida. Un ejemplo, la cadena «Hola mundo» quedaría «odnum aloH».

package unidad06_Cadenas;

public class U06_C_A03 {

    public static void main(String[] args) {
        // Ejemplo de cadena a invertir
        String frase = "Bienvenido a la clase 1ºDAW";

        // Invertimos la cadena utilizando el método invertirCadena
        String fraseInvertida = invertirCadena(frase);

        // Mostramos la cadena invertida
        System.out.println("La cadena invertida es: " + fraseInvertida);
    }

    // Método para invertir la cadena
    public static String invertirCadena(String cadena) {
        // StringBuilder permite manipular la cadena fácilmente
        StringBuilder cadenaInvertida = new StringBuilder(cadena);

        // El método reverse() invierte la cadena
        return cadenaInvertida.reverse().toString();
    }
}
