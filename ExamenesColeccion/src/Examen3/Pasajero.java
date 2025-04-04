package Examen3;

import java.util.Iterator;
import java.util.List;

public class Pasajero extends Vagon {
	private int numAsientos;
	private int capMax = 25;
	private List<Asiento> asientos;
	
	
	public int getNumAsientos() {
		return numAsientos;
	}
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	public int getCapMax() {
		return capMax;
	}
	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}
	public List<Asiento> getAsientos() {
		return asientos;
	}
	public void setAsientos(List<Asiento> asientos) {
		this.asientos = asientos;
	}
	public Pasajero(String id, int numAsientos, int capMax, List<Asiento> asientos) {
		super(id);
		this.numAsientos = numAsientos;
		this.capMax = capMax;
		this.asientos = asientos;
	}
	public Pasajero(String id) {
		super(id);
	}
	@Override
	public String toString() {
		return "Parajero [numAsientos=" + numAsientos + ", capMax=" + capMax + ", asientos=" + asientos + "]";
	}
	@Override
	public double calcularImporteVagon() {
		double resultado = 0;
		
		Iterator<Asiento> it = asientos.iterator();
		
		while(it.hasNext()){
			Asiento pos = (Asiento) it.next();
			
			resultado +=pos.getPrecio(); 
		}
		return resultado;
		}
	@Override
	public int compareTo(Vagon o) {
		return this.getId().compareTo(getId());
	}
	
	
}
