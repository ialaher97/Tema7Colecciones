package Ejercicio10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;


public class Comprobar {

	public static void main(String[] args) {
		TreeSet<Carta> baraja = new TreeSet<Carta>();
		HashMap<String, Integer> valorCartas = new HashMap<>();
		int puntosTotales = 0;
		int cont = 0;
		valorCartas.put("As", 11);
		valorCartas.put("Tres", 10);
		valorCartas.put("Rey", 4);
		valorCartas.put("Caballo", 3);
		valorCartas.put("Sota", 2);

		String[] palo = { "Oro", "Copa", "Basto", "Espada" };
		String[] num = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo",
				"Rey" };
		
		while(baraja.size()<5) {
			int paloRandom = (int) (Math.random() * 4);
			int numRandom = (int) (Math.random() * 12);

			Carta a = new Carta(palo[paloRandom], num[numRandom]);
			
			if(!baraja.equals(a)) {
			baraja.add(a);
			
					
				}

			}
		
		Iterator<Carta> it = baraja.iterator();
		while (it.hasNext()) {
			Carta b = it.next();
			if(valorCartas.containsKey(b.getNumero())) {
				puntosTotales += valorCartas.get(b.getNumero());
			}
		}
				
		System.out.println(baraja.toString());
		System.out.println("Los puntos totales son: "+puntosTotales);
	}
}
