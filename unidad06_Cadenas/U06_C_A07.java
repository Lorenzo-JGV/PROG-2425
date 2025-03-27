// 7. Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con «Javalin, javalon», 
//para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.

//Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla «javalen, len, len».

//Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), 
//y en caso afirmativo, nos muestre solo el mensaje sin muletillas.

package unidad06_Cadenas;

public class U06_C_A07 {
    public static void main(String[] args) {
        // Definición de frases en el idioma de Javalandia
        String frase1 = "Javalin, javalon    Hola, ¿cómo estás?";
        String frase2 = "Hola, ¿cómo estás?     javalen, len, len";
        String frase3 = "Javalin, javalon    Estoy bien.     javalen, len, len";
        String frase4 = "Hola, ¿cómo estás?";

        System.out.println(traducir(frase1));
        System.out.println(traducir(frase2));
        System.out.println(traducir(frase3));
        System.out.println(traducir(frase4));
    }
   
    // Eliminar muletilla del principio
    public static String traducir(String frase) {
        if (frase.startsWith("Javalin, javalon")) {
            frase = frase.substring("Javalin, javalon".length());
        }
  
        // Eliminar muletilla del final
        if (frase.endsWith("javalen, len, len")) {
            frase = frase.substring(0, frase.length() - "javalen, len, len".length());
        }

        return frase;
    }
}
