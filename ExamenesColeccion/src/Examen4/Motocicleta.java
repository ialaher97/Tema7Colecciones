package Examen4;

import java.util.Objects;

public class Motocicleta extends Automovil {
	private int cilindrada;
	private boolean tieneMaletero;
	private int longitud;
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public boolean isTieneMaletero() {
		return tieneMaletero;
	}
	public void setTieneMaletero(boolean tieneMaletero) {
		this.tieneMaletero = tieneMaletero;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public Motocicleta(String id, int cilindrada, boolean tieneMaletero, int longitud) {
		super(id);
		this.cilindrada = cilindrada;
		this.tieneMaletero = tieneMaletero;
		this.longitud = longitud;
	}
	public Motocicleta(String id) {
		super(id);
	}
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", tieneMaletero=" + tieneMaletero + ", longitud=" + longitud
				+ "]";
	}
	@Override
	public double precioReparacion(int numHoras) {
		double precioTotal = 0;
		if(cilindrada>125) {
			precioTotal = 36*numHoras+(((36*numHoras)*15)/100);
			
		}
		return precioTotal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cilindrada, longitud, tieneMaletero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motocicleta other = (Motocicleta) obj;
		return cilindrada == other.cilindrada && longitud == other.longitud && tieneMaletero == other.tieneMaletero;
	}
	
	
	
	
}
