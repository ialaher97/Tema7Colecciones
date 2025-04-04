package iterator;

public class Vehiculo implements Comparable<Vehiculo> {

	private String matricula;
	private int anioAntiguedad;
	private String color;
	private int plazas;
	private String marca;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnioAntiguedad() {
		return anioAntiguedad;
	}

	public void setAnioAntiguedad(int anioAntiguedad) {
		this.anioAntiguedad = anioAntiguedad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Vehiculo(String matricula, int anioAntiguedad, String color, int plazas, String marca) {
		super();
		this.matricula = matricula;
		this.anioAntiguedad = anioAntiguedad;
		this.color = color;
		this.plazas = plazas;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", anioAntiguedad=" + anioAntiguedad + ", color=" + color
				+ ", plazas=" + plazas + ", marca=" + marca + "]";
	}

	public boolean modificarMatricula(String antigua, String nueva) {
		boolean cambiada = false;
		if (matricula.equals(antigua)) {
			cambiada = true;
			matricula = nueva;
		}
		return cambiada;
	}

	public boolean modificarAntiguedad(String matricula, int anio) {
		boolean cambiada = false;
		if (this.matricula.equals(matricula)) {
			cambiada = true;
			this.anioAntiguedad = anio;
		}
		return cambiada;
	}

	@Override
	public int compareTo(Vehiculo arg0) {
		// TODO Auto-generated method stub
		return this.matricula.compareTo(arg0.matricula);
	}

}
