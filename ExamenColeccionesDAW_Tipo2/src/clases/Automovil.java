package clases;

public abstract class Automovil implements Comparable<Automovil>{

	public Automovil(String matricula) {
		super();
		this.matricula = matricula;
	}
	private String matricula;
	public abstract double precioReparacion(int numHoras);
	public String getMatricula() {
		return matricula;
	}
}
