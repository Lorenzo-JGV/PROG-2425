package unidad07_Clases_A03;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con DNI, nombre y saldo inicial
        CuentaCorriente_A03 cuenta = new CuentaCorriente_A03("12345678A", "Loren", 1500.0);

        // Mostrar información inicial de la cuenta
        cuenta.mostrarInformacion();

        // Ingresar dinero en la cuenta
        cuenta.ingresarDinero(500.0);

        // Retirar dinero de la cuenta
        cuenta.sacarDinero(200.0);

        // Intentar retirar una cantidad mayor al saldo disponible
        cuenta.sacarDinero(2000.0);

        // Mostrar información actualizada de la cuenta
        cuenta.mostrarInformacion();
    }
}