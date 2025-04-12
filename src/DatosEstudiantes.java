
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

        String[] materiaPao1 = new String[] { "INGLES I", "FUNDAMENTOS DE PROGRAMACIÓN", "EDUCACION FISICA",
                "OFIMATICA", "SOSTENIBILIDAD AMBIENTAL", "ALGEBRA LINEAL ", "FISICA" };

        String[] materiaPao2 = new String[] { "INGLES II", "CALCULO I", "ADMINISTRACION DE SISTEMAS OPERATIVOS",
                "ARQUITECTURA DE LA INFORMACIÓN", "GESTION DE PROYECTOS TI", "COMUNICACIÓN ORAL Y ESCRITA" };

        String[] materiaPao3 = new String[] { "INGLES III ", "CALCULO II ", "GESTIÓN ADMINISTRATIVA",
                "ESTRUCTURA DE DATOS ", "FUNDAMENTOS DE BASE DE DATOS ", "REALIDAD SOCIOECONOMICA INTERCULTURALIDAD",
                "ESTADISTICA" };

        String[] materiaPao4 = new String[] { "INGLES IV", "ADMINISTRACIÓN DE BASE DE DATOS ",
                " SISTEMAS INTERACTIVOS Y MULTIMEDIA ", "SISTEMAS DE COMUNICACIÓN ",
                "INTELIGENCIA DE NEGOCIOS - PRÁCTICAS PREPROFESIONALES I",
                "EMPRENDIMIENTO" };

        String[] materiaPao5 = new String[] { "BASES DE DATOS AVANZADAS ", "FUNDAMENTOS DE REDES ",
                "INTEROPERABILIDAD DE PLATAFORMAS ", "CONMUTACIÓN Y ENRUTAMIENTO ", "ÉTICIA Y RELACIONES HUMANAS",
                "INTERACCION HOMBRE MAQUINA" };

        String[] materiaPao6 = new String[] { "MINERIA DE DATOS", "CLOUD COMPUTING ", "TECNOLOGÍA WEB",
                "GESTIÓN DE SERVIDORES - PRÁCTICAS PREPROFESIONALES II", "ESCALABILIDAD DE REDES ",
                "COMPUTACION MOVIL" };

        String[] materiaPao7 = new String[] { "AUDITORIA TI", "APLICACIONES PARA LA GESTION DE REDES ", "SEGURIDAD TI ",
                "VINCULACIÓN CON LA SOCIEDAD", "VIRTUALIZACIÓN", "SISTEMAS DE INFORMACION GEOGRAFICA" };
                
        String[] materiaPao8 = new String[] { "DERECHO INFORMÁTICO ", "GOBIERNO TI ",
                " METODOLOGIA DE LA INVESTIGACION CIENTIFICA ",
                "FORMULACIÓN TRABAJO DE TITULACIÓN ", "TRABAJO DE TITULACIÓN" };

    }
}
