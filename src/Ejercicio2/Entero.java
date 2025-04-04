package Ejercicio2;

public class Entero implements Comparable <Entero> {
 private int entero;

@Override
public int compareTo(Entero o) {
	return this.entero - o.entero;
	
}

public int getEntero() {
	return entero;
}

public void setEntero(int entero) {
	this.entero = entero;
}

public Entero(int entero) {
	super();
	this.entero = entero;
}

@Override
public String toString() {
	return "Entero [entero=" + entero + "]";
}


 
}
