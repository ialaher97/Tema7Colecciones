package Examen3;



public abstract class Vagon implements Comparable<Vagon> {
	private String id;

	public String getId() {
		return id;
	}


	public Vagon(String id) {
		super();
		this.id = id;
	}

	public Vagon() {
		super();
	}

	@Override
	public String toString() {
		return "Vagon [id=" + id + "]";
	}
	
	//Metodo
	
	public abstract double calcularImporteVagon();
	
	

}
