package arrayList;

import java.util.*;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		
		/*Empleado listaEmpleado[] = new Empleado[3];
		listaEmpleado[0] = new Empleado("Ana", 45, 2500);
		listaEmpleado[1] = new Empleado("Antonio", 55, 2200);
		listaEmpleado[2] = new Empleado("María", 25, 2600);
		*/
		
		ArrayList<Empleado>  listaEmpleados= new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2200));
		listaEmpleados.add(new Empleado("María", 25, 2600));
		
		System.out.println(listaEmpleados.size());
		
		
		/*for(Empleado emp: listaEmpleados) {
			
			System.out.println(emp.getDatos());
			
		}*/
		
		/*for(int i=0; i<listaEmpleados.size(); i++) {
			
			System.out.println(listaEmpleados.get(i).getDatos());
			
		}*/
		
		Iterator<Empleado> iterator = listaEmpleados.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getDatos());
		}
		
	}

}

class Empleado{
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		
	}
	
	public String getDatos() {
		
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años. Y un salario de " + salario;
		
	}
	
}