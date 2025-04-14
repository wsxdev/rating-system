import java.util.Scanner;

public class Calificaciones {

    public static void mostrarResultados(String[] nombresEstudiantes, String[] materias, double[][] notasCiclo1, double[][] notasCiclo2, Scanner entrada) {
        int numeroEstudiantes = nombresEstudiantes.length;
        int numeroMaterias = materias.length;
        // MATRICES PARA GUARDAR EL PROMEDIO Y ESTADO DE LAS ASIGNATURAS
        double[][] promediosPorMateria = new double[numeroEstudiantes][numeroMaterias];
        boolean[][] materiasAprobadas = new boolean[numeroEstudiantes][numeroMaterias];

        System.out.println("\n||   RESULTADOS INICIALES POR MATERIA   ||");

        // SE IMPRIME: NOMBRE, MATERIA Y PROMEDIO DE CADA ESTUDIANTE
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("===================================================");
            System.out.println("\nEstudiante: " + nombresEstudiantes[i]);
            System.out.println("===================================================");

            // SE CALCULA E IMPRIME LOS PROMEDIOS POR MATERIA PARA CADA ESTUDIANTE
            for (int j = 0; j < numeroMaterias; j++) {
                double notaCiclo1 = notasCiclo1[i][j];
                double notaCiclo2 = notasCiclo2[i][j];
                double promedioMateria = (notaCiclo1 + notaCiclo2) / 2;
                promediosPorMateria[i][j] = promedioMateria;
                // PROMEDIOS
                System.out.println("|" + materias[j]);
                System.out.println("    CICLO 1  (10): " + notaCiclo1);
                System.out.println("    CICLO 2  (10): " + notaCiclo2);
                System.out.println("    PROMEDIO (10): " + promedioMateria);
                // SE VERIFICA Y GUARDA SI APROBÓ O NO LA MATERIA
                if (promedioMateria >= 7) {
                    materiasAprobadas[i][j] = true;
                    System.out.println("    EQUIVALENCIA : APROBADA");
                    System.out.println("---------------------------------------------------");
                } else {
                    materiasAprobadas[i][j] = false;
                    System.out.println("    EQUIVALENCIA : REPROBADA");
                    System.out.println("---------------------------------------------------");
                }
            }
        }

        // SE VERIFICA SI HAY MATERIAS REPROBADAS
        // TRUE: APROBADO
        // FALSE: REPROBADO
        boolean materiaReprobada = false;
        for (int i = 0; i < numeroEstudiantes; i++) {
            for (int j = 0; j < numeroMaterias; j++) {
                if (materiasAprobadas[i][j] == false) {
                    materiaReprobada = true;
                    break;
                }
            }
        }

        // RECUPERACIÓN DE NOTAS POR MATERIA
        if (materiaReprobada) {
            System.out.print("\n¿Desea ingresar notas de recuperación para las materias reprobadas? (s/n): ");
            String opcion = entrada.next();

            if (opcion.equalsIgnoreCase("s")) {
                for (int i = 0; i < numeroEstudiantes; i++) {
                    for (int j = 0; j < numeroMaterias; j++) {
                        if (materiasAprobadas[i][j] == false) {
                            System.out.println("===================================================");
                            System.out.print("Ingrese nota de recuperación para " + nombresEstudiantes[i] + " en "+ materias[j] + ": ");
                            double notaRecuperacion = entrada.nextDouble();

                            // SE VUELVE A CALCULAR EL PROMEDIO CON LA NOTA DE RECUPERACIÓN
                            promediosPorMateria[i][j] = (promediosPorMateria[i][j] + notaRecuperacion) / 2;

                            if (promediosPorMateria[i][j] >= 7) {
                                materiasAprobadas[i][j] = true;
                            } else {
                                materiasAprobadas[i][j] = false;
                            }
                        }
                    }
                }
            }
        }

        // SE MUESTRAN LOS RESULTADOS FINALES CON TODAS LAS NOTAS DE RECUPERACIONES
        System.out.println("\n||   RESULTADOS FINALES POR MATERIA   ||");

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("===================================================");
            System.out.println("\nEstudiante: " + nombresEstudiantes[i]);
            System.out.println("===================================================");

            for (int j = 0; j < numeroMaterias; j++) {
                double notaCiclo1 = notasCiclo1[i][j];
                double notaCiclo2 = notasCiclo2[i][j];
                double promedio = promediosPorMateria[i][j];
                
                System.out.println("|" + materias[j]);
                System.out.println("    CICLO 1  (10): " + notaCiclo1);
                System.out.println("    CICLO 2  (10): " + notaCiclo2);
                System.out.println("    PROMEDIO (10): " + promedio);

                if (materiasAprobadas[i][j]) {
                    System.out.println("    EQUIVALENCIA : APROBADA");
                } else {
                    System.out.println("    EQUIVALENCIA : REPROBADA");
                }

                System.out.println("---------------------------------------------------");
            }
        }

        // RESULTADO FINAL DE LAS NOTAS POR ESTUDIANTE
        System.out.println("\n========== RESUMEN FINAL POR ESTUDIANTE ===========");

        for (int i = 0; i < numeroEstudiantes; i++) {
            int numeroMateriaAprobadas = 0;
            int numeroMateriasReprobadas = 0;

            // NOMBRE DEL ESTUDIANTE
            System.out.println("\n===================================================");
            System.out.println("Estudiante: " + nombresEstudiantes[i]);
            System.out.println("===================================================");

            // MATERIAS APROBADAS CON SU PROMEDIO
            System.out.println("MATERIAS APROBADAS:");
            for (int j = 0; j < numeroMaterias; j++) {
                if (materiasAprobadas[i][j] == true) {
                    numeroMateriaAprobadas++;
                    System.out.println("   >" + materias[j] + ": " + promediosPorMateria[i][j]);
                }
            }

            // MATERIAS REPROBADAS CON SU PROMEDIO
            System.out.println("MATERIAS REPROBADAS:");
            for (int j = 0; j < numeroMaterias; j++) {
                if (materiasAprobadas[i][j] == false) {
                    numeroMateriasReprobadas++;
                    System.out.println("   >" + materias[j] + ": " + promediosPorMateria[i][j]);
                }
            }

            // SE MUESTRA EL TOTAL DE MATERIAS
            System.out.println("---------------------------------------------------");
            System.out.println("Materias Totales    : " + numeroMaterias);
            System.out.println("Materias Aprobadas  : " + numeroMateriaAprobadas);
            System.out.println("Materias Reprobadas : " + numeroMateriasReprobadas);
            
            // ESTADO DEL ESTUDIANTES RESPECTO A SUS ASIGNATURAS
            if (numeroMateriasReprobadas == 0) {
                System.out.println("Estado              : SEMESTRE APROBADO COMPLETAMENTE");
            } else {
                System.out.println("Estado              : ARRASTRA MATERIAS");    
            }
        }
        System.out.println("\n===================================================");
    }
}