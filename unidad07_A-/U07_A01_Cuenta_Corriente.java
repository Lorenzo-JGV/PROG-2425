package unidad07_A01;
/**
 *
 * @author loren
 */
public class U07_A01_Cuenta_Corriente {
    private String dni;
    private String nombreTitular;
    private double saldo;

    public U07_A01_Cuenta_Corriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0;
    }

    public boolean sacaDinero(double cantidad) {
        if (cantidad > saldo) {
            return false;
        } else {
            saldo -= cantidad;
            return true;
        }
    }

    public void ingresaDinero(double cantidad) {
        saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre del titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }

}

