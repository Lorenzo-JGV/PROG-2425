package unidad07_Clases_A05;

/**
 *
 * @author loren
 */
public class Gestor {
    public String nombre; 
    private String telefono; 
    protected double importeMaximo;

    // Constructor con importe máximo por defecto
    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000.0);
    }

    // Constructor para personalizar el importe máximo
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    // Getter para obtener el teléfono
    public String getTelefono() {
        return telefono;
    }

    // Getter para obtener el importe máximo (visible para clases vecinas)
    protected double getImporteMaximo() {
        return importeMaximo;
    }

    // Setter para modificar el importe máximo
    protected void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }
}
