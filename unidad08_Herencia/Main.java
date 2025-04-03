package unidad08_Herencia;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Prueba de la clase Hora
        Hora hora = new Hora(10, 45);
        System.out.println("Pruebas con Hora:");
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);

        Hora otraHora = new Hora(10, 46);
        System.out.println("¿Son iguales? " + hora.equals(otraHora));

        // Prueba de la clase HoraExacta
        HoraExacta horaExacta1 = new HoraExacta(12, 30, 45);
        HoraExacta horaExacta2 = new HoraExacta(12, 30, 45);
        HoraExacta horaExacta3 = new HoraExacta(12, 30, 46);

        System.out.println("\nPruebas con HoraExacta:");
        System.out.println(horaExacta1);
        horaExacta1.inc();
        System.out.println(horaExacta1);

        System.out.println("¿Son iguales horaExacta1 y horaExacta2? " + horaExacta1.equals(horaExacta2));
        System.out.println("¿Son iguales horaExacta1 y horaExacta3? " + horaExacta1.equals(horaExacta3));
    }
}
