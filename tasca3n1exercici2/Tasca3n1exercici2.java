package tasca3n1exercici2;

import java.util.Iterator;
import java.util.LinkedList;

public class Tasca3n1exercici2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> numero = new LinkedList<Integer>();
		LinkedList<Integer> number = new LinkedList<Integer>();

		numero.add(3);
		numero.add(5);
		numero.add(7);

//		pasar valores de LinkedList numero a LinkedList number en orden inverso, 
//		con el metodo add(index(posicion), element(valor))
		Iterator<Integer> it = numero.iterator();
		while (it.hasNext()) {
			number.add(0, it.next());
		}

//		comprobar las dos listas
		System.out.println(numero);
		System.out.println(number);
		
//		mostrar lista en orden inverso, con el iterador y su metodo descendingIterator
		Iterator<Integer> iv = numero.descendingIterator();
		while(iv.hasNext()) {
			System.out.println(iv.next());
		}

	}

}
