package Examen2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Red_zoos {
	Map<String, Zoo> redZoo = new HashMap<>();

	public Map<String, Zoo> getRedZoo() {
		return redZoo;
	}

	public void setRedZoo(Map<String, Zoo> redZoo) {
		this.redZoo = redZoo;
	}

	public Red_zoos(Map<String, Zoo> redZoo) {
		super();
		this.redZoo = redZoo;
	}

	public Red_zoos() {
		super();
	}

	@Override
	public String toString() {
		return "Red_zoos [redZoo=" + redZoo + "]";
	}

	public void listaZoológicos(String tipoAnimal) {
		List<String> nombreZoo = new ArrayList<>();
		Set<String> keys = redZoo.keySet();

		Iterator it = keys.iterator();

		while (it.hasNext()) {
			String nombre = (String) it.next();

			Zoo z = redZoo.get(nombre);
			boolean existe = z.adoptarAnimal(tipoAnimal);
			if (existe) {
				nombreZoo.add(nombre);
			}
		}
		System.out.println(nombreZoo.toString());

	}

	public boolean cerrarZoo(String zooACerrar, String zooNuevo) {
		boolean cerrado = false;
		int contA = 0;
		int contT = 0;
		Zoo cerrar = redZoo.get(zooACerrar);
		Zoo nuevo = redZoo.get(zooNuevo);

		if (redZoo.containsKey(zooACerrar)) {
			Iterator it = cerrar.getAnimales().iterator();

			while (it.hasNext()) {
				Object o = it.next();
				if (o instanceof Terrestre) {
					contT += 1;
				} else {
					contA += 1;
				}
			}

		}
		if (redZoo.containsKey(zooNuevo)) {
			Iterator it = nuevo.getAnimales().iterator();

			while (it.hasNext()) {
				Object o1 = it.next();
				if (o1 instanceof Terrestre) {
					contT += 1;
				} else {
					contA += 1;
				}
			}
		}

		if (contT < 50 && contA < 20) {
			nuevo.getAnimales().addAll(cerrar.getAnimales());
			nuevo.setCantA(contA);
			nuevo.setCantT(contT);
			cerrado = true;
		}
		return cerrado;

	}
}
