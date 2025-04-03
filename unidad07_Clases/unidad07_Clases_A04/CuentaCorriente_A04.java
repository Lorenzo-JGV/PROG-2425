package unidad07_Clases_A04;

/**
 *
 * @author loren
 */
public class CuentaCorriente_A04 {
    private String dni;
    private String nombre;
    private double saldo;

    // Constructor: Crear cuenta con DNI y nombre del titular, saldo inicial será 0
    public CuentaCorriente_A04(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0; // Saldo inicial es 0
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar la operación.");
            return false; // Operación no realizada
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
            return true; // Operación realizada con éxito
        }
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Has ingresado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo + " euros.");
    }
}