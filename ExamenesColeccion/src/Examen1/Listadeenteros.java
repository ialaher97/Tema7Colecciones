package Examen1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Listadeenteros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el número que quieres borrar");
		int numero = sc.nextInt();
		
		 List<Integer> lista1 = new ArrayList<>();
	        lista1.add(1);
	        lista1.add(2);
	        lista1.add(3);
	        lista1.add(4);
	        lista1.add(5);

	        List<Integer> lista2 = new ArrayList<>();
	        lista2.add(10);
	        lista2.add(2); 
	        lista2.add(20);
	        lista2.add(3); 

	        List<Integer> lista3 = new ArrayList<>();
	        lista3.add(100);
	        lista3.add(2);  
	        lista3.add(200);
	        lista3.add(300);

	        List<Integer> lista4 = new ArrayList<>();
	        lista4.add(7);
	        lista4.add(8);
	        lista4.add(9);
	        lista4.add(3); 

	        List<Integer> lista5 = new ArrayList<>();
	        lista5.add(15);
	        lista5.add(25);
	        lista5.add(35);
	        lista5.add(2);  
	        lista5.add(45);
	       
	        List<List<Integer>> listasDeEnteros = new ArrayList<>();
	        listasDeEnteros.add(lista1);
	        listasDeEnteros.add(lista2);
	        listasDeEnteros.add(lista3);
	        listasDeEnteros.add(lista4);
	        listasDeEnteros.add(lista5);
	        
	       
		
		
		 eliminarNum(numero, listasDeEnteros);
		 System.out.println(listasDeEnteros.toString());
	
	}




public static void eliminarNum(int numero, List<List<Integer>> a) {
	
	
	Iterator it = a.iterator();
	
	while(it.hasNext()) {
		
		List<Integer> b = (List<Integer>) it.next();
		
		Iterator it1 = b.iterator();
		
		while(it1.hasNext()) {
			int pos = (int) it1.next();
			
			if(pos == numero) {
				it1.remove();
			}
		}
	}
	System.out.println("El numero: "+numero +" ha sido elminado");
	
}

}

