package colecciones;

public class Libro {
	
	private String titulo;
	private String autor;
	private int isbn;
	
	public Libro(String titulo, String autor, int isbn) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		
	}
	
	public String getDatosLibro() {
		return "El titulo es: " + titulo + ". El autor es: " + autor + ". Y el isbn es: " + isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	/*public boolean equals(Object objeto) {
		
		if(objeto instanceof Libro) {
			Libro otro = (Libro)objeto;
			if(this.isbn == otro.isbn) {
				return true;
			} else {
				return false;
			}
		}
		return false;
		
	}*/
	
	

}
