package Examen2;

public abstract class Animal implements Comparable<Animal> {
	String id;

	public String getId() {
		return id;
	}


	public Animal(String id) {
		super();
		this.id = id;
	}

	public Animal() {
		super();
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}
	
	public abstract double calcularKilosAlimentos();

}
