package Nomina;

public abstract class Empleado{
    private final String primerNombre;
    private final String apellidoPrterno;
    private final String numeroSeguroSocial;
    public Empleado(String primerNombre, String apellidoPrterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPrterno = apellidoPrterno;
        this.numeroSeguroSocial = numeroSeguroSocial ;

        
        
    }
    public String obeterPrimerNombre() {
      return this.primerNombre;
   }

   public String obeterApellidoPaterno() {
      return this.apellidoPrterno;
   }

   public String obeterNumeroSeguroSocial() {
      return this.numeroSeguroSocial;
   }
   @Override
	public String toString(){
		return String.format("%s %s%n numero seguro social: %s",
		obeterPrimerNombre(), obeterApellidoPaterno(), obeterNumeroSeguroSocial() 
		);}
      public abstract double ingresos();
}