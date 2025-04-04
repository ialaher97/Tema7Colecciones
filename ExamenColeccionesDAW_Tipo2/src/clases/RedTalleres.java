package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedTalleres {
	Map<String, Taller> mapaRed = new HashMap<String, Taller>();

	public Map<String, Taller> getMapaRed() {
		return mapaRed;
	}

	public void setMapaRed(Map<String, Taller> mapaRed) {
		this.mapaRed = mapaRed;
	}

	// Listará los NIF de los talleres que tienen hueco para ese tipo de automóvil.
	public List<String> talleresDisponibles(String tipoAutomovil) {
		Set<String> keySet = mapaRed.keySet();
		List<String> result = new ArrayList<String>();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String nif = iterator.next();
			Taller taller = mapaRed.get(nif);
			boolean hayHueco = taller.hayHueco(tipoAutomovil);
			if (hayHueco) {
				result.add(nif);
			}
		}
		return result;

	}

	// boolean cerrarTaller(String nifTallerACerrar,String nifNuevo):Eliminará de la
	// red de talleres el taller identificado por el nif y los automóviles que
	// pudiera tener en reparación se añadirán si hay hueco al nuevo taller. El
	// método devolverá verdadero sólo cuando se hayan podido pasar todos los
	// automóviles.
	private boolean cerrarTaller(String nifTallerACerrar, String nifNuevo) {
		boolean traspaso=false;
		if (mapaRed.get(nifTallerACerrar) != null && mapaRed.get(nifNuevo) != null) {
			Taller tallerCerrar = mapaRed.get(nifTallerACerrar);
			
			Set<Automovil> autosTraspasar = tallerCerrar.getListaAutomoviles();
			int totalAuto = autosTraspasar.size();
			int cuantosHuecos = 0;
			Iterator<Automovil> iterator = autosTraspasar.iterator();
			while (iterator.hasNext()) {
				Automovil a = iterator.next();
				if (a instanceof Coche) {
					if (tallerCerrar.hayHueco("Coche")) {
						cuantosHuecos++;
					}
				}
				if (a instanceof Motocicleta) {
					if (tallerCerrar.hayHueco("Motocicleta")) {
						cuantosHuecos++;
					}
				}
			}
			if(totalAuto<=cuantosHuecos) {
				traspaso=true;
				mapaRed.get(nifNuevo).getListaAutomoviles().addAll(autosTraspasar);
			}
		}
		return traspaso;

	}
}
