package Examen2;

import java.util.Comparator;

public class Compararporlongitud implements Comparator<Acuatico> {

	@Override
	public int compare(Acuatico o1, Acuatico o2) {
		return o1.getLongitud()-o2.getLongitud();
	}

}
