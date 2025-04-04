package Examen3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapaPalabras {
	Map<String,Traduccion> mapa;

	public Map<String, Traduccion> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Traduccion> mapa) {
		this.mapa = mapa;
	}

	public MapaPalabras(Map<String, Traduccion> mapa) {
		super();
		this.mapa = mapa;
	}

	public MapaPalabras() {
		super();
	}

	@Override
	public String toString() {
		return "Ejercicio2 [mapa=" + mapa + "]";
	}
	
	//Metodo
	
	public void nuevoMapa() {
		Map<String,List<Palabra>> nuevoMapa = new HashMap<>();
		nuevoMapa.put("ingles", new ArrayList<Palabra>());
		nuevoMapa.put("frances",new ArrayList<Palabra>());
		nuevoMapa.put("italiano",new ArrayList<Palabra>());
		
		Set<String> palabras = mapa.keySet();
		
		Iterator <String> palabra = palabras.iterator();
		
		while(palabra.hasNext()) {
			String key = palabra.next();
			
			if(mapa.get(key).getIdioma().equals("ingles")) {
				List<Palabra> a = nuevoMapa.get("ingles");
				Palabra b = new Palabra(key,mapa.get(key).getTraduccion());
				a.add(b);
			}
			if(mapa.get(key).getIdioma().equals("frances")) {
				List<Palabra> a = nuevoMapa.get("frances");
				Palabra b = new Palabra(key,mapa.get(key).getTraduccion());
				a.add(b);
			}
			if(mapa.get(key).getIdioma().equals("italiano")) {
				List<Palabra> a = nuevoMapa.get("italiano");
				Palabra b = new Palabra(key,mapa.get(key).getTraduccion());
				a.add(b);
			}
			
		}
		System.out.println(nuevoMapa);
	}

}
