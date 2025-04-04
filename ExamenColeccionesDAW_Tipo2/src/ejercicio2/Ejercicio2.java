package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		Map<String,List<Album>> mapOriginal=new HashMap<String,List<Album>>();
		Album a1= new Album(2008,"Death Magnetic");
		Album a2= new Album(2008,"La ley innata");
		Album a3= new Album(2008,"HAARP");
		
		Album a4= new Album(1999,"S&M");
		Album a5= new Album(1999,"Canciones Prohibidas");
		Album a6= new Album(1999,"Showbiz");
		
		Album a7= new Album(1989,"And Justice for all");
		Album a8= new Album(1989,"Rock Transgresivo");
		Album a9= new Album(1989,"Muscle Museum");
		List<Album> listm=new ArrayList<Album>();
		List<Album> listext=new ArrayList<Album>();
		List<Album> listmell=new ArrayList<Album>();
		listm.add(a3);
		listm.add(a6);
		listm.add(a9);
		listext.add(a2);
		listext.add(a5);
		listext.add(a7);
		listmell.add(a1);
		listmell.add(a4);
		listmell.add(a7);
		mapOriginal.put("Muse", listm);
		mapOriginal.put("Extremoduro", listext);
		mapOriginal.put("Metallica", listmell);
		
		Map<Integer,List<Cantante>> mapaResultado= generarListaCantante(mapOriginal);
		System.out.println(mapaResultado);

	}

	private static Map<Integer, List<Cantante>> generarListaCantante(Map<String, List<Album>> mapOriginal) {
		Map<Integer, List<Cantante>> result= new HashMap<Integer, List<Cantante>>();
		List<Cantante> anio1=new ArrayList<Cantante>();
		List<Cantante> anio2=new ArrayList<Cantante>();
		List<Cantante> anio3=new ArrayList<Cantante>();
		result.put(2008, anio1);
		result.put(1999, anio2);
		result.put(1989, anio3);
		Set<String> keySet = mapOriginal.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			List<Album> list = mapOriginal.get(next);
			Iterator<Album> iterAlbum=list.iterator();
			while(iterAlbum.hasNext()) {
				Album a=iterAlbum.next();
				Cantante c=new Cantante(next, a.getTituloAlbum());
				if(a.getAnio().equals(2008)) {
					anio1.add(c);
				}
				if(a.getAnio().equals(1999)) {
					anio2.add(c);
				}
				if(a.getAnio().equals(1989)) {
					anio3.add(c);
				}
			}
		}

		
		return result;
	}

}
