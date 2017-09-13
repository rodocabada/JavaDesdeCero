package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		
		/*Empleado administrativa = new Empleado("Elenea", 45, 1500);
		Jefe directoraComercial = new Jefe("Ana", 25, 3500);
		Empleado nuevoEmpleado = directoraComercial;*/
		
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		Pareja<Jefe> directoraComercial = new Pareja<Jefe>();
		Pareja<? extends Empleado> nuevoEmpleado = directoraComercial;
		Pareja.imprimirTrabajador(administrativa);
		Pareja.imprimirTrabajador(directoraComercial);

	}

}
