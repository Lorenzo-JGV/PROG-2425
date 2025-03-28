package unidad07_Clases_A06;

/**
 *
 * @author loren
 */
public class Tiempo_A06 {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Tiempo_A06(int hora, int minuto, int segundo) { // Corregido el nombre del constructor
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Métodos set
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("El minuto debe estar entre 0 y 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 59.");
        }
    }

    // Métodos get
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Método para incrementar un segundo
    public void incrementarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}