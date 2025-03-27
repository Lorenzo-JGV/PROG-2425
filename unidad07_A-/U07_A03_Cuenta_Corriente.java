package unidad07_A01;

/**
 *
 * @author loren
 */
public class U07_A03_Cuenta_Corriente {
    public String nombre; // Visible desde cualquier clase
    String dni;           // Visible solo dentro del mismo paquete (package-private)
    private double saldo; // No visible desde otras clases

    // Constructor
    public U07_A03_Cuenta_Corriente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    // Método para mostrar saldo
    public double getSaldo() {
        return saldo;
    }
}
