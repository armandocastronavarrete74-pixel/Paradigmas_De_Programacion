package Nomina;
import javax.management.ObjectName;

public class EmpleadoPorComision extends Object{
    protected String nombre;
    protected String apellidoPaterno;
    protected String nss;
    protected double comision;
    protected double montoVentas;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroS,
    double comsion, double montoVentas){
        nombre = primerNombre;
        this.apellidoPaterno= apellidoPaterno;
        nss = numeroSeguroS;
        this.comision = comsion;
        this.montoVentas= montoVentas;

         }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
        if(comision <= 0.0 || comision >=1.0 ) 
		throw new IllegalArgumentException("la tarifa deden comision debe ser > 0.0 y <1.0");

		this.comision = comision;
	}
	

	public double getMontoVentas() {
		return montoVentas;
	}

	public void setMontoVentas(double montoVentas) {
		if(montoVentas< 0.0)
            throw new IllegalArgumentException(
            "La vendes denbem ser mayor >= 0"
            );
    this.montoVentas = montoVentas;
	}

	public double ingresos(){
		return comision * montoVentas;
	}

	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
		"Empleado Comision", nombre, apellidoPaterno,
		"Numero de seguro social", nss,
		"Ventas Brutas", montoVentas,
		"tarifa comision", comision
		);
	}

    }

