package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {	
	private String nombre;
	private double sueldo;
	private Date fechaAlta;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.nombre = nombre;
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
	
	public String getNombre(){
		return nombre;
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

}
