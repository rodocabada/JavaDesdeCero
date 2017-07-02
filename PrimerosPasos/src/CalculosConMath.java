import javax.swing.JOptionPane;

public class CalculosConMath {

	public static void main(String[] args) {

		// double raiz = Math.sqrt(25);
		double base = 5;
		double exponente = 3;
		int resultado = (int) Math.pow(base, exponente);
		//System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		JOptionPane.showMessageDialog(null, "El resultado de " + base + " elevado a " + exponente + " es " + resultado);

	}

}
