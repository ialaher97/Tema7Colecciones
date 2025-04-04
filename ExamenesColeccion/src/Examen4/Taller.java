package Examen4;

import java.util.Iterator;
import java.util.Set;

public class Taller implements Interfaz {
	private String nif;
	private Set<Object> automoviles;

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Set<Object> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(Set<Object> automoviles) {
		this.automoviles = automoviles;
	}

	public Taller(String nif, Set<Object> automoviles) {
		super();
		this.nif = nif;
		this.automoviles = automoviles;
	}

	public Taller() {
		super();
	}

	@Override
	public String toString() {
		return "Taller [nif=" + nif + ", automoviles=" + automoviles + "]";
	}

	@Override
	public boolean hayHuecos(String tipoAutomovil) {
		int cont = 0;
		boolean hayHueco = false;
		Iterator<Object> it = automoviles.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			if (tipoAutomovil.equalsIgnoreCase("coche")) {
				if (o instanceof Coche) {
					cont++;
					it.next();
				}
			}
			if (tipoAutomovil.equalsIgnoreCase("motocicleta")) {
				if (o instanceof Coche) {
					cont++;
					it.next();
				}
			}
		}
		if (tipoAutomovil.equalsIgnoreCase("coche") && cont < 5) {
			hayHueco = true;
		} else if (tipoAutomovil.equalsIgnoreCase("Motocicleta") && cont < 12) {
			hayHueco = true;
		}
		return hayHueco;
	}

	@Override
	public boolean entradaParaReparar(Object a) {
		boolean aniadido = false;
		boolean encontrada = false;
		Iterator it = automoviles.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			if (hayHuecos("motocicleta") && a instanceof Motocicleta && o instanceof Motocicleta) {
				if (((Motocicleta) a).getId().equals(((Motocicleta) o).getId())) {
					encontrada = true;
				}
			}
			if (hayHuecos("coche") && a instanceof Coche && o instanceof Coche) {
				if (((Coche) a).getId().equals(((Coche) o).getId())) {
					encontrada = true;
				}
			}
		}
		if(!encontrada) {
			automoviles.add(a);
			aniadido = true;
		}
		return aniadido;
	}

	@Override
	public boolean automovilReparado(String matricula) {
		boolean eliminado = false;
		Iterator<Object> it = automoviles.iterator();

		while (it.hasNext()) {
			Object o = it.next();

			if (((Automovil) o).getId().equals(matricula)) {
				automoviles.remove(o);
				eliminado = true;
			}

		}
		return eliminado;
	}
}
