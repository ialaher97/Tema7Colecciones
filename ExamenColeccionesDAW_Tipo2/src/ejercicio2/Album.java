package ejercicio2;

public class Album {
	private Integer anio;
	private String tituloAlbum;
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getTituloAlbum() {
		return tituloAlbum;
	}
	public void setTituloAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}
	public Album(Integer anio, String tituloAlbum) {
		super();
		this.anio = anio;
		this.tituloAlbum = tituloAlbum;
	}
	@Override
	public String toString() {
		return "Album [anio=" + anio + ", tituloAlbum=" + tituloAlbum + "]";
	}

}
