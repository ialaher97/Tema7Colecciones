package comparadores;

import java.util.Comparator;

import clases.Automovil;
import clases.Coche;
import clases.Motocicleta;

public class ComparadorMotosCilindrada implements Comparator<Automovil>{

	@Override
	public int compare(Automovil o1, Automovil o2) {
		
		
		if(o1 instanceof Motocicleta && o2 instanceof Motocicleta) {
			Motocicleta c1= (Motocicleta) o1;
			Motocicleta c2= (Motocicleta) o2;
			return (c1.getCilindrada()-c2.getCilindrada())*-1;
		}
		return 0;
		
	}

}
