//quite packpage
import java.util.Date;
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido paterno: ");
        String ap = sc.nextLine();

        System.out.print("Apellido materno: ");
        String am = sc.nextLine();

        Date fecha = new Date(); // simplificado

        System.out.print("ID: ");
        String id = sc.nextLine(); // ID se lee directamente como String

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Grado: ");
        String grado = sc.nextLine();

        System.out.print("Año de graduación: ");
        int anio = sc.nextInt();

        //  Se envía fecha en su posición exacta y 0.0 como promedio inicial
        Estudiante est = new Estudiante(nombre, ap, am, fecha, id, carrera, grado, anio, 0.0);

        System.out.print("Número de calificaciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] calificaciones = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextLine();
        }

        est.calcularPromedio(calificaciones);

        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        System.out.println(est);

        System.out.println("\nPromedio: " + est.obtenerPromedio());

        System.out.print("\n¿Desea cambiar carrera? (si/no): ");
        String resp = sc.next();

        if (resp.equalsIgnoreCase("si")) {
            sc.nextLine();
            System.out.print("Nueva carrera: ");
            String nueva = sc.nextLine();
            est.cambiarCarrera(nueva);

            System.out.println("Carrera actualizada: " + est.getCarrera());
        } else {
            System.out.println("Fin del programa.");
        }

        sc.close();
    }
}