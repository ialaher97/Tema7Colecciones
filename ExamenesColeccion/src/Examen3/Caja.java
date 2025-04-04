package Examen3;

public class Caja implements Comparable <Caja> {
	private String codigo;
	private int peso;
	private double precio;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Caja(String codigo, int peso, double precio) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.precio = precio;
	}
	public Caja() {
		super();
	}
	@Override
	public String toString() {
		return "Caja [codigo=" + codigo + ", peso=" + peso + ", precio=" + precio + "]";
	}
	@Override
	public int compareTo(Caja o) {
		return this.getPeso()-o.getPeso();
	}
	
	
}
