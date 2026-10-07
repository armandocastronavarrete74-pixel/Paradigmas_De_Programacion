package Nomina;

public class EmpleadoAsalareado extends Empleado{
    private double salarioSemanal;

public  EmpleadoAsalareado(String primerNombre, String apellidoPaterno, String nss, double salarioSemanal) {
    super(primerNombre, apellidoPaterno, nss);

    if(salarioSemanal < 0.0)
        throw new IllegalArgumentException("El salario debe ser >=0.0");
    this.salarioSemanal = salarioSemanal;
}

public void establecerSalarioSemanal(double salarioSemanal){
    if(salarioSemanal < 0.0)
        throw new IllegalArgumentException("El salario debe ser >=0.0");
    this.salarioSemanal = salarioSemanal;

}
public double obtenerSalarioSemanal(){
    return salarioSemanal;
}
@Override
public double ingresos(){
   return obtenerSalarioSemanal();
}
@Override
	public String toString(){
		return String.format("Empleado Asalariado: %s%n%s: $%,.2f",
		super.toString(),"Salario Final", obtenerSalarioSemanal());}
}
