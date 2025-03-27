package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A02 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in); 
                int sumEdad = 0;
                int numAlumno = 0;
                int mayEdad = 0;
                int edad;
                
                //Introducir la edad del alumno
                System.out.print("Introduce la edad del alumno (Número Negativo - SALIR): ");
                edad = sc.nextInt();
                
                // Se ejecutara el bucle hasta que no se introduzca un número negativo
                while (edad >= -1 ) {
                        sumEdad += edad;
                        numAlumno++;
                        
                        if(edad >= 18) {
                            mayEdad ++;
                        }
                        
                        System.out.println("Introduce la edad del alumno (Número Negativo - SALIR):");
                        edad = sc.nextInt();
                }
        
                //Cálculo y muestro el resultado
                if (numAlumno > 0){
                    double notaMed = (double) sumEdad / numAlumno;

                    System.out.println("Suma de todas las edades:" + sumEdad);
                    System.out.println("Números de alumnos: " + numAlumno);
                    System.out.println("Media de edad: " + notaMed);
                    System.out.println("Número alumnos mayores de edad: " + mayEdad);
                } else {
                    System.out.println("La edad intoducida está mal: ");
                }
        }
}
