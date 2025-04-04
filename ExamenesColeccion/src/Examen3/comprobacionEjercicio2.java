package Examen3;

import java.util.HashMap;
import java.util.Map;

public class comprobacionEjercicio2 {

	public static void main(String[] args) {
		
		Map<String, Traduccion> mapaOriginal = new HashMap<>();
	        mapaOriginal.put("casa", new Traduccion("ingles", "house"));
	        mapaOriginal.put("coche", new Traduccion("ingles", "car"));
	        mapaOriginal.put("perro", new Traduccion("ingles", "dog"));
	        mapaOriginal.put("casa1", new Traduccion("frances", "maison"));
	        mapaOriginal.put("coche1", new Traduccion("frances", "voiture"));
	        mapaOriginal.put("perro1", new Traduccion("frances", "chien"));
	        mapaOriginal.put("casa2", new Traduccion("italiano", "casa"));
	        mapaOriginal.put("coche2", new Traduccion("italiano", "auto"));
	        mapaOriginal.put("perro2", new Traduccion("italiano", "cane"));
	        
	        MapaPalabras nuevo = new MapaPalabras(mapaOriginal);
	        
	        nuevo.nuevoMapa();
	        
	      

	}

}
