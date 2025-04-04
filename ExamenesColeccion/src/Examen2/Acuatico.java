package Examen2;

public class Acuatico extends Animal{
	int longitud;
	int litrosAgua;
	String tipoAgua;
	
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getLitrosAgua() {
		return litrosAgua;
	}
	public void setLitrosAgua(int litrosAgua) {
		this.litrosAgua = litrosAgua;
	}
	public String getTipoAgua() {
		return tipoAgua;
	}
	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}
	
	public Acuatico(String id, int longitud, int litrosAgua, String tipoAgua) {
		super(id);
		this.longitud = longitud;
		this.litrosAgua = litrosAgua;
		this.tipoAgua = tipoAgua;
	}
	public Acuatico() {
		super();
	}
	@Override
	public String toString() {
		return "Acuatico [longitud=" + longitud + ", litrosAgua=" + litrosAgua + ", tipoAgua=" + tipoAgua + "]";
	}
	@Override
	public double calcularKilosAlimentos() {
		double cantidadComida = 0;
		if(longitud<50 && tipoAgua.equalsIgnoreCase("dulce")) {
			cantidadComida = 500;
		}else if(longitud>50 && tipoAgua.equalsIgnoreCase("dulce")) {
			cantidadComida = longitud*80;
		}else {
			cantidadComida = 600;
		}
		return cantidadComida;
		
	}
	@Override
	public int compareTo(Animal o) {
		return this.getId().compareTo(o.getId());
	
	}
	
	
	
	
}
