import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor.");
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor.");
		System.out.println("Hola " + nombreUsuario + ". El a�o que viene tendras " + 
		(Integer.parseInt(edad) + 1) + " años.");

	}

}
