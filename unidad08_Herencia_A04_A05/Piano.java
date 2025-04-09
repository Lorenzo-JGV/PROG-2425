package unidad08_Herencia_A04_A05;

/**
 *
 * @author loren
 */

public class Piano extends Instrumento{
    //Implementar el metodo abstracto implementar
    
    @Override
    public void interpretar(){
        for(Notas nota : obtenerMelodia()){
            if(nota != null){
                System.out.println("Piano está tocando: " + nota);
            }
        }
    
    }
}
