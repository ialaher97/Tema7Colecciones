package Examen3;

import java.util.Iterator;
import java.util.List;

public class Mercancia extends Vagon {
	private int numCajaMax = 50;
	List<Caja> cajas;
	
	
	
	public int getNumCajaMax() {
		return numCajaMax;
	}



	public void setNumCajaMax(int numCajaMax) {
		this.numCajaMax = numCajaMax;
	}



	public List<Caja> getCajas() {
		return cajas;
	}



	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}



	public Mercancia(String id, int numCajaMax, List<Caja> cajas) {
		super(id);
		this.numCajaMax = numCajaMax;
		this.cajas = cajas;
	}



	public Mercancia(String id) {
		super(id);
	}



	@Override
	public String toString() {
		return "Mercancia [numCajaMax=" + numCajaMax + ", cajas=" + cajas + "]";
	}



	@Override
	public double calcularImporteVagon() {
		double resultado = 0;
		
		Iterator<Caja> it = cajas.iterator();
		
		while(it.hasNext()){
			Caja pos = (Caja) it.next();
			
			resultado +=pos.getPrecio()*pos.getPeso(); 
		}
		return resultado;
		}



	@Override
	public int compareTo(Vagon o) {
		return this.getId().compareTo(o.getId());
	}
	
	
	

}
