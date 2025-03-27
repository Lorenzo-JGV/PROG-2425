package unidad07_A01;
/**
 *
 * @author loren
 */
public class U07_A01_Main {
    public static void main(String[] args) {
        U07_A01_Cuenta_Corriente cuenta = new U07_A01_Cuenta_Corriente("12345678X", "Juan P�rez");

        cuenta.ingresaDinero(1000.0);
        cuenta.mostrarInformacion();
        

        boolean exito = cuenta.sacaDinero(500.0);
        if (exito) {
            System.out.println("Operaci�n realizada con �xito.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        cuenta.mostrarInformacion();
    }
}

