package poo;

public class PersonasBean {

	public static void main(String[] args) {
		Persona[] personas = new Persona[2];
		personas[0] = new Empleado("Rodolfo Cabada", 100000, 2017, 07, 03);
		personas[1] = new Alumno("Daniel Cabada", "Sistemas");
		
		for(Persona i : personas){
			System.out.println(i.getNombre() + ", " + i.getDescripcion());
		}

	}

}
