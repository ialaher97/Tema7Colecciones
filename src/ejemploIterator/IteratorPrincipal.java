package ejemploIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import contenedor.Persona;

public class IteratorPrincipal {

	public static void main(String[] args) {
		// Con arrays
		Persona[] a = new Persona[3];
		Persona p1=new Persona("Ana",18);
		Persona p2=new Persona("Maria",8);
		Persona p3=new Persona("Pedro",20);
		a[0]=p1;
		a[1]=p2;
		a[2]=p3;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Edad:"+a[i].getEdad());
			
		}
		//Con listas
		ArrayList<Persona> lista=new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		Iterator<Persona> iter=lista.iterator();
		while(iter.hasNext()) {
			Persona p=iter.next();
			System.out.println("Edad en lista:"+p.getEdad());
		}
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Dame un nombre");
			String nombre=sc.next();
			System.out.println("Dame la edad");
			int edad=sc.nextInt();
			Persona p=new Persona(nombre, edad);
			lista.add(p);
		}
	}

}
