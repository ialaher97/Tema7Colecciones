package Examen2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo implements Interfaz {
	private int capacidadTerrestre = 50;
	private int capacidadAcuatico = 20;
	private int cantT = 0;
	private int cantA = 0;
	List<Object> animales = new ArrayList<>();

	public int getCapacidadTerrestre() {
		return capacidadTerrestre;
	}

	public void setCapacidadTerrestre(int capacidadTerrestre) {
		this.capacidadTerrestre = capacidadTerrestre;
	}

	public int getCapacidadAcuatico() {
		return capacidadAcuatico;
	}

	public void setCapacidadAcuatico(int capacidadAcuatico) {
		this.capacidadAcuatico = capacidadAcuatico;
	}

	public int getCantT() {
		return cantT;
	}

	public void setCantT(int cantT) {
		this.cantT = cantT;
	}

	public int getCantA() {
		return cantA;
	}

	public void setCantA(int cantA) {
		this.cantA = cantA;
	}

	public List<Object> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Object> animales) {
		this.animales = animales;
	}

	public Zoo(int capacidadTerrestre, int capacidadAcuatico, int cantT, int cantA, List<Object> animales) {
		super();
		this.capacidadTerrestre = capacidadTerrestre;
		this.capacidadAcuatico = capacidadAcuatico;
		this.cantT = cantT;
		this.cantA = cantA;
		this.animales = animales;
	}

	public Zoo() {
		super();
	}

	@Override
	public String toString() {
		return "Zoo [capacidadTerrestre=" + capacidadTerrestre + ", capacidadAcuatico=" + capacidadAcuatico + ", cantT="
				+ cantT + ", cantA=" + cantA + ", animales=" + animales + "]";
	}

	@Override
	public boolean adoptarAnimal(String tipoAnimal) {
		boolean SePuedeAniadir = false;
		if (tipoAnimal.equalsIgnoreCase("Acuatico") && cantA < 20) {
			SePuedeAniadir = true;
		} else if (tipoAnimal.equalsIgnoreCase("Terrestre") && cantT < 50) {
			SePuedeAniadir = true;
		} else {
			System.out.println("No hay hueco para ese animal");
		}
		return SePuedeAniadir;
	}

	@Override
	public boolean aniadirAnimal(Object animal) {
		boolean encontrado = false;
		boolean aniadido = false;
		
			Iterator it = animales.iterator();
			
			while (it.hasNext() && !encontrado) {
				Animal a = (Animal) it.next();
				if (((Animal)animal).getId().equals(a.getId())) {
					encontrado = true;
				}
			}
		
		if (!encontrado) {
			animales.add(animal);
			cantT += 1;
			System.out.println("Se ha añadido el animal al zoo");
			aniadido = true;
		}
		return encontrado;
	}

	@Override
	public boolean cederAnimal(String idAnimal) {
		boolean encontrado = false;

		Iterator it = animales.iterator();

		while (it.hasNext() && !encontrado) {
			Object a = it.next();

			if (a instanceof Terrestre) {
				Terrestre t = (Terrestre) a;
				if (t.getId().equals(idAnimal)) {
					encontrado = true;
					animales.remove(a);
					System.out.println("Se ha cedido el animal");
					cantT -= 1;
				}
			}
			if (a instanceof Acuatico) {
				Acuatico ac = (Acuatico) a;
				if (ac.getId().equals(idAnimal)) {
					encontrado = true;
					animales.remove(a);
					System.out.println("Se ha cedido el animal");
					cantT -= 1;
				}
			}
		}

		return encontrado;
	}

}
