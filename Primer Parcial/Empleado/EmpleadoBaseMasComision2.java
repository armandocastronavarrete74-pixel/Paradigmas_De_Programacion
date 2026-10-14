// Fig. 9.8: EmpleadoBaseMasComision2.java
// EmpleadoBaseMasComision2 hereda de la clase EmpleadoPorComision.

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision
{
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision2(String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario)
    {
        // llamada explícita al constructor de la superclase EmpleadoPorComision
        super(nombre, apellido, nss, ventas, tarifa);

        establecerSalarioBase(salario); // valida y almacena el salario base
    } // fin del constructor de EmpleadoBaseMasComision2 con seis argumentos

    // establecer salario base
    public void establecerSalarioBase(double salario)
    {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    } // fin del método establecerSalarioBase

    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    } // fin del método obtenerSalarioBase

    // calcula los ingresos
    public double ingresos()
    {
        // no está permitido: tarifaComision y ventasBrutas son private en la superclase
        return salarioBase + (tarifaComision * ventasBrutas);
    } // fin del método ingresos

    // devuelve representación String de EmpleadoBaseMasComision2
    public String toString()
    {
        // no está permitido: intentos por acceder a los miembros private de la superclase
        return String.format(
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
            "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas,
            "tarifa de comision", tarifaComision,
            "salario base", salarioBase);
    } // fin del método toString
} // fin de la clase EmpleadoBaseMasComision2