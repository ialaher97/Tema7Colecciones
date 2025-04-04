package Examen2;

public class Terrestre extends Animal {
	private int peso;
	private String nombre;
	private String paisProcedencia;
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisProcedencia() {
		return paisProcedencia;
	}
	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}
	
	public Terrestre(String id, int peso, String nombre, String paisProcedencia) {
		super(id);
		this.peso = peso;
		this.nombre = nombre;
		this.paisProcedencia = paisProcedencia;
	}
	public Terrestre() {
		super();
	}
	@Override
	public String toString() {
		return "Terrestre [peso=" + peso + ", nombre=" + nombre + ", paisProcedencia=" + paisProcedencia + "]";
	}
	@Override
	public double calcularKilosAlimentos() {
		double cantidadKilos = 0;
		if(peso < 20) {
			cantidadKilos = 1000;
			
		}else {
			cantidadKilos = 60*peso;
		}
		return cantidadKilos;
		
	}
	@Override
	public int compareTo(Animal o) {
		return this.getId().compareTo(o.getId());
	
	}
	
	
	
	
	
}
