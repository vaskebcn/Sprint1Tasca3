package tasca3n2exercici2;

import java.util.*;

public class Tasca3n2exercici2 {

	public static void main(String[] args) {

		HashSet<Restaurante> restaurantesHashSet = new HashSet<Restaurante>();

		Restaurante restaurante1 = new Restaurante("asador", 4);
		Restaurante restaurante3 = new Restaurante("cafeteria", 2);
		Restaurante restaurante2 = new Restaurante("braseria", 3);
		Restaurante restaurante4 = new Restaurante("cafeteria", 2);
		Restaurante restaurante5 = new Restaurante("cafeteria", 4);

		restaurantesHashSet.add(restaurante1);
		restaurantesHashSet.add(restaurante2);
		restaurantesHashSet.add(restaurante3);
		restaurantesHashSet.add(restaurante4);
		restaurantesHashSet.add(restaurante5);

		TreeSet<Restaurante> listA = new TreeSet<Restaurante>();

		for (Restaurante i : restaurantesHashSet) {
			listA.add(i);
		}

		for (Restaurante i : listA) {
			System.out.println(i);
		}

	}

}
