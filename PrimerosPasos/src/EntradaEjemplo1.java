import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombreUsuario = entrada.nextLine();
		System.out.println("Introduce edad, por favor");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombreUsuario + ". El a�o que viene tendr�s " 
				+ (edad + 1) + " a�os");
		entrada.close();

	}

}