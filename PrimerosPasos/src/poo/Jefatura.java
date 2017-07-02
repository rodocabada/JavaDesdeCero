package poo;

public class Jefatura extends Empleado {
	
	private double incentivo;
	
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia){
		super(nombre, sueldo, anio, mes, dia);
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo(){
		return super.getSueldo() + incentivo;
	}

}
