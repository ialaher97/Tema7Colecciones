package Examen4;

public class Cantante {
	private String nombre;
	private String titulo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Cantante(String nombre, String titulo) {
		super();
		this.nombre = nombre;
		this.titulo = titulo;
	}
	public Cantante() {
		super();
	}
	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", titulo=" + titulo + "]";
	}
	
	
}
