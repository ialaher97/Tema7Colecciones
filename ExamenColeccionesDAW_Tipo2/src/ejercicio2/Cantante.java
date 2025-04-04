package ejercicio2;

public class Cantante {

	private String cantante;
	private String nombreAlbum;
	public Cantante(String cantante, String nombreAlbum) {
		super();
		this.cantante = cantante;
		this.nombreAlbum = nombreAlbum;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	@Override
	public String toString() {
		return "Cantante [cantante=" + cantante + ", nombreAlbum=" + nombreAlbum + "]";
	}
}
