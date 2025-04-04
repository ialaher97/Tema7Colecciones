package clases;

public class Coche extends Automovil {

	// Atributos:número de plazas, volumen del maletero, color de la carrocería, si
	// lleva remolque y año de matriculación

	private int numPlazas;
	private double volMaletero;
	private String color;
	private boolean llevaRemolque;
	private int anioMatriculacion;

	public Coche(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double precioReparacion(int numHoras) {
		// Precio por hora:30€. Si el coche lleva remolque el precio total aumentará un
		// 20% y si el año de matriculación es inferior al 2000 el precio total
		// aumentará otro 10%.
		double precio=0;
		precio=30*numHoras;
		if(llevaRemolque) {
			precio=precio+(0.2 * precio);
		}
		if(anioMatriculacion<2000) {
			precio=precio+(0.1*precio);
		}

		return precio;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public double getVolMaletero() {
		return volMaletero;
	}

	public void setVolMaletero(double volMaletero) {
		this.volMaletero = volMaletero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isLlevaRemolque() {
		return llevaRemolque;
	}

	public void setLlevaRemolque(boolean llevaRemolque) {
		this.llevaRemolque = llevaRemolque;
	}

	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}

	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}

	@Override
	public String toString() {
		return "Coche [numPlazas=" + numPlazas + ", volMaletero=" + volMaletero + ", color=" + color
				+ ", llevaRemolque=" + llevaRemolque + ", anioMatriculacion=" + anioMatriculacion + "]";
	}

	@Override
	public int compareTo(Automovil o) {
		// TODO Auto-generated method stub
		return this.getMatricula().compareTo(o.getMatricula());
	}

}
