import java.util.Scanner;

public class DatosEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ///Ingresamos los PAOS
        System.out.println("");
        System.out.println("  //   SISTEMA DE NOTAS    //   ");
        System.out.println(" ");
        System.out.println("[ SELECCIONE EL PAO ]");
        System.out.print("   " + "Ingrese el PAO a calificar: ");
        int pao = entrada.nextInt();
        System.out.println("");
        /// Ingresamos el numero de estudiantes
        System.out.println("[ INGRESO DE ESTUDIANTES ]");
        System.out.print("   " + "Ingrese el numero de estudiantes del PAO " + pao + ": ");
        int cantidad = entrada.nextInt();
        System.out.println(" ");
        System.out.println("[ NOMBRES DE LOS ESTUDIANTES ]");
        /// Ingresamos el nombre de los estudiantes
        String[] nombreEstudiantes = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("   " + "Nombre del estudiante " + (i + 1) + ": ");
            nombreEstudiantes[i] = entrada.next();
        }
        System.out.println("");
        ///Ingresamos las materias de cada PAO
        String[] materias = null;
        switch (pao) {
            case 1:
                materias = new String[] { " INGLES I", " FUNDAMENTOS DE PROGRAMACIÓN", " EDUCACION FISICA",
                        " OFIMATICA", " SOSTENIBILIDAD AMBIENTAL", " ALGEBRA LINEAL ", " FISICA" };
                break;

            case 2:
                materias = new String[] { " INGLES II", " CALCULO I", " ADMINISTRACION DE SISTEMAS OPERATIVOS",
                        " ARQUITECTURA DE LA INFORMACIÓN", " GESTION DE PROYECTOS TI",
                        " COMUNICACIÓN ORAL Y ESCRITA" };
                break;

            case 3:
                materias = new String[] { " INGLES III", " CALCULO II", " GESTIÓN ADMINISTRATIVA",
                        " ESTRUCTURA DE DATOS", " FUNDAMENTOS DE BASE DE DATOS",
                        " REALIDAD SOCIOECONOMICA INTERCULTURALIDAD",
                        " ESTADISTICA" };
                break;

            case 4:
                materias = new String[] { " INGLES IV", " ADMINISTRACIÓN DE BASE DE DATOS",
                        " SISTEMAS INTERACTIVOS Y MULTIMEDIA", " SISTEMAS DE COMUNICACIÓN",
                        " INTELIGENCIA DE NEGOCIOS - PRÁCTICAS PREPROFESIONALES I",
                        " EMPRENDIMIENTO" };
                break;

            case 5:
                materias = new String[] { " BASES DE DATOS AVANZADAS", " FUNDAMENTOS DE REDES",
                        " INTEROPERABILIDAD DE PLATAFORMAS", " CONMUTACIÓN Y ENRUTAMIENTO",
                        " ÉTICIA Y RELACIONES HUMANAS",
                        " INTERACCION HOMBRE MAQUINA" };
                break;

            case 6:
                materias = new String[] { " MINERIA DE DATOS", " CLOUD COMPUTING", " TECNOLOGÍA WEB",
                        " GESTIÓN DE SERVIDORES - PRÁCTICAS PREPROFESIONALES II", " ESCALABILIDAD DE REDES",
                        " COMPUTACION MOVIL" };
                break;

            case 7:
                materias = new String[] { " AUDITORIA TI", " APLICACIONES PARA LA GESTION DE REDES",
                        " SEGURIDAD TI",
                        " VINCULACIÓN CON LA SOCIEDAD", " VIRTUALIZACIÓN", " SISTEMAS DE INFORMACION GEOGRAFICA" };
                break;

            case 8:
                materias = new String[] { " DERECHO INFORMÁTICO", " GOBIERNO TI",
                        " METODOLOGIA DE LA INVESTIGACION CIENTIFICA",
                        " FORMULACIÓN TRABAJO DE TITULACIÓN", " TRABAJO DE TITULACIÓN" };
                break;
            default:
                System.out.println(" Error, ingrese el PAO correcto del 1 al 8");
                return; // Para que se salga del método actual
        }
        ///Matriz para agregar las notas
        double[][] notas = new double[cantidad][materias.length];
        System.out.println("[ INGRESO DE NOTAS ]");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("");
            System.out.println("  Estudiante: " + nombreEstudiantes[i]);
            for (int j = 0; j < materias.length; j++) {
                System.out.print("    >" + materias[j] + ": ");
                // Fíjese aquí, al momento de leer las notas, se llama al método leerNotaValida
                // y se le pasa la variable entrada como parámetro
                notas[i][j] = leerNotaValida(entrada, materias[j]);
            }
        }
        System.out.println(" ");
    }

    // MÉTODO PARA VALIDAR DATOS DE ENTRADA
    // Este método recibe un parámetro tipo Scanner, llamado entradaValida
    public static double leerNotaValida(Scanner entradaValida, String materiaTemporal) {
        double nota;
        while (true) {
            if (entradaValida.hasNextDouble()) { // hasNextDouble verfica si lo ingresado es válido
                nota = entradaValida.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("  -------------------");
                    System.out.println("   ERROR: la nota debe estar entre 0 y 10");
                    System.out.println("   Intente de nuevo");
                    System.out.println("  -------------------");
                    System.out.print("    >" + materiaTemporal + ": ");
                }
            } else {
                System.out.println("  -------------------");
                System.out.println("   ERROR: ¡La nota debe ser un NÚMERO! :/");
                System.out.println("   Intente de nuevo ");
                System.out.println("  -------------------");
                System.out.print("    >" + materiaTemporal + ": ");
                entradaValida.next();
            }
        }
        return nota;
    }
}
