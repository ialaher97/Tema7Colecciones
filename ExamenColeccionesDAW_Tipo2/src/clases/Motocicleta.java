package clases;

public class Motocicleta extends Automovil {

	// cilindrada, si tiene maletero, longitud de la motocicleta.
	private int cilindrada;
	private boolean tieneMaletero;
	private double longitudMoto;

	public Motocicleta(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}

	//Precio por hora 36€. Si la motocicleta tiene una cilindrada mayor a 125 el precio aumentará en un 15%.
	@Override
	public double precioReparacion(int numHoras) {
		double precio=0;
		precio=30*numHoras;
		if(cilindrada>125) {
			precio=precio+(0.15*precio);
		}
		return precio;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isTieneMaletero() {
		return tieneMaletero;
	}

	public void setTieneMaletero(boolean tieneMaletero) {
		this.tieneMaletero = tieneMaletero;
	}

	public double getLongitudMoto() {
		return longitudMoto;
	}

	public void setLongitudMoto(double longitudMoto) {
		this.longitudMoto = longitudMoto;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", tieneMaletero=" + tieneMaletero + ", longitudMoto="
				+ longitudMoto + "]";
	}
	@Override
	public int compareTo(Automovil o) {
		// TODO Auto-generated method stub
		return this.getMatricula().compareTo(o.getMatricula());
	}
}
