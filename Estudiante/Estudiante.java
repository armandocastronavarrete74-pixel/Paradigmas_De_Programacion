//quite packpage
import java.util.Date;
import java.text.SimpleDateFormat;//ayuda a dar formato a la fecha

public class Estudiante extends Persona {

    private String id;//el id es String
    private double promCalif;
    private String carrera;
    private String grado;
    private int anioGraduacion;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, 
                      Date fechaNacimiento, String id, String carrera, 
                      String grado, int anioGraduacion, double promCalif) {
        
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.id = id;
        this.carrera = carrera;
        this.grado = grado;
        this.anioGraduacion = anioGraduacion;
        this.promCalif = promCalif;// inicialece promCalif en el constructor
    }

    //getters
    public String getId() { // Cambiado a String para coincidir con la variable
        return id; 
    }
    public double getPromCalif() { 
        return promCalif; 
    }
    public String getCarrera() { 
        return carrera; 
    }
    public String getGrado() { 
        return grado; 
    }
    public int getAnioGraduacion() { 
        return anioGraduacion; 
    }

    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    private double convertirAPuntos(String calif) { 
        if (calif == null) return 0.0; // Validación de seguridad extra
        calif = calif.trim().toUpperCase();
        
        switch (calif) {
            case "A":
                return 10;

            case "A-":
                 return 9;

            case "B+":
                 return 8.5;

            case "B":
                 return 8;

            case "B-":
                 return 7;

            case "C+":
                 return 6.5;

            case "C":
                 return 6;

            case "D":
                 return 5;

            case "F":
                 return 0;

            default:
                 return 0;
        }
    }

    public void calcularPromedio(String[] calificaciones) {
        //Tenemos que validar que las calificaciones que suban no son nulos ni que esten vacios
        if(calificaciones == null || calificaciones.length == 0 ) {
            this.promCalif = 0.0;
            return;
        }
        double suma = 0;

        for (String c : calificaciones) {
            suma += convertirAPuntos(c);
        }
        this.promCalif = suma / calificaciones.length;//olvidaste poner el this (corregida la coma por punto)
    }

    public double obtenerPromedio() {
        return promCalif;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + obtenerNombreCompleto() +
               "\nID: " + id +
               "\nPromedio: " + promCalif +
               "\nCarrera: " + carrera +
               "\nGrado: " + grado +
               "\nAño de graduación: " + anioGraduacion;
    }
}
