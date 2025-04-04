package Examen3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Estacion {
	Map<String,Tren> trenes = new TreeMap<>();

	public Map<String, Tren> getTrenes() {
		return trenes;
	}

	public void setTrenes(Map<String, Tren> trenes) {
		this.trenes = trenes;
	}

	public Estacion(Map<String, Tren> trenes) {
		super();
		this.trenes = trenes;
	}

	public Estacion() {
		super();
	}

	@Override
	public String toString() {
		return "Estacion [trenes=" + trenes + "]";
	}
	
	//Metodo
	
	public boolean cambiarDestino(String id,String nuevoDestino) {
		Set<String> keys =trenes.keySet();
		boolean destinoCambiado = false;
		
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String tren = it.next();
			
			if(trenes.get(tren).getId().equals(id)) {
				trenes.get(tren).setDestino(nuevoDestino);
				destinoCambiado = true;
			}
		}
		return destinoCambiado;
	}
	
	public boolean cambiarHora(String id,String nuevaHora) {
		Set<String> keys = trenes.keySet();
		boolean destinoCambiado = false;
		
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String tren = it.next();
			
			if(trenes.get(tren).getId().equals(id)) {
				trenes.get(tren).setDestino(nuevaHora);
				destinoCambiado = true;
			}
		}
		return destinoCambiado;
	}
	
	public boolean aniadirTren(Tren t) {
		Set<String> keys = trenes.keySet();
		boolean encontrado = false;
		boolean aniadido = false;
		
	Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String tren = it.next();
			
			if(t.getId().equals(tren)) {
				encontrado = true;
			}
		}
		if(!encontrado) {
			trenes.put(t.getId(), t);
			aniadido = true;
		}
		return aniadido;
	}
	
	public void listaTrenesPorDestino() {
		List<Tren> listaTrenes = new ArrayList<>(trenes.values());
		Collections.sort(listaTrenes);
		System.out.println(listaTrenes);
	}


	
	
	

}
