import javax.swing.JOptionPane;

public class compruebaCorreo {

	public static void main(String[] args) {
		
		int arroba = 0;
		boolean punto = false;
		String correo = JOptionPane.showInputDialog("Introduce el correo");
		
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
