
public class UsoArrays2 {

	public static void main(String[] args) {
		
		int[] matrizAleatorios = new int[150];
		
		for(int i=0; i<matrizAleatorios.length; i++){
			matrizAleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int i: matrizAleatorios){
			System.out.print(i + " ");
		}

	}

}
