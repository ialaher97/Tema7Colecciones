package Examen1;

public class Visita {
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private String idUnico;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getIdUnico() {
		return idUnico;
	}
	
	public Visita(String nombre, String apellido, String direccion, int telefono, String idUnico) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.idUnico = idUnico;
		
	}
	
	
	public Visita() {
		super();
	}
	@Override
	public String toString() {
		return "Visita [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
				+ telefono + ", idUnico=" + idUnico + "]";
	}
	
	
	
	

}
