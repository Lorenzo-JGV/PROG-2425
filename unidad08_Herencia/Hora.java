package unidad08_Herencia;

/**
 *
 * @author loren
 */
public class Hora {
    protected int hora;
    protected int minutos;

    // Constructor
    public Hora(int hora, int minutos) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
    }

    // Incrementar un minuto
    public void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    // Asignar un valor válido a los minutos
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            minutos = valor;
            return true;
        }
        return false;
    }

    // Asignar un valor válido a la hora
    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            hora = valor;
            return true;
        }
        return false;
    }

    // Representar la hora como cadena de texto
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }

    // Comparación entre objetos de tipo Hora
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hora otraHora = (Hora) obj;
        return this.hora == otraHora.hora && this.minutos == otraHora.minutos;
    }
}