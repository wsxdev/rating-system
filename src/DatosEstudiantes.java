
import java.util.Scanner;
public class DatosEstudiantes {
    public static void main ( String [] args ) {
        Scanner ingreso = new Scanner ( System.in ) ;
        ///Ingresamos los PAOS
        System.out.println ("Ingrese el PAO a calificar " ) ;
        int pao = ingreso.nextInt () ;

        /// Ingresamos el numero de estudiantes
        System.out.println ( "Ingrese el numero de estudiantes del PAO " + pao + ":" );
        int cantidad = ingreso.nextInt () ;

        /// Ingresamos el nombre de los estudiantes
        System.out.println ("Ingrese el nombre del estudiante :") ;
        String [] NombreEstudiantes = new String [cantidad] ;
        for (int i=0 ; i < cantidad ; i++) {
            String nombre = ingreso.next ();
        }
    }
}
