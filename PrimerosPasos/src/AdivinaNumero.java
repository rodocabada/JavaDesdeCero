import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int)(Math.random()*100)	;
		int numero = 0;
		int intentos = 0;
		while(numero != aleatorio){
			intentos++;
			System.out.println("Introduce un numero, por favor.");
			numero = entrada.nextInt();
			if(aleatorio<numero){
				System.out.println("El numero que introduciste es mayor.");
			}
			else if(aleatorio>numero){
				System.out.println("El numero que introduciste es menor.");
			}
			}
		System.out.println("Exito, el numero que introduciste es correcto.");
		System.out.println("Numero de intentos: " + intentos);
		}
		
	}
