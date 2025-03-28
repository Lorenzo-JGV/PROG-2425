package unidad07_Clases_A04;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta corriente con DNI y nombre del titular
        CuentaCorriente_A04 cuenta = new CuentaCorriente_A04("12345678A", "Loren");

        // Mostrar información inicial de la cuenta
        cuenta.mostrarInformacion();

        // Ingresar dinero a la cuenta
        cuenta.ingresarDinero(1000.0);

        // Intentar retirar una cantidad válida
        cuenta.sacarDinero(500.0);

        // Intentar retirar una cantidad mayor al saldo disponible
        cuenta.sacarDinero(1000.0);

        // Mostrar información final de la cuenta
        cuenta.mostrarInformacion();
    }
}