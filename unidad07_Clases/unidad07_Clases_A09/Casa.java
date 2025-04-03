package unidad07_Clases_A09;

/**
 *
 * @author loren
 */
public class Casa {
    public static void main(String[] args) {
        // Crear instancias de las bombillas
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        // Encender la primera bombilla
        b1.encender();
        System.out.println("Estado de b1: " + b1.estaEncendida());
        System.out.println("Estado de b2: " + b2.estaEncendida()); 
        
        // Apagar el interruptor general
        Bombilla.apagarInterruptorGeneral();
        System.out.println("Estado de b1 tras apagar general: " + b1.estaEncendida());
        
        // Encender el interruptor general
        Bombilla.encenderInterruptorGeneral();
        System.out.println("Estado de b1 tras encender general: " + b1.estaEncendida());
    }
}
