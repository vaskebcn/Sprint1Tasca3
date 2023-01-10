package tasca3n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Tasca3n1exercici1 {

	public static void main(String[] args) {
		
		ArrayList<Month> listMonth = new ArrayList <Month>();
		
		Month month1 = new Month ("Enero");
		Month month2 = new Month ("Febrero");
		Month month3 = new Month ("Marzo");
		Month month4 = new Month ("abril");
		Month month5 = new Month ("mayo");
		Month month6 = new Month ("junio");
		Month month7 = new Month ("julio");
		Month month8 = new Month ("agosto");
		Month month9 = new Month ("septiembre");
		Month month10 = new Month ("octubre");
		Month month11 = new Month ("noviembre");
		Month month12 = new Month ("diciembre");
		
		listMonth.add(month1);
		listMonth.add(month2);
		listMonth.add(month3);
		listMonth.add(month4);
		listMonth.add(month5);
		listMonth.add(month6);
		listMonth.add(month7);
//		listMonth.add(month8);
		listMonth.add(month9);
		listMonth.add(month10);
		listMonth.add(month11);
		listMonth.add(month12);
		
		
		
		listMonth.add(7, month8);
		
//		iterator para recorrer arraylist
		Iterator<Month> it1 = listMonth.iterator();		
		
		while(it1.hasNext()) {
			System.out.println(it1.next().getName());
		}
		
		
//		construir hashset
		HashSet<Month> setMonth = new HashSet<Month>();
		
//		cargar desde arraylist a hashset
		for (Month mes : listMonth) {
			setMonth.add(mes);
		}
		
//		recorrer hashset:
//		con iterador
		Iterator<Month> it2 = setMonth.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next().getName());
		}
		
//		y con for-each
		for (Month mes : setMonth) {
			System.out.println(mes.getName());
		}

	}

}
