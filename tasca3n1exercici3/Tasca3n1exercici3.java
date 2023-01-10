package tasca3n1exercici3;

import java.io.*;
import java.util.*;


public class Tasca3n1exercici3 {
	
	public static void main(String[] args) {
	
//		cargar HashMap con el metodo readFile que nos devuelve HashMap countriesCities
		HashMap<String, String>rtrnCountriesCities = readFile(); 	
		
//		llama al metodo enviando HashMap con en contenido recibido anteriormente
		quiz(rtrnCountriesCities);	
		
	}
	
//	metodo que lee el archivo txt, parte cada linea en dos
//	crea un HashMap asignando country al key y city al value
//	devuelve HashMap al main
	public static HashMap<String, String> readFile() {
		HashMap<String, String> countriesCities = new HashMap<String, String>();

		try {
			File capitals = new File("/Users/promusic/Desktop/javaFileTxt/countries.txt");
			Scanner myReader = new Scanner(capitals);
			while (myReader.hasNext()) {
				String data = myReader.nextLine();
				String[] parts = data.split(" ");
				String country = parts[0].trim();
				String city = parts[1].trim();
				countriesCities.put(country, city);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("no se ha podido leer el archivo");
			e.printStackTrace();
		}
		return countriesCities;
	}
	
//	metodo que recibe HashMap, crea un nombre de usuario, devuelve key del HashMap de manera aleatoria,
//	y compara el value introducido por el usuario con el value del HashMap
//	en el caso que sean iguales va sumando puntos
//	llama al metodo crearArchivo para crear un archivo de texto externo
	public static void quiz(HashMap<String, String> quizRtrnCountriesCities) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("write your name");
		String name = sc.nextLine();

		int i = 0;
		int points = 0;
		String capital;

		Random generator = new Random();
		Object[] country = quizRtrnCountriesCities.keySet().toArray();

		while (i < 10) {
			Object randomCountry = country[generator.nextInt(country.length)];
			System.out.println("which is capital of " + randomCountry + " write it");
			capital = sc.nextLine();

			if (capital.equalsIgnoreCase(quizRtrnCountriesCities.get(randomCountry))) {
				points += 1;
			}
			i++;

		}
		sc.close();
		
		System.out.println("total points of 10= " + points);
		sc.close();
		crearArchivo(name, points);

	}
	
//	crea archivo txt externo con los parametros pasados desde el quiz
	public static void crearArchivo(String name, int points) {

			File file = new File("/Users/promusic/Desktop/javaFileTxt/finalScore.txt");			

		try {
//			true sirve para sumar los valores y no sobreescribir los datos asignados anteriormente
			FileWriter wrFile = new FileWriter(file, true);
			wrFile.write("player name = " + name + "\n" + "total points of 10= " + points+ "\n");
			wrFile.close();
			System.out.println("file created");

		} catch (IOException e) {
			System.out.println("file error");
			e.printStackTrace();
		}

	}

}
