package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> numAleatorios = new ArrayList<Integer>();
		int tamanioAleatorio = (int) (Math.random()*11+10);
		int total = 0;
		double media= 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i<tamanioAleatorio;i++) {
			int num = (int) (Math.random()*101);
			numAleatorios.add(num);
		}
		
		System.out.println(numAleatorios.toString());
		
		Iterator <Integer> it = numAleatorios.iterator();
		
		while(it.hasNext()) {
			int numero = (Integer) it.next();
			total +=numero;
			if(numero > max) {
				max = numero;
			}else if (numero < min) {
				min = numero;
			}
			
		}
		System.out.println(total);
		
		media = total/tamanioAleatorio;
		System.out.println(media);
		System.out.println(max);
		System.out.println(min);
	}

}
