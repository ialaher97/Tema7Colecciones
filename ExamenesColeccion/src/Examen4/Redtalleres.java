package Examen4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Redtalleres {
	Map<String, Taller> talleres = new HashMap<>();

	public Map<String, Taller> getTalleres() {
		return talleres;
	}

	public void setTalleres(Map<String, Taller> talleres) {
		this.talleres = talleres;
	}

	public Redtalleres(Map<String, Taller> talleres) {
		super();
		this.talleres = talleres;
	}

	public Redtalleres() {
		super();
	}

	@Override
	public String toString() {
		return "Redtalleres [talleres=" + talleres + "]";
	}

	public List<String> talleresDisponibles(String tipoAutomovil) {
		List<String> listaTalleres = new ArrayList<>();
		Set<String> nifTalleres = talleres.keySet();

		Iterator<String> it = nifTalleres.iterator();

		while (it.hasNext()) {
			String nif = (String) it.next();

			Taller t = talleres.get(nif);

			Iterator it1 = t.getAutomoviles().iterator();

			while (it1.hasNext()) {
				Taller pos = (Taller) it1.next();
				if (pos.hayHuecos(tipoAutomovil)) {
					listaTalleres.add(nif);
				}
			}
		}
		return listaTalleres;

	}

	public boolean cerrarTaller(String nifTallerACerrar, String nifNuevo) {
		boolean cerrado = false;
		int contC = 0;
		int contM = 0;
		Set<Object> t = talleres.get(nifTallerACerrar).getAutomoviles();
		Set<Object> t1 = talleres.get(nifTallerACerrar).getAutomoviles();

		if (talleres.containsKey(nifTallerACerrar)) {
			

			Iterator it = t.iterator();
			while (it.hasNext()) {
				Object o = it.next();
				if (o instanceof Coche) {
					contC++;
					it.next();
				}

				if (o instanceof Motocicleta) {
					contM++;
					it.next();
				}
			}
		}
		if (talleres.containsKey(nifNuevo)) {
			
			Iterator it = t1.iterator();
			while (it.hasNext()) {
				Object o1 = it.next();
				if (o1 instanceof Coche) {
					contC++;
					it.next();
				}

				if (o1 instanceof Motocicleta) {
					contM++;
					it.next();
				}
			}
			if(contC <=5 && contM <=12) {
				t1.addAll(t);
				talleres.remove(nifTallerACerrar);
				cerrado = true;
			}
		}
		return cerrado;
	}

}
