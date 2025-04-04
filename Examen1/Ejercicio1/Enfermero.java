package Ejercicio1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Enfermero extends Personal implements Comparable<Enfermero>{
	private int numCuras = 5;
	private Set<Visita> visitasADomicilio;
	int cont = 0;
	
	
	public int getNumCuras() {
		return numCuras;
	}


	public void setNumCuras(int numCuras) {
		this.numCuras = numCuras;
	}


	public Set<Visita> getVisitasADomicilio() {
		return visitasADomicilio;
	}


	public void setVisitasADomicilio(Set<Visita> visitasADomicilio) {
		this.visitasADomicilio = visitasADomicilio;
	}


	public Enfermero(String id, Set<Visita> visitasADomicilio) {
		super(id);
		this.visitasADomicilio = visitasADomicilio;
	}


	public Enfermero(String id) {
		super(id);
	}



	@Override
	public String toString() {
		return "Enfermero [numCuras=" + numCuras + ", visitasADomicilio=" + visitasADomicilio + "]";
	}


	
	@Override
	public double calcularSueldoExtraPorDia() {
		int cant = 0;
		double sueldoExtra = 0;
		
		Iterator <Visita> it = visitasADomicilio.iterator();
		while(it.hasNext()){
			it.next();
			cant++;
		}
		if(cant == 5) {
			sueldoExtra = 50*5;
		}
		
		return sueldoExtra;
	}
	
	public void aniadirPaciente(Visita a) {
		
		if(cont<numCuras) {
			visitasADomicilio.add(a);
			cont++;
			System.out.println("Paciente añadido a la lista");
		}else {
			System.out.println("Num de pacientes maximo alcanzado");
		}
}


	@Override
	public int compareTo(Enfermero o) {
		int comparar = (int) this.calcularSueldoExtraPorDia() - (int)o.calcularSueldoExtraPorDia();
		return comparar;
	}
	

}
