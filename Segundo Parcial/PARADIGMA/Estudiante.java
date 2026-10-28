import java.util.Date;

public class Estudiante extends Persona {
    private int id;
    private double promCalif;
    private String carrera;
    private String grado;
    private int anioGraduacion;

    
    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno,
                      Date fechaNacimiento, int id, String carrera, String grado, int anioGraduacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.id = id;
        this.carrera = carrera;
        this.grado = grado;
        this.anioGraduacion = anioGraduacion;
        this.promCalif = 0;
    }


    public int getId() { return id; }
    public double getPromCalif() { return promCalif; }
    public String getCarrera() { return carrera; }
    public String getGrado() { return grado; }
    public int getAnioGraduacion() { return anioGraduacion; }

   
    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

   
    private double convertirAPuntos(String calif) {
        calif = calif.toUpperCase();
        
        switch (calif) {
            case "A": return 4;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2;
            case "D": return 1;
            case "F": return 0;
            default: return 0;
        }
    }

    
    public void calcularPromedio(String[] calificaciones) {
        double suma = 0;

        for (String c : calificaciones) {
            suma += convertirAPuntos(c);
        }

        promCalif = suma / calificaciones.length;
    }

    public double obtenerPromedio() {
        return promCalif;
    }

    
    @Override
    public String toString() {
        return "Nombre: " + obtenerNombreCompleto() +
               "\nID: " + id +
               "\nPromedio: " + String.format("%.2f", promCalif) +
               "\nCarrera: " + carrera +
               "\nGrado: " + grado +
               "\nAño de graduación: " + anioGraduacion;
    }
}