/*##############################################
  #  Author: Castro Navarrete Armando Kenet    #
  #  Materia: ParadigmaS de Programacion        #
  ##############################################
*/
public class LibroCalificaciones{

    private String nombreCurso, nombreProfesor;
    private int horasDelCurso;
  //Encapsulacion 
 public LibroCalificaciones(){

 }
   public LibroCalificaciones(String nombre, String profesor, int horas){
     this.nombreCurso = nombre;
    this.nombreProfesor = profesor;
     this.horasDelCurso = horas;
   }
    public void establecerParametrosDelCurso(String curso, String nombreProfesor, int horas){
         this.nombreCurso = curso;
        this.nombreProfesor = nombreProfesor;
        this.horasDelCurso = horas;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getNombreProfesor() {
        return nombreProfesor;
    }
    public int getHorasDelCurso() {
        return horasDelCurso;
    }
     public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    public void setHorasDelCurso(int horasDelCurso) {
        this.horasDelCurso = horasDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf( "Bienvenido al libro de calificaciones para\n %s\n",getNombreCurso());
        System.out.printf("El profesor asignado es %s\n", getNombreProfesor());
        System.out.printf("El curso tiene una duracion de %d horas\n", getHorasDelCurso());
    }
}