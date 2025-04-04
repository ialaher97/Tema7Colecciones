package Examen2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Eliminarcadena {
	public static void main(String[] args) {
		List<List<String>> listaDeCadenas= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra a borrar");
		String palabra = sc.next();
		

	        // Crear la primera lista
	        List<String> lista1 = new ArrayList<>();
	        lista1.add("manzana");
	        lista1.add("pera");
	        lista1.add("plátano");

	        // Crear la segunda lista con algunas palabras repetidas
	        List<String> lista2 = new ArrayList<>();
	        lista2.add("pera"); // Repetida de lista1
	        lista2.add("plátano"); // Repetida de lista1
	        lista2.add("fresa");

	        // Crear la tercera lista con más palabras repetidas
	        List<String> lista3 = new ArrayList<>();
	        lista3.add("manzana"); // Repetida de lista1
	        lista3.add("fresa"); // Repetida de lista2
	        lista3.add("melón");

	        // Añadir las listas a la lista principal
	        listaDeCadenas.add(lista1);
	        listaDeCadenas.add(lista2);
	        listaDeCadenas.add(lista3);
	        
	        eliminarCadena("pera",listaDeCadenas);
	        System.out.println(listaDeCadenas);
	}
	
	
	
	
	public static void eliminarCadena(String cadena,List<List<String>> list) {
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			List<String> lista = (List<String>) it.next();
			
			Iterator it1 = lista.iterator();
			
			while(it1.hasNext()) {
				String palabra = (String) it1.next();
				if(palabra.equals(cadena)) {
					it1.remove();
				}
			}
		}
	}
}


