package Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4Array {

	public static void main(String[] args) {
		HashMap<String, String> mapaContrasenia = new HashMap<>();
		mapaContrasenia.put("Juan", "1234");
		mapaContrasenia.put("Ana", "6785a");
		mapaContrasenia.put("Antonio", "rrju");
		mapaContrasenia.put("Paula", "abcd");
		HashMap<String, String[]> contIncorrectas = new HashMap<>();
		int cont = 0;
		boolean acertada = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce contraseña,N/n para terminar");
		String key = sc.next();
		while (!key.equalsIgnoreCase("N") && !acertada) {
			if (mapaContrasenia.containsKey(nombre)) {
				// El usuario está en el sistema
				if (mapaContrasenia.get(nombre).equals(key)) {
					System.out.println("Contraseña correcta,puede pasar");
					acertada = true;
				} else {
					// Ha fallado la contraseña
					// Se pueden dar dos casos, que el usuario esté ya
					// en el mapa de incorrectas (se añadiria la contraseña al
					// arrayList) o que no esté y haya que añadirlo
					if (contIncorrectas.containsKey(nombre)) {
						String[] aux = Arrays.copyOf(contIncorrectas.get(nombre),
								contIncorrectas.get(nombre).length + 1);
						aux[aux.length - 1] = key;
						contIncorrectas.put(nombre, aux);

					} else {
						String[] contNuevoUsuario = { key };
						contIncorrectas.put(nombre, contNuevoUsuario);

					}
				}
			} else {
				System.out.println("Usuario no registrado");
				acertada = true;
			}
			System.out.println("Introduce contraseña,N/n para terminar");
			key = sc.next();
		}
		System.out.println(Arrays.toString(contIncorrectas.get(nombre)));
		System.out.println("¿Quieres eliminar algún elemento erróneo?");
		String resp = sc.next();
		if (resp.equalsIgnoreCase("s")) {
			System.out.println("¿Qué contraseña de la colección quieres eliminar?");
			String pos = sc.next();
			if (contIncorrectas.containsKey(nombre)) {
				boolean encontrado = false;
				int cont1 = 0;
				String[] nuevoArray = Arrays.copyOf(contIncorrectas.get(nombre), contIncorrectas.get(nombre).length);
				while (!encontrado && cont1 < contIncorrectas.get(nombre).length) {
					if (nuevoArray[cont].equalsIgnoreCase(pos)) {
						for (int i = cont; i < nuevoArray.length - 1; i++) {
							nuevoArray[i] = nuevoArray[i + 1];
						}
						String[] aux = Arrays.copyOf(nuevoArray, nuevoArray.length - 1);
						contIncorrectas.put(nombre, aux);
						System.out.println("Contraseña eliminada");
						System.out.println(Arrays.toString(contIncorrectas.get(nombre)));
						encontrado = true;

					}
				}
				if (!encontrado) {
					System.out.println("Contraseña no encontrada, no se puede eliminar");
				}

			}
		}

	}
}

"Juan", abc

mapaContrasenia.constakey(nombre)

