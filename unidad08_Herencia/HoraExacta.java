package unidad08_Herencia;

/**
 *
 * @author loren
 */
public class HoraExacta extends Hora{
    private int segundos;

    // Constructor
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    // Asignar un valor válido a los segundos
    public boolean setSegundos(int valor) {
        if (valor >= 0 && valor <= 59) {
            segundos = valor;
            return true;
        }
        return false;
    }

    // Incrementar un segundo
    @Override
    public void inc() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }

    // Representar la hora exacta como cadena de texto
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    // Comparación entre objetos de tipo HoraExacta
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoraExacta otraHora = (HoraExacta) obj;
        return super.equals(obj) && this.segundos == otraHora.segundos;
    }
}