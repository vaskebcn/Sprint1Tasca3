package tasca3n2exercici1;

import java.util.*;

public class Tasca3n2exercici1 {

	public static void main(String[] args) {

		HashSet<Restaurante> restaurantesHashSet = new HashSet<Restaurante>();

		Restaurante restaurante1 = new Restaurante("asador", 4);
		Restaurante restaurante2 = new Restaurante("braseria", 3);
		Restaurante restaurante3 = new Restaurante("cafeteria", 2);
		Restaurante restaurante4 = new Restaurante("cafeteria", 2);

		restaurantesHashSet.add(restaurante1);
		restaurantesHashSet.add(restaurante2);
		restaurantesHashSet.add(restaurante3);

		Iterator<Restaurante> pzz = restaurantesHashSet.iterator();
		while (pzz.hasNext()) {
			pzz.next().toString();
		}

		// comprobar si restaurantes apuntan al mismo objeto
		if (restaurante3.equals(restaurante4)) {
			System.out.println("apuntan al mismo objeto");
		} else {
			System.out.println("apuntan a objetos diferentes");
		}

		for (Restaurante i : restaurantesHashSet) {
			System.out.println(i);
		}

		// comprobar si el restaurante repetido tiene el mismo hashcode
		System.out.println(restaurante3.hashCode());
		System.out.println(restaurante4.hashCode());

	}

}
