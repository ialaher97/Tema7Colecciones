package Examen3;

import java.util.Iterator;
import java.util.List;

public class Tren implements Comparable<Tren> {
	private String id;
	private String origen;
	private String destino;
	private int horaSalida;
	private List<Vagon> vagones;

	// Metodos

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public List<Vagon> getVagones() {
		return vagones;
	}

	public void setVagones(List<Vagon> vagones) {
		this.vagones = vagones;
	}

	public Tren(String id, String origen, String destino, int horaSalida, List<Vagon> vagones) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.vagones = vagones;
	}

	public Tren() {
		super();
	}

	@Override
	public String toString() {
		return "Tren [id=" + id + ", origen=" + origen + ", destino=" + destino + ", horaSalida=" + horaSalida
				+ ", vagones=" + vagones + "]";
	}

	public boolean hayHueco(String idVagon) {
		boolean hayHueco = false;
		int cant = 0;
		Iterator<Vagon> it = vagones.iterator();

		while (it.hasNext() && !hayHueco) {
			Vagon v = it.next();
			if (v.getId().equals(idVagon)) {
				if (v instanceof Mercancia) {
					List<Caja> c = ((Mercancia) v).getCajas();
					Iterator<Caja> it1 = c.iterator();
					while (it1.hasNext()) {
						it1.next();
						cant += 1;
					}
					if (cant < 50) {
						hayHueco = true;
					}
				}
			} else if (v.getId().equals(idVagon)) {
				if (v instanceof Pasajero) {
					List<Asiento> c = ((Pasajero) v).getAsientos();
					Iterator<Asiento> it1 = c.iterator();
					while (it1.hasNext()) {
						cant += 1;
						it1.next();
					}
					if (cant < 25) {
						hayHueco = true;
					}

				}
			}
		}
		return hayHueco;
	}

	public boolean aniadirAlVagon(Object asientoOCaja, String idVagon) {
		boolean aniadido = false;
		if (hayHueco(idVagon)) {
			if (asientoOCaja instanceof Caja) {
				Iterator<Vagon> it = vagones.iterator();
				while (it.hasNext() && !aniadido) {
					Vagon v = it.next();
					if (v.getId().equals(idVagon) && v instanceof Mercancia) {
						((Mercancia) v).getCajas().add((Caja) asientoOCaja);
						aniadido = true;
					}
				}
			} else if (asientoOCaja instanceof Caja) {
				Iterator<Vagon> it = vagones.iterator();
				while (it.hasNext() && !aniadido) {
					Vagon v = it.next();
					if (v.getId().equals(idVagon) && v instanceof Mercancia) {
						((Pasajero) v).getAsientos().add((Asiento) asientoOCaja);
						aniadido = true;
					}
				}
			}
		}
		return true;

	}
	
	public boolean cancelarDelVagon(String idVagon, String idCajaOAsiento) {
		boolean cancelado = false;
		
		Iterator <Vagon> it = vagones.iterator();
		
		while(it.hasNext()) {
			Vagon v = it.next();
			
			if(v.getId().equals(idVagon) && v instanceof Mercancia) {
				
				List<Caja> lista = ((Mercancia) v).getCajas();
				
				Iterator<Caja> it1 = lista.iterator();
				
				while(it1.hasNext() && !cancelado) {
					Caja c = it1.next();
					if(c.getCodigo().equals(idCajaOAsiento)) {
						lista.remove(c);
						cancelado = true;
					}
				}
				
				
			}
		}
		return cancelado;
		
	}

	@Override
	public int compareTo(Tren o) {
		return this.getDestino().compareTo(o.getDestino());
	}
}
