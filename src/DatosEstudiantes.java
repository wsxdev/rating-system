import java.util.Scanner;

public class DatosEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n||    BIENVENIDO AL SISTEMA DE NOTAS YANKAY    ||  \n");
        /// Verificamos e ingresamos los PAOS
        System.out.println("[ SELECCIONE EL PAO ]");
        int pao;
        while (true) {
            System.out.print("   Ingrese el PAO a calificar (1-8): ");
            pao = leerNumerosValidos(entrada);

            if (pao >= 1 && pao <= 8) {
                break;
            } else {
                System.out.println("\n  ------------------------------------");
                System.out.println("  ERROR: el PAO debe estar entre 1 y 8");
                System.out.println("  ------------------------------------");
            }
        }

        /// Ingresamos el numero de estudiantes
        System.out.println("\n[ INGRESO DE ESTUDIANTES ]");
        int cantidadEstudiantes;
        while (true) {
            System.out.print("   Ingrese el numero de estudiantes del PAO " + pao + ": ");
            cantidadEstudiantes = leerNumerosValidos(entrada);
            if (cantidadEstudiantes > 0) {
                break;
            } else {
                System.out.println("\n  ---------------------------------------");
                System.out.println("  ERROR: ingrese un valor numérico valido");
                System.out.println("  Intente de nuevo");
                System.out.println("  ---------------------------------------");
            }
        }
        
        System.out.println("\n[ NOMBRES DE LOS ESTUDIANTES ]");

        /// Ingresamos el nombre de los estudiantes
        String[] nombreEstudiantes = new String[cantidadEstudiantes];
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("   Nombre del estudiante " + (i + 1) + ": ");
            nombreEstudiantes[i] = entrada.next();
        }
        System.out.println("");
        /// Ingresamos las materias de cada PAO
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
                break;
        }
        ///Matriz para agregar las notas
        double[][] notas = new double[cantidadEstudiantes][materias.length];
        System.out.println("[ INGRESO DE NOTAS ]");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("  \nEstudiante: " + nombreEstudiantes[i]);
            // ASIGNAR NOTAS DE ACUERDO A LAS MATERIAS 
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
    public static double leerNotaValida(Scanner entradaNotaValida, String materiaTemporal) {
        double nota;
        while (true) {
            if (entradaNotaValida.hasNextDouble()) { // hasNextDouble verfica si lo ingresado es válido
                nota = entradaNotaValida.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("\n  --------------------------------------");
                    System.out.println("  ERROR: la nota debe estar entre 0 y 10");
                    System.out.println("  Intente de nuevo");
                    System.out.println("  --------------------------------------");
                    System.out.print("    >" + materiaTemporal + ": ");
                }
            } else {
                System.out.println("\n  --------------------------------------");
                System.out.println("  ERROR: ¡La nota debe ser un NÚMERO! :/");
                System.out.println("  Intente de nuevo");
                System.out.println("  --------------------------------------");
                System.out.print("    >" + materiaTemporal + ": ");
                entradaNotaValida.next();
            }
        }
        return nota;
    }

    // MÉTODO PARA VALIDAR DATOS NUMÉRICOS
    public static int leerNumerosValidos(Scanner entradaNumerica){
        int numero;
        while (true) {
            if (entradaNumerica.hasNextInt()) {
                numero = entradaNumerica.nextInt();
                break;
            } else {
                System.out.println("\n  ---------------------------------------");
                System.out.println("  ERROR: ingrese un valor numérico válido");
                System.out.println("  ---------------------------------------");
                System.out.print("  Intente de nuevo: ");
                entradaNumerica.next();
            }
        }
        return numero;
    }

}