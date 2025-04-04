package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Entero> numRandoms = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 20);
			Entero a = new Entero(num);
			numRandoms.add(a);
		}
		Collections.sort(numRandoms);
		System.out.println(numRandoms.toString());

	}

}
