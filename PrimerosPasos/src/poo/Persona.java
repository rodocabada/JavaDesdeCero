package poo;

public abstract class Persona {
	
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getNombre(){
		return nombre;
	}
	
	public abstract String getDescripcion();

}
