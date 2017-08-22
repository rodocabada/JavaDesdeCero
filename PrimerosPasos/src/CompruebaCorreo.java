import javax.swing.JOptionPane;

public class CompruebaCorreo {

	public static void main(String[] args) {

		String correo = JOptionPane.showInputDialog("Introduce el correo");
		
		try {
			examinaCorreo(correo);
		} catch(Exception e){
			System.out.println("Longitud de correo no es correcta.");
			e.printStackTrace();
		}

	}

	static void examinaCorreo(String correo) throws LongitudCorreoErroneo {

		int arroba = 0;
		boolean punto = false;

		if(correo.length()<=3) {

			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			//throw new ArrayIndexOutOfBoundsException();
			throw new LongitudCorreoErroneo("El correo debe tener mas de 3 caracteres.");

		} else {

			for(int i = 0; i < correo.length(); i++){
				if(correo.charAt(i) == '@'){
					arroba++;
				}
				if(correo.charAt(i) == '.'){
					punto = true;
				}
			}
			if(arroba==1 && punto){
				System.out.println("El correo es correcto.");
			}
			else{
				System.out.println("El correo es incorrecto.");
			}

		}

	}

}


class LongitudCorreoErroneo extends Exception{
	
	public LongitudCorreoErroneo() {
		
		
		
	}
	
	public LongitudCorreoErroneo(String msjError) {
		
		super(msjError);
		
	}
	
}
