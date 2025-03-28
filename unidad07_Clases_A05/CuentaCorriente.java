package unidad07_Clases_A05;

/**
 *
 * @author loren
 */
public class CuentaCorriente {
   private static String nombreBanco = "Banco Predeterminado";    private String numeroCuenta; 
    private double saldo;
    private Gestor gestor;

    // Constructor sin gestor
    public CuentaCorriente(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.gestor = null;
    }

    // Constructor con gestor
    public CuentaCorriente(String numeroCuenta, double saldo, Gestor gestor) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    // Métodos para obtener y modificar el nombre del banco
    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nuevoNombreBanco) {
        nombreBanco = nuevoNombreBanco;
    }

    // Getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}