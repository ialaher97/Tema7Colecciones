package Examen1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hospital implements Comparable<Hospital> {
	private String nombre;
	private String id;
	private List<Object> personal;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Object> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Object> personal) {
		this.personal = personal;
	}

	public Hospital(String nombre, String id, List<Object> personal) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.personal = personal;
	}

	public Hospital() {
		super();
	}

	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", id=" + id + ", personal=" + personal + "]";
	}

	// METODOS

	public boolean contratarPersonal(String id, String tipoPersonal) {
		boolean aniadido = false;
		boolean existe = false;
		Iterator<Object> it = personal.iterator();

		while (it.hasNext() && !existe) {
			Object a = it.next();

			if (a instanceof Medico) {
				Medico m = (Medico) a;
				if (m.getId().equals(id)) {
					existe = true;

				}
			} else if (a instanceof Enfermero) {
				Enfermero f = (Enfermero) a;
				if (f.getId().equals(id)) {
					existe = true;
				}
			}
		}
		if (!existe) {
			if (tipoPersonal.equals("Medico")) {
				Set<Paciente> lista = new HashSet<>();
				Medico m = new Medico(id, 1800, lista);
				personal.add(m);
				aniadido = true;
				System.out.println("Medico contratado");

			} else if (tipoPersonal.equals("Enfermero")) {
				Set<Visita> lista = new HashSet<>();
				Enfermero f = new Enfermero(id, lista);
				personal.add(f);
				aniadido = true;
				System.out.println("Enfermero añadido");
			}
		}
		return aniadido;
	}

	public boolean despedirPersonal(String id) {
		boolean eliminado = false;
		Iterator<Object> it = personal.iterator();

		while (it.hasNext() && !eliminado) {
			Object a = it.next();

			if (a instanceof Medico) {
				Medico m = (Medico) a;
				if (m.getId().equals(id)) {
					personal.remove((Medico) a);
					eliminado = true;
					System.out.println("Medico despedido");

				}
			} else if (a instanceof Enfermero) {
				Enfermero f = (Enfermero) a;
				if (f.getId().equals(id)) {
					personal.remove(a);
					eliminado = true;
					System.out.println("Enfermero despedido");
				}
			}
		}
		return eliminado;

	}

	public boolean anadirPaciente(Paciente p, Medico a) {
		boolean existe = false;
		boolean aniadido = false;

		Iterator it = personal.iterator();

		while (it.hasNext()) {
			Object b = it.next();
			if (b instanceof Medico) {
				Medico m = (Medico) b;
				if (m.equals(a)) {
					Set<Paciente> lista = a.getPacientes();
					Iterator<Paciente> it1 = lista.iterator();

					while (it.hasNext() && !existe) {
						Paciente p1 = it1.next();
						if (p1.equals(p)) {
							existe = true;
							System.out.println("El paciente ya existe");
						} else {
							lista.add(p);
							a.setPacientes(lista);
							System.out.println("Paciente añadido");
							existe = true;
						}
					}
				}
			}
		}
		return existe;
	}

	public boolean modificarDireccionCuras(String idPersonal, String idVisita, String nuevaDireccion) {
		boolean existe = false;
		boolean encontrado = false;

		Iterator<Object> it = personal.iterator();

		while (it.hasNext() && !existe) {
			Object a = it.next();
			if (a instanceof Enfermero) {
				Enfermero f = (Enfermero) a;
				if (f.getId().equals(idPersonal)) {
					Set<Visita> lista = f.getVisitasADomicilio();
					existe = true;

					Iterator it1 = lista.iterator();

					while (it1.hasNext() && !encontrado) {
						Visita v = (Visita) it1.next();
						if (v.getIdUnico().equals(idVisita)) {
							encontrado = true;
							v.setDireccion(nuevaDireccion);
							System.out.println("Direccion actualizada");

						}
					}
				}
			}
		}
		if (!existe) {
			System.out.println("No se encuentra el enfermero en la lista");
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado la id de la visita");
		}
		return encontrado;
	}

	@Override
	public int compareTo(Hospital o) {
		int comparar = this.nombre.compareTo(o.nombre); 
		return comparar;
	}
	
	

}