package poo;

public class Pruebas {

	public static void main(String[] args) {
		Empleados empleado1 = new Empleados("Rodolfo Cabada");
		Empleados empleado2 = new Empleados("Daniel Cabada");
		empleado2.setSeccion("Sistemas");
		System.out.println(empleado1.getEmpleado() + "\n" + empleado2.getEmpleado());
		System.out.println(Empleados.getDameIdSiguiente());
	}
	
	

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
		
	public Empleados(String nombre){
		this.nombre = nombre;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void setSeccion(String seccion){
		this.seccion = seccion;
	}
	
	public String getEmpleado(){
		return "El nombre es: " + nombre + ", la sección es: " + seccion + " y el id es: " + id;
	}
	
	public static String getDameIdSiguiente(){
		return "El Id siguiente es: " + idSiguiente;
	}
	
}