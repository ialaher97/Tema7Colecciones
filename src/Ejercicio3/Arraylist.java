package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		List<Cadena> aleatoria = new ArrayList<>();
		
		for(int i= 0;i<5;i++) {
			System.out.println("Dime una palabra");
			String letra = sc.nextLine();
			Cadena a = new Cadena(letra);
			aleatoria.add(a);
			
		}
		Collections.sort(aleatoria);
		System.out.println(aleatoria.toString());
		
	}

}
