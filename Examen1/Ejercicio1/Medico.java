package Ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Medico extends Personal implements Comparable<Medico> {
	private int numPacientes = 6;
	private int salarioBase;
	private Set<Paciente> pacientes;
	int cont = 0;
	
	
	public int getNumPacientes() {
		return numPacientes;
	}


	public void setNumPacientes(int numPacientes) {
		this.numPacientes = numPacientes;
	}


	public int getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Set<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	
	public Medico(String id, int salarioBase, Set<Paciente> pacientes) {
		super(id);
		this.salarioBase = salarioBase;
		this.pacientes = pacientes;
	}


	public Medico(String id) {
		super(id);
	}


	@Override
	public String toString() {
		return "Medico [numPacientes=" + numPacientes + ", salarioBase=" + salarioBase + ", pacientes=" + pacientes
				+ "]";
	}

	/*si la lista de pacientes tiene más
	de la mitad de la capacidad máxima, se calculará (salarioBase
	+20%salarioBase)/número de pacientes. Si la lista de pacientes es menor que la mitad el dinero extra se calculará
:(salarioBase -10%salarioBase)/capacidad máxima*/
	
	
	@Override
	public double calcularSueldoExtraPorDia() {
		int cantidad = 0;
		double sueldoExtra = 0;
		
		Iterator <Paciente> it = pacientes.iterator();
		while(it.hasNext()) {
			it.next();
			cantidad++;
		}
		if(cantidad>5) {
			sueldoExtra = ((salarioBase + (salarioBase*20)/100))/cantidad;
		}else {
			sueldoExtra = ((salarioBase - (salarioBase*10)/100))/numPacientes;
		}
		
		return sueldoExtra;
	}
	
	public void aniadirPaciente(Paciente a) {
		
		if(cont<numPacientes) {
			pacientes.add(a);
			cont++;
			System.out.println("Paciente añadido a la lista");
		}else {
			System.out.println("Num de pacientes maximo alcanzado");
		}
}


	@Override
	public int hashCode() {
		return Objects.hash(cont, numPacientes, pacientes, salarioBase);
	}


	@Override
	public boolean equals(Object obj) {
		Medico other = (Medico) obj;
		return cont == other.cont && numPacientes == other.numPacientes && Objects.equals(pacientes, other.pacientes)
				&& salarioBase == other.salarioBase;
	}


	@Override
	public int compareTo(Medico o) {
		int comparar = this.getSalarioBase() -o.salarioBase;
		return comparar;
	}
	
	
	
	

}
