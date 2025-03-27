package unidad04_Bucles;

public class U04_B_A12 {
        public static void main(String[] args){
                       
                for (int tablasM =1; tablasM<=10; tablasM++) {
                      System.out.println("La tabla de multiplicar del: " + tablasM);
                      for (int j =1; j <=10; j++) {
                            System.out.println(tablasM + "x" + j +"=" + (tablasM * j) );
                      }
                      System.out.println();
                }
        }
}
