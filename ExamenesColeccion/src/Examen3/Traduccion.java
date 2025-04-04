package Examen3;

public class Traduccion {
	private String idioma;
	private String Traduccion;
	
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getTraduccion() {
		return Traduccion;
	}
	public void setTraduccion(String traduccion) {
		Traduccion = traduccion;
	}
	public Traduccion(String idioma, String traduccion) {
		super();
		this.idioma = idioma;
		Traduccion = traduccion;
	}
	public Traduccion() {
		super();
	}
	@Override
	public String toString() {
		return "Traduccion [idioma=" + idioma + ", Traduccion=" + Traduccion + "]";
	}
	
	
}
