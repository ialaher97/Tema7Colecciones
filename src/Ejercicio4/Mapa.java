package Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mapa {

	public static void main(String[] args) {
		Map <String,String> cuenta = new HashMap<>();
		cuenta.put("Juan", "hola");
		cuenta.put("Marco","contra");
		cuenta.put("Fran", "blanco");
	
		
		Map <String,ArrayList<String>> contraError = new HashMap<>();
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		boolean existe = false;
		
		while(!existe) {
		System.out.println("Escribe nombre de usuario");
		String usuario = sc.nextLine();
		if(cuenta.containsKey(usuario) == false) {
			System.out.println("El nombre de usuario no existe");
		}else {
			existe = true;
		}
		while(cont<3) {
				System.out.println("Contraseña");
				String contra = sc.nextLine();
				
				if(cuenta.get(contra) != null) {
					System.out.println("Ha accedido al área restringida");
				}else if(cont<2){
					cont++;
					System.out.println("Contraseña incorrectra. le quedan "+(3-cont)+" intentos");
					
					
				}else {
					System.out.println("Numero de intentos superados.");
					cont++;
				}
				
				if(contraError.containsKey(usuario)) {
					ArrayList<String> arraylist = contraError.get(usuario);
					arraylist.add(contra);
				}else {
					ArrayList <String> contNuevoUsuario = new ArrayList<>();
					contNuevoUsuario.add(contra);
					contraError.put(usuario, contNuevoUsuario);
					
				}
			}
		
		System.out.println("¿Quieres eliminar alguna contraseña incorrecta? S/N");
		String resp = sc.nextLine();
		
		if(resp.equalsIgnoreCase("s")) {
			System.out.println("Que contrasela quieres eliminar" + contraError.toString());
			String eliminar = sc.nextLine();
			if(contraError.containsKey(usuario)) {
				ArrayList<String> contraseñas = contraError.get(usuario);
				Iterator it = contraseñas.iterator();
				boolean encontrada = false;
				while(it.hasNext()) {
					String c = (String) it.next();
					if(c.equals(eliminar)) {
						encontrada = true;
						it.remove();
						System.out.println("Contraseña eliminada");
						System.out.println(contraError);
					}
				}
			}
		}
		
	}

}
}
