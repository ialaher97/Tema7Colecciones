package Examen2;

import java.util.Comparator;

public class Compararporpeso implements Comparator<Terrestre>{

	@Override
	public int compare(Terrestre o1, Terrestre o2) {
		return o1.getPeso()-o2.getPeso();
	}



}
