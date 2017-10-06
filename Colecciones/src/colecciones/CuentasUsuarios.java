package colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cliente2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cliente3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cliente4 = new Cliente("Julio Iglesias", "00004", 500000);
		Cliente cliente5 = new Cliente("Julio Iglesias", "00001", 500000);
		
		HashSet<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(cliente1);
		clientesBanco.add(cliente2);
		clientesBanco.add(cliente3);
		clientesBanco.add(cliente4);
		clientesBanco.add(cliente5);
		
		/*for (Cliente cliente : clientesBanco) {
			System.out.println("Nombre: " + cliente.getNombre() + "\n"
					+ "Número de Cuenta: " + cliente.getNumeroCuenta() + "\n"
					+ "Saldo: " + cliente.getSaldo() + "\n");
		}*/
		
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			Cliente cliente = it.next();
			System.out.println("Nombre: " + cliente.getNombre() + "\n"
					+ "Número de Cuenta: " + cliente.getNumeroCuenta() + "\n"
					+ "Saldo: " + cliente.getSaldo() + "\n");
		}

	}

}