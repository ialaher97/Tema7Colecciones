package Ejercicio4;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Implementa el control de acceso al área restringida de un programa. Se debe
	 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
	 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
	 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
	 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
	 * nombres de usuario con sus correspondientes contraseñas deben estar
	 * almacenados en una estructura de la clase HashMap.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> mapaContrasenia = new HashMap<String, String>();
		mapaContrasenia.put("Juan", "1234");
		mapaContrasenia.put("Ana", "6785a");
		mapaContrasenia.put("Antonio", "rrju");
		mapaContrasenia.put("Paula", "abcd");
		int cont = 0;
		boolean acertada = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		while (cont < 3 && !acertada) {

			System.out.println("Introduce tu contraseña");
			String contrasenia = sc.nextLine();
			// Comprobamos que el usuario existe
			if (mapaContrasenia.containsKey(nombre)) {
				String contMapa = mapaContrasenia.get(nombre);
				if (contMapa.equals(contrasenia)) {
					System.out.println("Has accedido al área restringida");
					acertada = true;
				} else {
					System.out.println("Vuelvelo a intentar");
				}
			} else {
				System.out.println("Usuario no registrado");
				acertada = true;
			}
			cont++;
		}

	}

}
