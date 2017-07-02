package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosPiel, climatizador;
	
	public Coche(){
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	public int getRuedas(){
		return ruedas;
	}
	
	public int getLargo(){
		return largo;
	}
	
	public int getAncho(){
		return ancho;
	}
	
	public int getMotor(){
		return motor;
	}
	
	public int getPesoPlataforma(){
		return pesoPlataforma;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setAsientosPiel(boolean asientosPiel){
		this.asientosPiel = asientosPiel;
	}
	
	public boolean getAsientosPiel(){
		return asientosPiel;
	}
	
	public void setClimatizador(boolean climatizador){
		this.climatizador = climatizador;
	}
	
	public boolean getClimatizador(){
		return climatizador;
	}
	
	public void setPesoTotal(int pesoTotal){
		this.pesoTotal = pesoTotal;
	}
	
	public int getPesoTotal(){
		pesoTotal = motor + pesoPlataforma;
		return pesoTotal;
	}

}
