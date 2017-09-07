package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		String[] nombres = {"Jose", "Maria", "Pepe"};
		System.out.println(MisMatrices.getTamanio(nombres));
		System.out.println(MisMatrices.getElementoMenor(nombres));
		
		Integer[] numeros = {1, 3, 5, 6, 7};
		System.out.println(MisMatrices.getTamanio(numeros));
		System.out.println(MisMatrices.getElementoMenor(numeros));
		
		GregorianCalendar[] fechas = {new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,05,12),
				new GregorianCalendar(2015,04,12)};
		System.out.println(MisMatrices.getElementoMenor(fechas));

	}

}

class MisMatrices{
	
	public static <T> String getTamanio(T[] array){
		
		return "El array tiene: " + array.length + " elementos.";
		
	}
	
	public static <T extends Comparable> T getElementoMenor(T[] array) {
		
		if(array == null || array.length == 0) {
			return null;
		}
		
		T elementoMenor = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(elementoMenor.compareTo(array[i])>0) {
				
				elementoMenor = array[i];
				
			}
		}
		
		return elementoMenor;
		
	}
	
}
