
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
        String[] nombreEstudiantes = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombreEstudiantes[i] = entrada.next();
        }
        ///Ingresamos las materias de cada PAO
        double[][] nota = new double [cantidad][nombreEstudiantes];
        switch (pao) {
            case 1:
            System.out.println("Ingrese la calificacion de las Materias del PAO 1 ");
            System.out.print("INGLES I: ");
            String nota = entrada.next();
            System.out.print("FUNDAMENTOS DE PROGRAMACIÓN: ");
            String nota = entrada.next();
            System.out.print("EDUCACION FISICA: ");
            String nota = entrada.next();
            System.out.print("OFIMATICA: ");
            String nota = entrada.next();
            System.out.print("SOSTENIBILIDAD AMBIENTAL: ");
            String nota = entrada.next();
            System.out.print("ALGEBRA LINEAL: ");
            String nota = entrada.next();
            System.out.print("FISICA: ");
            String nota = entrada.next();
                break;

            case 2:
                System.out.println("Las materias del PAO 2 son: " + materias);
                materias = new String[] { "INGLES II", "CALCULO I", "ADMINISTRACION DE SISTEMAS OPERATIVOS",
                        "ARQUITECTURA DE LA INFORMACIÓN", "GESTION DE PROYECTOS TI", "COMUNICACIÓN ORAL Y ESCRITA" };
                break;

            case 3:
                materias = new String[] { "INGLES III ", "CALCULO II ", "GESTIÓN ADMINISTRATIVA",
                        "ESTRUCTURA DE DATOS ", "FUNDAMENTOS DE BASE DE DATOS ",
                        "REALIDAD SOCIOECONOMICA INTERCULTURALIDAD",
                        "ESTADISTICA" };
                System.out.println("Las materias del PAO 3 son: " + materias);
                break;

            case 4:
                materias = new String[] { "INGLES IV", "ADMINISTRACIÓN DE BASE DE DATOS ",
                        " SISTEMAS INTERACTIVOS Y MULTIMEDIA ", "SISTEMAS DE COMUNICACIÓN ",
                        "INTELIGENCIA DE NEGOCIOS - PRÁCTICAS PREPROFESIONALES I",
                        "EMPRENDIMIENTO" };
                System.out.println("Las materias del PAO 4 son: " + materias);
                break;

            case 5:
                materias = new String[] { "BASES DE DATOS AVANZADAS ", "FUNDAMENTOS DE REDES ",
                        "INTEROPERABILIDAD DE PLATAFORMAS ", "CONMUTACIÓN Y ENRUTAMIENTO ",
                        "ÉTICIA Y RELACIONES HUMANAS",
                        "INTERACCION HOMBRE MAQUINA" };
                System.out.println("Las materias del PAO 5 son: " + materias);
                break;

            case 6:
                materias = new String[] { "MINERIA DE DATOS", "CLOUD COMPUTING ", "TECNOLOGÍA WEB",
                        "GESTIÓN DE SERVIDORES - PRÁCTICAS PREPROFESIONALES II", "ESCALABILIDAD DE REDES ",
                        "COMPUTACION MOVIL" };
                System.out.println("Las materias del PAO 6 son: " + materias);
                break;

            case 7:
                materias = new String[] { "AUDITORIA TI", "APLICACIONES PARA LA GESTION DE REDES ",
                        "SEGURIDAD TI ",
                        "VINCULACIÓN CON LA SOCIEDAD", "VIRTUALIZACIÓN", "SISTEMAS DE INFORMACION GEOGRAFICA" };
                System.out.println("Las materias del PAO 7 son: " + materias);
                break;

            case 8:
                materias = new String[] { "DERECHO INFORMÁTICO ", "GOBIERNO TI ",
                        " METODOLOGIA DE LA INVESTIGACION CIENTIFICA ",
                        "FORMULACIÓN TRABAJO DE TITULACIÓN ", "TRABAJO DE TITULACIÓN" };
                System.out.println("Las materias del PAO 8 son: " + materias);
                break;
            default:
                System.out.println("Error, ingrese el PAO correcto del 1 al 8");
                break;
        }

    }
}
