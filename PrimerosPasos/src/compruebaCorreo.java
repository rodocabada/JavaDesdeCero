import javax.swing.JOptionPane;

public class compruebaCorreo {

	public static void main(String[] args) {

		String correo = JOptionPane.showInputDialog("Introduce el correo");
		try {
			examinaCorreo(correo);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Longitud de correo no es correcta.");
		}
		


	}

	static void examinaCorreo(String correo) throws ArrayIndexOutOfBoundsException {

		int arroba = 0;
		boolean punto = false;

		if(correo.length()<=3) {

			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException();

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
