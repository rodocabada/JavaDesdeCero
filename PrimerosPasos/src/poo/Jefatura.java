package poo;

public class Jefatura extends Empleado implements Jefes {
	
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
	
	public String tomarDesiciones(String desicion){
		return "Un miembro de la dirección ha tomado la desición de: " + desicion;
	}
	
	public double setBonus(double gratificacion){
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}

}
