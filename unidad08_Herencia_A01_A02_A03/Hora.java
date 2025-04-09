package unidad08_Herencia_A01_A02_A03;

/**
 *
 * @author loren
 */
public class Hora {
    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minutos = (minutos >= 0 && minutos < 60) ? minutos : 0;
    }

    public void inc() {
        if (++minutos == 60) {
            minutos = 0;
            if (++hora == 24) {
                hora = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
