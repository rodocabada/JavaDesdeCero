package excepcionesIO;

import java.util.*;

import javax.swing.JOptionPane;

public class AreasPeso {
	
	static int figura;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		try {
			
			figura = entrada.nextInt();
			
		} catch(InputMismatchException e) {
			
			System.out.println("No haz introducido un opción valida");
			System.out.println(e.getMessage());
			System.out.println("Se ha generado una excepción: " + e.getClass().getName());
			
		} finally {
			
			entrada.close();
			
		}
		
		switch(figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
			
		case 2:
			int baseCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El área del rectángulo es: "+ baseCuadrado * alturaCuadrado);
			break;
			
		case 3:
			int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El área del triángulo es: " + (baseTriangulo * alturaTriangulo) / 2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El radio del círculo es: " + Math.PI * Math.pow(radio, 2));
			break;
			
		default:
			System.out.println("No haz elegido una opción válida");
		
		}
		
	}

}
