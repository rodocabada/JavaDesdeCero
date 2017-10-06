package colecciones;

import java.util.*;

public class PruebasLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Rodolfo");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		System.out.println(personas.size());
		personas.add(1, "Alberto");
		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("Juan");
		
		for(String persona : personas) {
			System.out.println(persona);
		}

	}

}
