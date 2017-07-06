import java.util.*;
public class UsoTallas {
	
	//enum talla {chico, mediano, grande, extraGrande};
	
	enum Talla{
		
		chico("S"), mediano("M"), grande("G"), extragrande("XL");
		private String abreviatura;
		
		private Talla(String abreviatura){
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura(){
			return abreviatura;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: chico, mediano, grande, extraGrande");
		String entradaDatos = entrada.next().toLowerCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla: " + laTalla);
		System.out.println("Abreviaruta: " + laTalla.getAbreviatura());

	}
	
}
