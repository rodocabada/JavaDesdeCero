package poo;

public class UsoEmpleado {
	public static void main(String[] args) {
		/*aumentoSueldo(empleado1, 5);
		aumentoSueldo(empleado2, 5);
		aumentoSueldo(empleado3, 5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo()
				+ " Fecha de Alta: " + empleado1.getFechaAlta());
		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo()
		+ " Fecha de Alta: " + empleado2.getFechaAlta());
		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo()
		+ " Fecha de Alta: " + empleado3.getFechaAlta());*/
		
		Empleado[] empleados = new Empleado[4];
		empleados[0] = new Empleado("Rodolfo Cabada", 30000, 1990, 12, 17);
		empleados[1] = new Empleado("Alberto Gonzalez", 10000, 1995, 6, 2);
		empleados[2] = new Empleado("Hugo Lopez", 25000, 2002, 3, 15);
		empleados[3] = new Empleado("Alberto Rococo");
		
		/*for(int i=0; i<empleados.length; i++){
			aumentoSueldo(empleados[i], 5);
			System.out.println("Nombre: " + empleados[i].getNombre() + " Sueldo: " + empleados[i].getSueldo()
			+ " Fecha de Alta: " + empleados[i].getFechaAlta());
		}*/
		
		for(Empleado fila: empleados){
			aumentoSueldo(fila, 5);
			System.out.println("Nombre: " + fila.getNombre() + " Sueldo: " + fila.getSueldo()
					+ " Fecha de Alta: " + fila.getFechaAlta());
		}
		
	}
	
	public static void aumentoSueldo(Empleado empleado, double porcentaje){
		double aumento = empleado.getSueldo() * porcentaje/100;
		empleado.setSueldoMasAumento(aumento);
	}

}
