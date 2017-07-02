import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {
		
		String genero = "";
		
		do{
			genero = JOptionPane.showInputDialog("Introduce tu genero, por favor (H/M)");
		}
		while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm."));
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")){
			pesoIdeal = altura - 110;
		}
		else if(genero.equalsIgnoreCase("M")){
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + " kilos.");

	}

}
