package unidad07_A01;

/**
 *
 * @author loren
 */

public class U07_A02_CuentaCorriente_Sobrecarga {
    private String dni;
    private String nombre;
    private double saldo;

    // Constructor con DNI y saldo inicial
    public U07_A02_CuentaCorriente_Sobrecarga(String dni, double saldo) {
        this(dni, "No definido", saldo);
    }

    // Constructor con DNI, nombre y saldo inicial
    public U07_A02_CuentaCorriente_Sobrecarga(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        // Crear objetos utilizando los distintos constructores
        U07_A02_CuentaCorriente_Sobrecarga cuenta1 = new U07_A02_CuentaCorriente_Sobrecarga("12345678A", 1000);
        U07_A02_CuentaCorriente_Sobrecarga cuenta2 = new U07_A02_CuentaCorriente_Sobrecarga("87654321B", "Lorenzo Pérez", 700);

        // Comprobar el funcionamiento de los métodos
        System.out.println("Cuenta 1:");
        cuenta1.mostrarDatos();

        System.out.println("\nCuenta 2:");
        cuenta2.mostrarDatos();
    }
}
