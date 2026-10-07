// Fig. 9.6: EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision representa a un empleado que recibe
// un salario base además de una comisión.

public class EmpleadoBaseMasComision {
   private final String primerNombre;
   private final String apellidoPaterno;
   private final String numeroSeguroSocial;
   private double ventasBrutas;
   private double tarifaComision; 
   private double salarioBase;

   public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, 
      String numeroSeguroSocial, double ventasBrutas, 
      double tarifaComision, double salarioBase)
   {

      // si ventasBrutas no es válida, lanza una excepción
      if (ventasBrutas < 0.0)
         throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0");

      // si tarifaComision no es válida, lanza una excepción
      if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
         throw new IllegalArgumentException(
            "La tarifa de comision debe ser > 0.0 y < 1.0");

      // si salarioBase no es válido, lanza una excepción
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
            "El salario base debe ser >= 0.0");

      this.primerNombre = primerNombre;
      this.apellidoPaterno = apellidoPaterno;
      this.numeroSeguroSocial = numeroSeguroSocial;
      this.ventasBrutas = ventasBrutas;
      this.tarifaComision = tarifaComision;
      this.salarioBase = salarioBase;
   } 

   // devuelve el primer nombre
   public String getPrimerNombre()
   {
      return primerNombre;
   } 

   // devuelve el apellido paterno
   public String getApellidoPaterno()
   {
      return apellidoPaterno;
   } 

   // devuelve el número de seguro social
   public String getNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } 

   // establece el monto de ventas brutas
   public void setVentasBrutas(double ventasBrutas)
   {
      if (ventasBrutas < 0.0)
         throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0");

      this.ventasBrutas = ventasBrutas;
   } 

   // devuelve el monto de ventas brutas
   public double getVentasBrutas()
   {
      return ventasBrutas;
   } 

   // establece la tarifa de comisión
   public void setTarifaComision(double tarifaComision)
   {
      if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
         throw new IllegalArgumentException(
            "La tarifa de comision debe ser > 0.0 y < 1.0");

      this.tarifaComision = tarifaComision;
   } 

   // devuelve la tarifa de comisión
   public double getTarifaComision()
   {
      return tarifaComision;
   } 

   // establece el salario base
   public void setSalarioBase(double salarioBase)
   {
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
            "El salario base debe ser >= 0.0");

      this.salarioBase = salarioBase;
   } 

   // devuelve el salario base
   public double getSalarioBase()
   {
      return salarioBase;
   } 

   // calcula los ingresos
   public double ingresos()
   {
      return salarioBase + (tarifaComision * ventasBrutas);
   } 

   // devuelve representación String de EmpleadoBaseMasComision
   @Override
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
         "empleado con salario base mas comision", primerNombre, apellidoPaterno, 
         "numero de seguro social", numeroSeguroSocial, 
         "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision, 
         "salario base", salarioBase);
   } 
}