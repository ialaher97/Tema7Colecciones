package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eurocoin {
	public static void main(String[] args) {
		List<Moneda> lista = new ArrayList<>();
	int cont = 0;
	String[] valorMoneda = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25céntimos", "50 céntimos", "1 euro","2 euros"};
	String[] caraOCruz = {"Cara","Cruz"};
	Moneda m = new Moneda("1 céntimo","Cruz");
	lista.add(m);

	
	
	while(cont<6) {
		int nuevoValor = (int)(Math.random()*8);
		int nuevoCaraOCruz = (int)(Math.random()*2);
		Moneda m1 = new Moneda(valorMoneda[nuevoValor],caraOCruz[nuevoCaraOCruz]);
		if(m1.getValorMoneda().equalsIgnoreCase(lista.get(cont).getValorMoneda())|| m1.getCaraOCruz().equalsIgnoreCase(lista.get(cont).getCaraOCruz())) {
		lista.add(m1);
		cont++;
		Collections.sort(lista);
		}
		
	}
	System.out.println(lista.toString());

}
}