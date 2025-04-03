package unidad07_Clases_A10;

/**
 *
 * @author loren
 */
public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    // Métodos getter y setter si se necesitan
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRango() {
        return rango;
    }
}