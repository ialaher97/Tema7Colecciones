package comparadores;

import java.util.Comparator;

import clases.Automovil;
import clases.Coche;

public class CochesPlazasComparador implements Comparator<Automovil>{

	@Override
	public int compare(Automovil o1, Automovil o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Coche && o2 instanceof Coche) {
			Coche c1= (Coche) o1;
			Coche c2= (Coche) o2;
		return c1.getNumPlazas()-c2.getNumPlazas();
		}
		return 0;
	}

	

}
