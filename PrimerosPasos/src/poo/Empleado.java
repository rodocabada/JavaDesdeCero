package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona implements Comparable, Trabajadores{	
	private double sueldo;
	private Date fechaAlta;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
		super(nombre);
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.sueldo = sueldo;
		this.fechaAlta = calendario.getTime();
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void aumentoSueldo(int porcentaje){
		double aumento = sueldo * porcentaje/100;
		sueldo+=aumento;
	}
	
	public int getId() {
		return id;
	}

	public Empleado(String nombre){
		this(nombre, 30000, 2000, 01, 01); 
	}
	
	public double getSueldo(){
		return sueldo;
	}
	
	public void setAumento(double aumento){
		sueldo+=aumento;
	}
	
	public Date getFechaAlta(){
		return fechaAlta;
	}
	
	public String getDescripcion(){
		return "Este empleado tiene un Id= " + id + " con un sueldo= " + sueldo;
	}
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.id < otroEmpleado.id){
			return -1;
		}
		if(this.id < otroEmpleado.id){
			return 1;
		}
		return 0;
	}
	
	public double setBonus(double gratificacion){
		return Trabajadores.bonusBase + gratificacion;
	}

}
