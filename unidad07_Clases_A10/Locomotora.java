package unidad07_Clases_A10;

/**
 *
 * @author loren
 */
public class Locomotora {
    private String matricula;
    private double potencia;
    private int antiguedad;
    private Mecanico mecanicoAsignado;

    public Locomotora(String matricula, double potencia, int antiguedad, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }
}