package unidad07_Clases_A02;

/**
 *
 * @author loren
 */
public class CuentaCorriente_A02 {
    private String dni;
    private String nombre;
    private double saldo;

    // Constructor con DNI y saldo inicial
    public CuentaCorriente_A02(String dni, double saldoInicial) {
        this.dni = dni;
        this.nombre = "Desconocido"; // Nombre no proporcionado
        this.saldo = saldoInicial;
    }

    public CuentaCorriente_A02(String dni, String nombre, double saldoInicial) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Has ingresado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
    }

    public void sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar la operación.");
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo + " euros.");
    }
}