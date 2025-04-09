package unidad08_Herencia_A04_A05;

/**
 *
 * @author loren
 */
public class Main {
    public static void main(String[] args){
    
        //Crear un objeto de tipo Violin
        Piano piano = new Piano();
        
        piano.add(Instrumento.Notas.DO);
        piano.add(Instrumento.Notas.FA);
        piano.add(Instrumento.Notas.SI);
        
        //Interpretar la melodia
        System.out.println("Interpretando la melodía: ");
        piano.interpretar();
        
    
    }
}
