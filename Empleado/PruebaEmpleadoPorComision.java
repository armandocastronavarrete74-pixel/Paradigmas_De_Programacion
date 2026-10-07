public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision objEmpleado = new EmpleadoPorComision("Juan", "Dominguez", "123 456", 0.5, 5000);

        System.out.println("Informacion del empleado ordenado por los metodos a establecer");
        System.out.printf("%n%s  %s%n", "El nombre del empleado es:", objEmpleado.getNombre());

        System.out.printf("%n%s  %s%n", "El apellido paterno es:", objEmpleado.getApellidoPaterno());

        System.out.printf("%n%s  %s%n", "El NSS es:", objEmpleado.getNss());

        System.out.printf("%s  %.2f%n", "Las ventas brutas fueron de:", objEmpleado.getMontoVentas());

        System.out.printf("%s  %.2f%n", "La tarifa de comision es de:", objEmpleado.getComision());

        //Esta es una actualizacion de los valores de vengtas brutas y comisión
        objEmpleado.setMontoVentas(8000);
        objEmpleado.setComision(0.6);

        System.out.printf("%n%s: %n%n%s%n", "INFORMACION ACTUALIZADA DEL EMPLEADO, OBTENIDA MEDIANTE toString()", objEmpleado);


    }
}
