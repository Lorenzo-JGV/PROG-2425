package unidad07_Clases_A03;

/**
 *
 * @author loren
 */
public class CuentaCorriente_A03 {
    // 'saldo' no será visible para otras clases (private)
    private double saldo;

    // 'nombre' será público para cualquier clase (public)
    public String nombre;

    // 'dni' será visible solo por clases vecinas (protected)
    protected String dni;

    // Constructor para inicializar los atributos
    public CuentaCorriente_A03(String dni, String nombre, double saldoInicial) {
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

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo + " euros.");
    }
}