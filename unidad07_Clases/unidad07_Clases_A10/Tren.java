package unidad07_Clases_A10;

/**
 *
 * @author loren
 */
public class Tren {
private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinistaResponsable;

    public Tren(Locomotora locomotora, Maquinista maquinistaResponsable) {
        this.locomotora = locomotora;
        this.maquinistaResponsable = maquinistaResponsable;
        this.vagones = new Vagon[5];
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public Maquinista getMaquinistaResponsable() {
        return maquinistaResponsable;
    }

    public boolean agregarVagon(Vagon vagon) {
        for (int i = 0; i < vagones.length; i++) {
            if (vagones[i] == null) {
                vagones[i] = vagon;
                return true;
            }
        }
        return false;
    }
}