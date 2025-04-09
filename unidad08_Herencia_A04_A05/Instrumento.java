package unidad08_Herencia_A04_A05;

/**
 *
 * @author loren
 */
public abstract class Instrumento {    
    //Enumerdado de notas musicales 
    public enum Notas {DO,RE,MI,FA,SOL,LA,SI}
    
    //Array para guarda las notas que tiene la melodia 
    private Notas[] melodiaMusical = new Notas[100];
    private int indice = 0;
    
    //Metodo para añadir una nota a la melodia
    public void add(Notas nota) {
        if (indice < melodiaMusical.length) {
            melodiaMusical[indice] = nota;
        } else {
            System.out.println("La melodia está llena, no se pueden añadir maás notas.");
        }
    }
    
    //Muestra todas las notas de la melodia
    protected Notas[] obtenerMelodia() {
        return melodiaMusical;
    }
    
    //Metodo abstracto para que las subclases lo interpreten
    public abstract void interpretar();

}
