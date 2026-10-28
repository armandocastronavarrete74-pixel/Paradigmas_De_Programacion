package Nomina;

public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String primernombre, String apellidoPaterno,
                            String numeroSeguroSocial, double salarioPorHora, double horasTrabajadas) {
        super(primernombre, apellidoPaterno, numeroSeguroSocial);
        if (sueldo < 0.0)
            throw new IllegalArgumentException("El salario por hora debe ser mayor o igual a 0.0");
        if ((horas < 0.0) || (horas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void establecerSalarioPorHora(double salarioPorHora) {
        if (salarioPorHora < 0.0)
            throw new IllegalArgumentException("El salario por hora debe ser mayor o igual a 0.0");
        this.sueldo = sueldo;
    }

    public double obtenerSalarioPorHora() {
        return sueldo;
    }

    public void establecerHorasTrabajadas(double horasTrabajadas) {
        if ((horasTrabajadas < 0.0) || (horasTrabajadas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        this.horas = horas;
    }

    public double obtenerHorasTrabajadas() {
        return horas;
    }

    @Override
    public double ingresos() {
        if (obtenerHorasTrabajadas() <= 40)
            return obtenerSalarioPorHora() * obtenerHorasTrabajadas();
        else
            return 40 * obtenerSalarioPorHora() + (obtenerHorasTrabajadas() - 40) * obtenerSalarioPorHora() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "salario por hora", obtenerSalarioPorHora(),
                "horas trabajadas", obtenerHorasTrabajadas());
    }
}