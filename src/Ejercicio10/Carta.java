package Ejercicio10;

import java.util.Objects;

public class Carta implements Comparable<Carta>{
	private String palo;
	private String numero;
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Carta(String palo, String numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	public Carta() {
		super();
	}
	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero.toLowerCase(), palo.toLowerCase());
	}
	@Override
	public boolean equals(Object obj) {
		
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(palo, other.palo);
	}
	@Override
	public int compareTo(Carta o) {
		
		return this.numero.compareTo(o.numero);
	}
	
	
	
	
	
	
}
