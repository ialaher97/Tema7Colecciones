package Ejercicio6_7;

import java.util.Objects;

public class Baraja implements Comparable<Baraja> {
	String palo;
	int numero;
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Baraja(String palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	public Baraja() {
		super();
	}
	@Override
	public String toString() {
		return "Baraja [palo=" + palo + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero, palo.toLowerCase());
	}
	@Override
	public boolean equals(Object obj) {
		
		Baraja other = (Baraja) obj;
		return this.numero == other.numero && this.palo.equalsIgnoreCase(other.palo);
	}
	@Override
	public int compareTo(Baraja o) {
		int comparar = this.palo.compareTo(o.palo);
		if(comparar == 0) {
			return this.numero - o.numero;
		}
		return comparar;
	}
	
	
	
	
	
} 

