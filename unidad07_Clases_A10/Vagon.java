package unidad07_Clases_A10;

/**
 *
 * @author loren
 */
public class Vagon {
    private int numero;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }
}
