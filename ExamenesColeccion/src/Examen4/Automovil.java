package Examen4;

public abstract class Automovil {
	private String id;

	public String getId() {
		return id;
	}


	public Automovil(String id) {
		super();
		this.id = id;
	}

	public Automovil() {
		super();
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + "]";
	}
	
	
//Metodo
	
	public abstract double precioReparacion(int numHoras);
}
