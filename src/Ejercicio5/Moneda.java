package Ejercicio5;

import java.util.Arrays;

public class Moneda implements Comparable<Moneda> {
	private String valorMoneda;
	private String caraOCruz;
	public String getValorMoneda() {
		return valorMoneda;
	}
	public void setValorMoneda(String valorMoneda) {
		this.valorMoneda = valorMoneda;
	}
	public String getCaraOCruz() {
		return caraOCruz;
	}
	public void setCaraOCruz(String caraOCruz) {
		this.caraOCruz = caraOCruz;
	}
	public Moneda(String valorMoneda, String caraOCruz) {
		super();
		this.valorMoneda = valorMoneda;
		this.caraOCruz = caraOCruz;
	}
	public Moneda() {
		super();
	}
	
	@Override
	public String toString() {
		return "Moneda [valorMoneda=" + valorMoneda + ", caraOCruz=" + caraOCruz + "]";
	}
	@Override
	public int compareTo(Moneda o) {
		int comparar =valorMoneda.compareTo(o.valorMoneda);
		if(comparar == 0) {
			return caraOCruz.compareTo(caraOCruz);
		}
		return comparar;
	}

	
	
	

}
