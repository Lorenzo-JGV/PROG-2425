package unidad07_Clases_A05;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args) {
        // Crear un gestor
        Gestor gestor1 = new Gestor("Loren", "123456789");
        
        // Crear una cuenta corriente con un gestor
        CuentaCorriente cuenta1 = new CuentaCorriente("123456789", 5000.0, gestor1);
        
        // Mostrar información del banco y gestor
        System.out.println("Nombre del banco: " + CuentaCorriente.getNombreBanco());
        System.out.println("Gestor de la cuenta: " + cuenta1.getGestor().nombre);
        System.out.println("Teléfono del gestor: " + cuenta1.getGestor().getTelefono());

        // Modificar el nombre del banco
        CuentaCorriente.setNombreBanco("Banco Central");
        System.out.println("Nombre del banco actualizado: " + CuentaCorriente.getNombreBanco());
        
        // Crear otra cuenta sin gestor
        CuentaCorriente cuenta2 = new CuentaCorriente("987654321", 3000.0);
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println("Gestor asignado: " + (cuenta2.getGestor() == null ? "Ninguno" : cuenta2.getGestor().nombre));
    }
}
