package poo;

import java.util.Arrays;

public class UsoEmpleado {
	public static void main(String[] args) {

		Jefatura jefeRecursosHumanos = new Jefatura("Rodolfo Cabada", 55000, 2006,9,25);
		jefeRecursosHumanos.setIncentivo(2570);
		
		Empleado[] empleados = new Empleado[6];
		empleados[0] = new Empleado("Daniel Cabada", 30000, 1990, 12, 17);
		empleados[1] = new Empleado("Alberto Gonzalez", 10000, 1995, 6, 2);
		empleados[2] = new Empleado("Hugo Lopez", 25000, 2002, 3, 15);
		empleados[3] = new Empleado("Alberto Rococo");
		empleados[4] = jefeRecursosHumanos; //Polimorfismo en acción. Principio de sustitución.
		empleados[5] = new Jefatura("Maria Perez", 95000, 1999, 5, 25);
		Jefatura jefaFinanzas = (Jefatura) empleados[5];
		jefaFinanzas.setIncentivo(55000);;
		System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de: " + jefaFinanzas.setBonus(500));
		System.out.println("El empleado " + empleados[3].getNombre() + " tiene un bonus de: " + empleados[3].setBonus(200));
		Arrays.sort(empleados);
		System.out.println(jefaFinanzas.tomarDesiciones("dar a los empleados un aumento de sueldo de 5%."));
		
		for(Empleado fila: empleados){
			fila.aumentoSueldo(5);
			System.out.println("Id: " + fila.getId() + " Nombre: " + fila.getNombre() + " Sueldo: " + fila.getSueldo()
					+ " Fecha de Alta: " + fila.getFechaAlta());
		}
		
	}

}
