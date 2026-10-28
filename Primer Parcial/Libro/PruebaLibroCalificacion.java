/*##############################################
  #  Author: Castro Navarrete Armando Kenet    #
  #  Materia: ParadigmaS de Programacion        #
  ##############################################
*/
import java.util.Scanner;

public class PruebaLibroCalificacion{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones3 = new LibroCalificaciones();  
        LibroCalificaciones miLibrocalificaciones3Iniciado = new LibroCalificaciones("Programacion","Ana Luisa",4);
        
        
       System.out.printf("El nombre inicial del curso es: %s\n El profesor es: %s\ny las horas a la semana son: %s\n\n", 
       miLibrocalificaciones3Iniciado.getNombreCurso(),miLibrocalificaciones3Iniciado.getNombreProfesor(),
       miLibrocalificaciones3Iniciado.getHorasDelCurso());        
       

        System.out.println("Escriba el nombre del curso: ");
        String nombreCursoIngresado = entrada.nextLine();
   
        System.out.println("Escriba el nombre del profesor asignado: ");
        String nombreProfesorIngresado = entrada.nextLine();

        System.out.println("Escriba la cantidad de horas del curso: ");
        int horasIngresadas = entrada.nextInt();

        System.out.println();
        miLibrocalificaciones3Iniciado.establecerParametrosDelCurso(nombreCursoIngresado, nombreProfesorIngresado,  horasIngresadas);

        miLibrocalificaciones3Iniciado.mostrarMensaje();
        entrada.nextLine();


        System.out.println("Cambiaremos los valores del objeto Iniciado");
        String lnombre=entrada.nextLine();
        System.out.println("");

        System.out.println("Escriba el nuevo nombre del profesor para el objeto Iniciado");
        String elnombreProfesor=entrada.nextLine();

        System.out.println("Escriba la nueva cantidad de horas del curso para el objeto Iniciado");
        int lahoras=entrada.nextInt();
        miLibrocalificaciones3Iniciado.establecerParametrosDelCurso(lnombre, elnombreProfesor, lahoras);
        miLibrocalificaciones3Iniciado.mostrarMensaje();

        }
}