package clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import interfaces.GestionTaller;

public class Taller implements GestionTaller {

	private Set<Automovil> listaAutomoviles = new HashSet<Automovil>();
	private String nif;
	private final int CAP_COCHES = 5;
	private final int CAP_MOTOS = 12;

	public Set<Automovil> getListaAutomoviles() {
		return listaAutomoviles;
	}

	public void setListaAutomoviles(Set<Automovil> listaAutomoviles) {
		this.listaAutomoviles = listaAutomoviles;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getCAP_COCHES() {
		return CAP_COCHES;
	}

	public int getCAP_MOTOS() {
		return CAP_MOTOS;
	}

	@Override
	public String toString() {
		return "Taller [listaAutomoviles=" + listaAutomoviles + ", nif=" + nif + ", CAP_COCHES=" + CAP_COCHES
				+ ", CAP_MOTOS=" + CAP_MOTOS + "]";
	}

	/*
	 * Deberá comprobarse si hay hueco para el tipo de automóvil pasado como
	 * parámetro. Deberá comprobar en la lista si hay menos automóviles que la
	 * capacidad correspondiente
	 * 
	 */
	@Override
	public boolean hayHueco(String tipoAutomovil) {
		boolean hueco=false;
		Iterator<Automovil> iter=listaAutomoviles.iterator();
		int coches=0;
		int motos=0;
		while(iter.hasNext()) {
			Automovil auto=iter.next();
			if(auto instanceof Coche) {
				coches++;
			}else if(auto instanceof Motocicleta) {
				motos++;
			}
		}
		if(tipoAutomovil.equals("Coche")) {
			if(coches<CAP_COCHES) {
				hueco=true;
			}
		}
		if(tipoAutomovil.equals("Motocicleta")) {
			if(motos<CAP_MOTOS) {
				hueco=true;
			}
		}
		return hueco;
	}

	@Override
	public <T> boolean entradaParaReparar(T a) {
		boolean insertado=false;
		if(a instanceof Coche) {
			if(hayHueco("Coche")) {
				insertado=	listaAutomoviles.add((Coche) a);
			}
		}
		if(a instanceof Motocicleta) {
			if(hayHueco("Motocicleta")) {
				insertado=	listaAutomoviles.add((Motocicleta) a);
			}
		}
		return insertado;
	}

	@Override
	public boolean automovilReparado(String matricula) {
		boolean eliminado=false;
		Iterator<Automovil> iter=listaAutomoviles.iterator();
		while(iter.hasNext() && !eliminado) {
			Automovil auto=iter.next();
			if(auto.getMatricula().equals(matricula)) {
				iter.remove();
				eliminado=true;
			}
		}
		return eliminado;
	}
}
