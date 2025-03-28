package unidad07_Clases_A01;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva cuenta corriente con DNI y nombre del titular
        CuentaCorriente_A01 cuenta = new CuentaCorriente_A01("12345678A", "Loren");

        // Mostrar información inicial de la cuenta
        cuenta.mostrarInformacion();

        // Ingresar dinero a la cuenta
        cuenta.ingresarDinero(5000);
        
        // Intentar sacar una cantidad válida
        cuenta.sacarDinero(2000);
        
        // Intentar sacar una cantidad mayor al saldo disponible
        cuenta.sacarDinero(4000);
        
        // Mostrar información final de la cuenta
        cuenta.mostrarInformacion();
    }
}