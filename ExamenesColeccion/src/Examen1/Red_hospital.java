package Examen1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Red_hospital{
	Map <String,Hospital> mapa = new HashMap<>();

	public Map<String, Hospital> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Hospital> mapa) {
		this.mapa = mapa;
	}

	public Red_hospital(Map<String, Hospital> mapa) {
		super();
		this.mapa = mapa;
	}

	public Red_hospital() {
		super();
	}

	@Override
	public String toString() {
		return "Red_hospital [mapa=" + mapa + "]";
	}
	
	
	
	public boolean cambiarPersonal(String idPersonal,String antiguoHospital,String	nuevoHospital,String tipoPersonal) {
	boolean encontrado = false;
	boolean encontrado1 = false;
	boolean cambiado = false;
	
	if(mapa.containsKey(antiguoHospital)) {
		Hospital h = mapa.get(antiguoHospital);
		
		List<Object> lista = h.getPersonal();
		
		Iterator<Object> it = lista.iterator();
		
		while (it.hasNext() && !encontrado) {
				Object a = it.next();

				if (a instanceof Medico) {
					Medico m = (Medico) a;
					if (m.getId().equals(idPersonal)) {
						h.despedirPersonal(idPersonal);
						h.setPersonal(lista);
						encontrado = true;

					}
				} else if (a instanceof Enfermero) {
					Enfermero f = (Enfermero) a;
					if (f.getId().equals(idPersonal)) {
						h.despedirPersonal(idPersonal);
						h.setPersonal(lista);
						encontrado = true;
					}
				}
			}
			
		}

	if(mapa.containsKey(nuevoHospital)) {
		Hospital h = mapa.get(nuevoHospital);
		
		List<Object> lista = h.getPersonal();
		
		Iterator<Object> it = lista.iterator();
		
		while (it.hasNext() && !cambiado && !encontrado1) {
				Object a = it.next();

				if (a instanceof Medico) {
					Medico m = (Medico) a;
					if (m.getId().equals(idPersonal)) {
						System.out.println("Ya se encuentra contratado en este hospital");
						encontrado1 = true;

					}else {
						h.contratarPersonal(idPersonal, "Medico");
						cambiado = true;
						System.out.println("Se ha contratado un médico");
					}
				} else if (a instanceof Enfermero) {
					Enfermero f = (Enfermero) a;
					if (f.getId().equals(idPersonal)) {
						System.out.println("Ya se encuentra contradado en este hospital");
						encontrado1 = true;
					}else {
						h.contratarPersonal(idPersonal, "Enfermero");
						cambiado = true;
						System.out.println("Se ha contratado un Enfermero");
					}
				}
			}
			
		}
		return cambiado;

	}
	boolean cerrarHospital(String idCerrar,String idNuevoHospital) {
		boolean cerrado = false;
		if(mapa.containsKey(idCerrar)) {
			Hospital cerrar = mapa.get(idCerrar);
			Hospital nuevo = new Hospital("Nuevo",idNuevoHospital,cerrar.getPersonal());
			mapa.remove(idCerrar);
			mapa.put(idNuevoHospital, nuevo);
			System.out.println("Un hospital ha sido cerrado y el personal ha sido transladado al nuevo hospital");
			cerrado = true;
			
		}
	return cerrado;	
	}



	public void listHospitales(){
		ArrayList<Hospital> hospitales = new ArrayList<>(mapa.values());
		System.out.println(hospitales.toString());
		
		}
	}
	

	

		
	



