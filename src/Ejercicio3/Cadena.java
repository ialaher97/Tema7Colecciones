package Ejercicio3;


public class Cadena implements Comparable <Cadena>{
	private String cadena;

	@Override
	public int compareTo(Cadena o) {
		return cadena.compareTo(o.cadena);
		
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Cadena(String cadena) {
		super();
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return "Cadena [cadena=" + cadena + "]";
	}
	

}
