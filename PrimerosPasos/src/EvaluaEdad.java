import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor.");
		int edadUsuario = entrada.nextInt();
		if(edadUsuario<18){
			System.out.println("Eres un adolescente.");
		}
		else if(edadUsuario<40){
			System.out.println("Eres joven.");
		}
		else if(edadUsuario<65){
			System.out.println("Eres maduro.");
		}
		else{
			System.out.println("Cuidate.");
		}

	}

}
