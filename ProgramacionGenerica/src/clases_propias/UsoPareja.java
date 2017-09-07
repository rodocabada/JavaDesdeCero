package clases_propias;

public class UsoPareja {
	
	public static void main(String[] args) {
		
		Pareja<String> una = new Pareja<String>();
		una.setPrimero("Juan");
		System.out.println(una.getPrimero());
		
		Persona persona1 = new Persona("Ana");
		Pareja<Persona> dos = new Pareja<Persona>();
		dos.setPrimero(persona1);
		System.out.println(dos.getPrimero().getNombre());
		
	}
	
}

class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
