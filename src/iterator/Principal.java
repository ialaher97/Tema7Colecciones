package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
		Vehiculo v = new Vehiculo("78945RFG", 2025, "azul", 2, "toyota");
		Vehiculo v2 = new Vehiculo("11945LFG", 1999, "rojo", 2, "toyota");
		Vehiculo v3 = new Vehiculo("54945RFG", 2013, "azul", 4, "audi");
		Vehiculo v4 = new Vehiculo("32945RFG", 2008, "negro", 4, "bmw");
		listaVehiculo.add(v);
		listaVehiculo.add(v2);
		listaVehiculo.add(v3);
		listaVehiculo.add(v4);
		listaVehiculo.add(v3);
		HashSet<Vehiculo> sinRepetir=new HashSet<Vehiculo>();
		sinRepetir.addAll(listaVehiculo);
		ArrayList<Vehiculo> listaVehiculoSinRep = new ArrayList<Vehiculo>();
		listaVehiculoSinRep.addAll(sinRepetir);
		// Uso iterator
		Iterator<Vehiculo> it = listaVehiculo.iterator();
		while (it.hasNext()) {
			Vehiculo vIt = (Vehiculo) it.next();
			
			if (vIt.getMatricula().equals("11111")) {
				vIt.setColor("rosa");
			}

		}
		System.out.println(listaVehiculo.toString());
		//Conjunto
		//Sin orden especifico
		HashSet<Vehiculo> conjuntoV=new HashSet<Vehiculo>();
		conjuntoV.add(v);
		conjuntoV.add(v2);
		conjuntoV.add(v3);
		conjuntoV.add(v4);
		conjuntoV.add(v3);
		System.out.println(conjuntoV.toString());
		//Ordenado
		TreeSet<Vehiculo> conjuntoOrd=new TreeSet<Vehiculo>();
		conjuntoOrd.add(v);
		conjuntoOrd.add(v2);
		conjuntoOrd.add(v3);
		conjuntoOrd.add(v4);
		
		System.out.println("Ordenado:"+conjuntoOrd.toString());
		
	}

}
