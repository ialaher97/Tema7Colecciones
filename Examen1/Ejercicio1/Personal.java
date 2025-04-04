package Ejercicio1;

public abstract class Personal{
	private String id;

	public String getId() {
		return id;
	}

	public Personal(String id) {
		super();
		this.id = id;
	}

	public Personal() {
		super();
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + "]";
	}

	
	public abstract double calcularSueldoExtraPorDia();
	

}
