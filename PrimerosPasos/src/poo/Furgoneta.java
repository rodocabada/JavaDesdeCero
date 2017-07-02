package poo;

public class Furgoneta extends Coche {
	
	private int capacidadCarga;
	private int plazasExtras;
	
	public Furgoneta(int plazasExtras, int capacidadCarga){
		
		super(); //Llamas al constructor de la clase padre.
		this.capacidadCarga = capacidadCarga;
		this.plazasExtras = plazasExtras;
		
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getPlazasExtras() {
		return plazasExtras;
	}

	public void setPlazasExtras(int plazasExtras) {
		this.plazasExtras = plazasExtras;
	}
	
}
