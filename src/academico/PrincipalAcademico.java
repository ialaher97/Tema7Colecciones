package academico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrincipalAcademico {

	public static void main(String[] args) {
		Academico ac = new Academico("Juan", 2000);
		Academico ac1 = new Academico("Ana", 1980);
		Academico ac2 = new Academico("Luis", 2005);
		Academico ac3 = new Academico("Lucia", 1975);
		Academico ac4 = new Academico("Lorena", 2003);
		Map<Character, Academico> mapa = new HashMap<Character, Academico>();

		nuevoIngreso(mapa, ac, 'A');
		nuevoIngreso(mapa, ac1, 'z');
		nuevoIngreso(mapa, ac2, 'L');
		nuevoIngreso(mapa, ac3, 's');
		nuevoIngreso(mapa, ac4, 'M');
		System.out.println(mapa.toString());
		List<Academico> lista = new ArrayList<Academico>();
		// Los mapas se recorren con las claves
		Set<Character> keySet = mapa.keySet(); // Permite obtener todas las claves
		Iterator<Character> it = keySet.iterator();
		while (it.hasNext()) {
			Character c = it.next();
			Academico academico = mapa.get(c);
			lista.add(academico);
		}
		System.out.println("Listado de académicos:" + lista);
		Collections.sort(lista);
		System.out.println("Listado de académicos por nombre:" + lista);
		Collections.sort(lista,new ComparadorAnio());
		System.out.println("Listado de académicos por año ingreso:" + lista);
		TreeMap<Character,Academico> mapaOrdenado= new TreeMap<Character, Academico>();
		mapaOrdenado.putAll(mapa);
		System.out.println(mapaOrdenado);
	}

	static boolean nuevoIngreso(Map<Character, Academico> academia, Academico nuevo, Character letra) {
		boolean insertado = false;
		if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
			// Mirar si clave K existe en el mapa
			if (academia.containsKey(letra)) {
				// Accedemos al valor V del mapa para setter el objeto

				academia.get(letra).setAnioIngreso(nuevo.getAnioIngreso());
				academia.get(letra).setNombre(nuevo.getNombre());
				insertado = true;
			} else {
				academia.put(letra, nuevo);
				insertado = true;
			}
		}
		return insertado;
	}

}
