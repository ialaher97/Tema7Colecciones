package Ejercicio8_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Diccionario {
	public static void main(String[] args) {
	HashMap <String,String> diccionario = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	diccionario.put("Hola", "Hello");
	diccionario.put("Adios", "Bye");
	diccionario.put("Que", "What");
	diccionario.put("Como", "How");
	diccionario.put("Si", "Yes");
	diccionario.put("Donde", "Where");
	diccionario.put("Todo", "All");
	diccionario.put("El","He");
	diccionario.put("Ella", "She");
	
	System.out.println("¿Que palabra deseas traducir al ingles?");
	String palabra = sc.nextLine();
	
	if(diccionario.containsKey(palabra)) {
		System.out.println("La traduccion es: "+diccionario.get(palabra));
	}else {
		System.out.println("La palabra no se encuentra en el diccionario");
	}
	
	Set<String> palabras = (Set<String>) diccionario.keySet();
	ArrayList<String> listaKey = new ArrayList<>(palabras);
	int correctas = 0;
	int erroneas = 0;
	
    for(int i= 0;i<5;i++) {
	int random = (int) Math.random()*5;
	listaKey.get(random);
	System.out.println("Cual es la traduccion de esta palabra: "+listaKey.get(i));
	String resp = sc.nextLine();
	
	if(diccionario.containsValue(resp)) {
		System.out.println("Es correcto");
		correctas++;
	}else {
		System.out.println("Respuesta incorrecta");
		erroneas++;
	}
    }
    System.out.println("Has respondido correctamente: "+correctas);
    System.out.println("Has respondido erróneamente: "+erroneas);
    
	
	}
}
