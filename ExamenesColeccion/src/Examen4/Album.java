package Examen4;

public class Album {
	private String nombre;
	private int anioPublicacion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public Album(String nombre, int anioPublicacion) {
		super();
		this.nombre = nombre;
		this.anioPublicacion = anioPublicacion;
	}
	
	public Album() {
		super();
	}
	@Override
	public String toString() {
		return "Album [nombre=" + nombre + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
}
