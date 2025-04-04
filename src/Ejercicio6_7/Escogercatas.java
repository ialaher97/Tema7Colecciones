package Ejercicio6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Escogercatas {
	
	
	public static void main(String[] args) {
		String[] palo= {"oro","copa","basto","oro"};
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12};
		Set<Baraja> cartas = new HashSet<Baraja>();
		
		for(int i = 0;i<10;i++) {
			int paloRandom = (int)(Math.random()*4);
			int numRandom =(int)(Math.random()*12);
			Baraja a = new Baraja(palo[paloRandom],num[numRandom]);
		
			if(!cartas.equals(a)) {
				cartas.add(a);
			}
		}
		List<Baraja> nuevaList = new ArrayList<Baraja>(cartas);
		System.out.println(nuevaList.toString());
		Collections.sort(nuevaList);
		System.out.println(nuevaList.toString());
	}

}
