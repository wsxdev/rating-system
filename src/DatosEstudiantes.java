
import java.util.Scanner;

public class DatosEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ///Ingresamos los PAOS
        System.out.print("Ingrese el PAO a calificar: ");
        int pao = entrada.nextInt();

        /// Ingresamos el numero de estudiantes
        System.out.print("Ingrese el numero de estudiantes del PAO " + pao + ":");
        int cantidad = entrada.nextInt();

        /// Ingresamos el nombre de los estudiantes
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String[] nombreEstudiantes = new String[cantidad];
            nombreEstudiantes[i] = entrada.next();
        }
    }
}
