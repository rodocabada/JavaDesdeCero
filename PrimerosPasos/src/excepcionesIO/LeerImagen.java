package excepcionesIO;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeerImagen {

	public static void main(String[] args) {

		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame {

	public MarcoImagen() {

		setTitle("Marco con Imagen");
		LaminaConImagen miLamina = new LaminaConImagen();
		setBounds(750, 300, 400, 300);
		add(miLamina);

	}
}

class LaminaConImagen extends JPanel {

	private Image imagen;

	public LaminaConImagen() {

		try {

			imagen = ImageIO.read(new File("src/excepcionesIO/goku.gif"));

		} catch (IOException e) {

			System.out.println("La imagen no se ha encontrado");

		}

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		if (imagen == null) {
			g.drawString("No podemos cargar la imagen", 10, 10);
		} else {
			int anchoImagen = imagen.getWidth(this);
			g.drawImage(imagen, 0, 0, null);
		}

	}

}
