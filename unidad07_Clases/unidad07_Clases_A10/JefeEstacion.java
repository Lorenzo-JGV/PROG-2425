package unidad07_Clases_A10;

/**
 *
 * @author loren
 */
import java.util.Date;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private Date fechaNombramiento;

    public JefeEstacion(String nombre, String dni, Date fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }
}