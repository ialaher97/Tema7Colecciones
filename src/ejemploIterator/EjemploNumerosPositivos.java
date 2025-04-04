package ejemploIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjemploNumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Integer num = 0;
		while (num >= 0) {
			System.out.println("Dame un número mayor o igual que 0. -1 para salir");
			num = sc.nextInt();
			if (num >= 0) {
				lista.add(num);
			}
		}

		System.out.println("Lista con números enteros:" + lista);

		Iterator<Integer> iter = lista.iterator();
		while (iter.hasNext()) {
			Integer integ = iter.next();
			if (integ % 2 == 0) { // Es par
				System.out.println(integ);
			}
			
		}
		Iterator<Integer> iter1 = lista.iterator();
		while (iter1.hasNext()) {
			Integer integ = iter1.next();
		if (integ % 3 == 0) { // multiplo de 3
			iter1.remove();
		}
		}
		System.out.println("Lista sin números enteros múltiplos de 3:" + lista);
	}

}
