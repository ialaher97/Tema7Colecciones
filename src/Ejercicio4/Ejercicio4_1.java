package Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		HashMap<String, String> mapaContrasenia = new HashMap<String, String>();
		mapaContrasenia.put("Juan", "1234");
		mapaContrasenia.put("Ana", "6785a");
		mapaContrasenia.put("Antonio", "rrju");
		mapaContrasenia.put("Paula", "abcd");
		HashMap<String, ArrayList<String>> contIncorrectas = new HashMap<String, ArrayList<String>>();
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
						// Se añade a la lista la nueva contraseña fallida
						ArrayList<String> arrayList = contIncorrectas.get(nombre);
						arrayList.add(key);
					} else {
						// Se crea el nuevo usuario
						ArrayList<String> contNuevoUsuario = new ArrayList<String>();
						contNuevoUsuario.add(key);
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
		System.out.println(contIncorrectas);
		// Eliminar del arrayList
		System.out.println("¿Quieres eliminar algún elemento erróneo?");
		String resp = sc.next();
		if (resp.equalsIgnoreCase("s")) {
			System.out.println("¿Qué contraseña de la colección quieres eliminar?");
			String pos = sc.next();
			if (contIncorrectas.containsKey(nombre)) {
				// Se puede eliminar de la colección
				ArrayList<String> arrayList = contIncorrectas.get(nombre);
				Iterator<String> it = arrayList.iterator();
				boolean encontrada = false;
				while (it.hasNext() && !encontrada) {
					String c = it.next();
					if (c.equals(pos)) {
						encontrada = true;
						it.remove();
						System.out.println("Contraseña eliminada");
						System.out.println(contIncorrectas);
					}
				}
				if (!encontrada) {
					System.out.println("Contraseña no encontrada, no se puede eliminar");
				}

			}
		}

	}

}
