package academico;

public class Academico  implements Comparable<Academico>{

	private String nombre;
	private int anioIngreso;
	
	public Academico(String nombre, int anioIngreso) {
		super();
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}

	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", anioIngreso=" + anioIngreso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	@Override
	public int compareTo(Academico arg0) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(arg0.nombre);
	}

}
