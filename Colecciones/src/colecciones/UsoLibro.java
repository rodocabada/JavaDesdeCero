package colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Programación en Java", "Rodolfo", 25);
		Libro libro2 = new Libro("Programación en Java", "Rodolfo", 25);
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
		} else {
			System.out.println("No es el mismo libro");
		}
		
	}

}
