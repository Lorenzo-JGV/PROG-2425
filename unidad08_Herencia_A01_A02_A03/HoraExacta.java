package unidad08_Herencia_A01_A02_A03;

/**
 *
 * @author loren
 */
public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = (segundos >= 0 && segundos < 60) ? segundos : 0;
    }

    public void inc() {
        if (++segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(":%02d", segundos);
    }

    public boolean equals(HoraExacta otra) {
        return otra != null &&
               this.hora == otra.hora &&
               this.minutos == otra.minutos &&
               this.segundos == otra.segundos;
    }
}