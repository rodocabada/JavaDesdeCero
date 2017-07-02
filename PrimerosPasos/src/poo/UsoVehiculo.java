package poo;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		miCoche.setColor("azul");
		
		Furgoneta furgoneta1 = new Furgoneta(7, 580);
		furgoneta1.setColor("blanco");
		furgoneta1.setAsientosPiel(true);
		furgoneta1.setClimatizador(true);
		
		miCoche.setAsientosPiel(true);
		miCoche.setClimatizador(false);
		miCoche.setPesoTotal(10000);
		miCoche.setColor("Rojo");
		System.out.println("El coche tiene " + miCoche.getRuedas() + " ruedas");
		System.out.println("mide de largo  " + miCoche.getLargo() + " cms.");
		System.out.println("mide de ancho " + miCoche.getAncho() + " cms.");
		System.out.println("el motor pesa " + miCoche.getMotor() +" kgs.");
		System.out.println("el peso de la plataforma es de " + miCoche.getPesoPlataforma() + " kgs.");
		System.out.println(miCoche.getAsientosPiel() ? "si tiene asientos de piel" : "no tiene asientos de piel,");
		System.out.println(miCoche.getClimatizador() ? "si tiene climatizador" : "no tiene climatizador,");
		System.out.println("el color del coche es " + miCoche.getColor());
		System.out.println("y pesa en total " + miCoche.getPesoTotal() + " kgs.");
		System.out.println();
		System.out.println("La furgoneta 1 tiene " + furgoneta1.getRuedas() + " ruedas");
		System.out.println("mide de largo  " + furgoneta1.getLargo() + " cms.");
		System.out.println("mide de ancho " + furgoneta1.getAncho() + " cms.");
		System.out.println("el motor pesa " + furgoneta1.getMotor() +" kgs.");
		System.out.println("el peso de la plataforma es de " + furgoneta1.getPesoPlataforma() + " kgs.");
		System.out.println(furgoneta1.getAsientosPiel() ? "si tiene asientos de piel" : "no tiene asientos de piel,");
		System.out.println(furgoneta1.getClimatizador() ? "si tiene climatizador" : "no tiene climatizador,");
		System.out.println("el color de la furgoneta es " + furgoneta1.getColor());
		System.out.println("pesa en total " + furgoneta1.getPesoTotal() + " kgs.");
		System.out.println("la capacidad de carga es de: " + furgoneta1.getCapacidadCarga());
		System.out.println("y la plazas extras son: " + furgoneta1.getPlazasExtras());
		
		
	}

}
