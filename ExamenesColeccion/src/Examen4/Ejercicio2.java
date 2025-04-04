package Examen4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		Map<String,List<Album>> mapa = new HashMap<>();
		
		Map<Integer,List<Cantante>> nuevoMapa= new HashMap<>();
		
		Set<String> keys = mapa.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			String st = (String) it.next();
			
			List<Album> album = mapa.get(st);
			
			Iterator it1 = album.iterator();
			
			while(it1.hasNext()) {
				
				Album a = (Album) it1.next();
				List<Cantante> b = new ArrayList<>();
				nuevoMapa.put(a.getAnioPublicacion(), b);
			}
			
			Iterator it2 = keys.iterator();
			while(it2.hasNext()){
			String st1 = (String) it2.next();
			
			List<Album> album1 = mapa.get(st1);
			
			Iterator it3 = album1.iterator();
		
			while(it3.hasNext()) {
				Album a1 = (Album) it3.next();
				if(a1.getAnioPublicacion() == nuevoMapa.g);
			}
			}
			
		}
		
	}

}
