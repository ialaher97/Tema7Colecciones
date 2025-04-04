package contenedor;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] array=new Integer[0];
		 
		Contenedor c = new Contenedor(array);
		c.insertarAlPrincipio(1);
		c.insertarAlPrincipio(6);
		c.insertarAlPrincipio(2);
		System.out.println("Valores:"+c);
		c.ordenar();
		System.out.println("Valores ordenados:"+c);
		
		
		Persona[] arrayPersona=new Persona[0];
		Contenedor cPersona=new Contenedor(arrayPersona);
		cPersona.insertarAlPrincipio(new Persona("Maria",20));
		cPersona.insertarAlPrincipio(new Persona("Juan",12));
		cPersona.insertarAlPrincipio(new Persona("Luis",29));
		System.out.println("Valores:"+cPersona);
		cPersona.ordenar();
		System.out.println("Valores ordenados:"+cPersona);
		
	}

}
