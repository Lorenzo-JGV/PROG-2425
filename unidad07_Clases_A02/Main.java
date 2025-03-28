package unidad07_Clases_A02;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con DNI y saldo inicial sin nombre del titular
        CuentaCorriente_A02 cuenta1 = new CuentaCorriente_A02("12345678A", 500.0);

        // Crear una cuenta con DNI, nombre del titular y saldo inicial
        CuentaCorriente_A02 cuenta2 = new CuentaCorriente_A02("87654321B", "Loren", 1000.0);

        // Mostrar información de la cuenta 1
        cuenta1.mostrarInformacion();

        // Mostrar información de la cuenta 2
        cuenta2.mostrarInformacion();

        // Ingresar dinero en la cuenta 1
        cuenta1.ingresarDinero(200.0);

        // Retirar dinero de la cuenta 1
        cuenta1.sacarDinero(100.0);

        // Intentar retirar una cantidad mayor al saldo en la cuenta 2
        cuenta2.sacarDinero(1500.0);

        // Mostrar información actualizada de ambas cuentas
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}