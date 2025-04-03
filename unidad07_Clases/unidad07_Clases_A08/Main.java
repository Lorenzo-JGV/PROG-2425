package unidad07_Clases_A08;

import java.util.Scanner;
import unidad07_Clases_A06.Tiempo_A06;

public class Main {
    public static void main(String[] args) {
        // Crear un sintonizador con la frecuencia por defecto (80.0 MHz)
        SintonizadorFM radio1 = new SintonizadorFM();
        radio1.mostrarFrecuencia();

        // Subir la frecuencia varias veces
        radio1.subirFrecuencia();
        radio1.mostrarFrecuencia();

        radio1.subirFrecuencia();
        radio1.mostrarFrecuencia();

        // Bajar la frecuencia
        radio1.bajarFrecuencia();
        radio1.mostrarFrecuencia();

        // Crear un sintonizador con una frecuencia específica
        SintonizadorFM radio2 = new SintonizadorFM(107.5);
        radio2.mostrarFrecuencia();

        // Probar los límites (pasar de 108 a 80 y de 80 a 108)
        radio2.subirFrecuencia(); // Debe reiniciar a 80.0
        radio2.mostrarFrecuencia();

        SintonizadorFM radio3 = new SintonizadorFM(80.0);
        radio3.bajarFrecuencia(); // Debe ir a 108.0
        radio3.mostrarFrecuencia();
    }
}