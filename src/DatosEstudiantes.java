import java.util.Scanner;

public class DatosEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ///Ingresamos los PAOS
        System.out.print("Ingrese el PAO a calificar: ");
        int pao = entrada.nextInt();
        /// Ingresamos el numero de estudiantes
        System.out.print("Ingrese el numero de estudiantes del PAO " + pao + ": ");
        int cantidad = entrada.nextInt();

        /// Ingresamos el nombre de los estudiantes
        String[] nombreEstudiantes = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombreEstudiantes[i] = entrada.next();
        }
        ///Ingresamos las materias de cada PAO
        String [] materias = null;
        switch (pao) {
            case 1:
            materias = new String[] { "INGLES I", "FUNDAMENTOS DE PROGRAMACIÓN", "EDUCACION FISICA",
                "OFIMATICA", "SOSTENIBILIDAD AMBIENTAL", "ALGEBRA LINEAL ", "FISICA" };
                break;

            case 2:
                materias = new String[] { "INGLES II", "CALCULO I", "ADMINISTRACION DE SISTEMAS OPERATIVOS",
                        "ARQUITECTURA DE LA INFORMACIÓN", "GESTION DE PROYECTOS TI",
                        "COMUNICACIÓN ORAL Y ESCRITA" };
                break;

            case 3:
                materias = new String[] { "INGLES III ", "CALCULO II ", "GESTIÓN ADMINISTRATIVA",
                        "ESTRUCTURA DE DATOS ", "FUNDAMENTOS DE BASE DE DATOS ",
                        "REALIDAD SOCIOECONOMICA INTERCULTURALIDAD",
                        "ESTADISTICA" };
                break;

            case 4:
                materias = new String[] { "INGLES IV", "ADMINISTRACIÓN DE BASE DE DATOS ",
                        " SISTEMAS INTERACTIVOS Y MULTIMEDIA ", "SISTEMAS DE COMUNICACIÓN ",
                        "INTELIGENCIA DE NEGOCIOS - PRÁCTICAS PREPROFESIONALES I",
                        "EMPRENDIMIENTO" };
                break;

            case 5:
                materias = new String[] { "BASES DE DATOS AVANZADAS ", "FUNDAMENTOS DE REDES ",
                        "INTEROPERABILIDAD DE PLATAFORMAS ", "CONMUTACIÓN Y ENRUTAMIENTO ",
                        "ÉTICIA Y RELACIONES HUMANAS",
                        "INTERACCION HOMBRE MAQUINA" };
                break;

            case 6:
                materias = new String[] { "MINERIA DE DATOS", "CLOUD COMPUTING ", "TECNOLOGÍA WEB",
                        "GESTIÓN DE SERVIDORES - PRÁCTICAS PREPROFESIONALES II", "ESCALABILIDAD DE REDES ",
                        "COMPUTACION MOVIL" };
                break;

            case 7:
                materias = new String[] { "AUDITORIA TI", "APLICACIONES PARA LA GESTION DE REDES ",
                        "SEGURIDAD TI ",
                        "VINCULACIÓN CON LA SOCIEDAD", "VIRTUALIZACIÓN", "SISTEMAS DE INFORMACION GEOGRAFICA" };
                break;

            case 8:
                materias = new String[] { "DERECHO INFORMÁTICO ", "GOBIERNO TI ",
                        " METODOLOGIA DE LA INVESTIGACION CIENTIFICA ",
                        "FORMULACIÓN TRABAJO DE TITULACIÓN ", "TRABAJO DE TITULACIÓN" };
                break;
            default:
                System.out.println("Error, ingrese el PAO correcto del 1 al 8");
                break;
        }
        ///Matriz para agregar las notas
        double[][] notas = new double[cantidad][materias.length];

        System.out.println("Ingrese las calificaciones de cada estudiante del PAO " + pao + ":");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < materias.length; j++) {
                System.out.println("Ingrese la nota " + materias[j] + "del estudiante " + nombreEstudiantes[i] + ":");
                notas[i][j] = entrada.nextDouble();
            }
        }
    }
}
