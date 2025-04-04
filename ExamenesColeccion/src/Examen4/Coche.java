package Examen4;

import java.util.Objects;

public class Coche extends Automovil {
	private int numPlazas;
	private int volMaletero;
	private String color;
	private boolean llevaRemolque;
	private int anioMatriculacion;
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public int getVolMaletero() {
		return volMaletero;
	}
	public void setVolMaletero(int volMaletero) {
		this.volMaletero = volMaletero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isLlevaRemolque() {
		return llevaRemolque;
	}
	public void setLlevaRemolque(boolean llevaRemolque) {
		this.llevaRemolque = llevaRemolque;
	}
	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}
	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}
	public Coche(String id, int numPlazas, int volMaletero, String color, boolean llevaRemolque,
			int anioMatriculacion) {
		super(id);
		this.numPlazas = numPlazas;
		this.volMaletero = volMaletero;
		this.color = color;
		this.llevaRemolque = llevaRemolque;
		this.anioMatriculacion = anioMatriculacion;
	}
	public Coche(String id) {
		super(id);
	}
	@Override
	public String toString() {
		return "Coche [numPlazas=" + numPlazas + ", volMaletero=" + volMaletero + ", color=" + color
				+ ", llevaRemolque=" + llevaRemolque + ", anioMatriculacion=" + anioMatriculacion + "]";
	}
	@Override
	public double precioReparacion(int numHoras) {
		double precioTotal = 0;
		if(llevaRemolque && anioMatriculacion>2000) {
			precioTotal = 0;
			precioTotal = 30*numHoras+(((30*numHoras)*20)/100);
		}else if(llevaRemolque && anioMatriculacion<2000) {
			precioTotal = 30*numHoras+(((30*numHoras)*10)/100);
		}
		return precioTotal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anioMatriculacion, color, llevaRemolque, numPlazas, volMaletero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return anioMatriculacion == other.anioMatriculacion && Objects.equals(color, other.color)
				&& llevaRemolque == other.llevaRemolque && numPlazas == other.numPlazas
				&& volMaletero == other.volMaletero;
	}
	
	
	

}
