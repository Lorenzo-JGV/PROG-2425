package unidad07_Clases_A08;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear un sintonizador con la frecuencia por defecto
        SintonizadorFM sintonizador = new SintonizadorFM();
        sintonizador.mostrarFrecuencia();

        // Subir la frecuencia varias veces
        for (int i = 0; i < 10; i++) {
            sintonizador.subirFrecuencia();
            sintonizador.mostrarFrecuencia();
        }

        // Bajar la frecuencia varias veces
        for (int i = 0; i < 10; i++) {
            sintonizador.bajarFrecuencia();
            sintonizador.mostrarFrecuencia();
        }

        // Crear un sintonizador con una frecuencia inicial válida
        SintonizadorFM sintonizadorInicial = new SintonizadorFM(100.5);
        sintonizadorInicial.mostrarFrecuencia();

        // Crear un sintonizador con una frecuencia inicial fuera de rango
        SintonizadorFM sintonizadorInvalido = new SintonizadorFM(120.0);
        sintonizadorInvalido.mostrarFrecuencia();
    }
}
