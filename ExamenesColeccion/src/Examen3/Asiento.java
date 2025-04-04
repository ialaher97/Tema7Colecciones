package Examen3;

public class Asiento implements Comparable<Asiento>{
	private String id;
	private String nombre;
	private int num;
	private String letra;
	private double precio;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Asiento(String id, String nombre, int num, String letra, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.num = num;
		this.letra = letra;
		this.precio = precio;
	}
	public Asiento() {
		super();
	}
	@Override
	public String toString() {
		return "Asiento [id=" + id + ", nombre=" + nombre + ", num=" + num + ", letra=" + letra + ", precio=" + precio
				+ "]";
	}
	
	@Override
	public int compareTo(Asiento o) {
		return (int) (this.getPrecio()-o.getPrecio());
	}
	
	
}
