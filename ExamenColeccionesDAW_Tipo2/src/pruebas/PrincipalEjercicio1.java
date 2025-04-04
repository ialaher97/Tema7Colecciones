package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import clases.Automovil;
import clases.Coche;
import clases.Motocicleta;
import clases.RedTalleres;
import clases.Taller;
import comparadores.CochesPlazasComparador;
import comparadores.ComparadorMotosCilindrada;

public class PrincipalEjercicio1 {

	public static void main(String[] args) {
	Coche c= new Coche("1234RRR");
	c.setAnioMatriculacion(2013);
	c.setColor("Rosa");
	c.setLlevaRemolque(false);
	c.setNumPlazas(4);
	c.setVolMaletero(40.5);
	Coche c1= new Coche("0234ZRR");
	c1.setAnioMatriculacion(1993);
	c1.setColor("Negro");
	c1.setLlevaRemolque(true);
	c1.setNumPlazas(2);
	c1.setVolMaletero(30);
	Coche c2= new Coche("5234YRR");
	c2.setAnioMatriculacion(1983);
	c2.setColor("Negro");
	c2.setLlevaRemolque(false);
	c2.setNumPlazas(6);
	c2.setVolMaletero(30);
	Coche c3= new Coche("5666ZRR");
	c3.setAnioMatriculacion(2020);
	c3.setColor("Blanco");
	c3.setLlevaRemolque(false);
	c3.setNumPlazas(8);
	c3.setVolMaletero(60);
	Motocicleta m=new Motocicleta("9876TGF");
	m.setCilindrada(250);
	m.setLongitudMoto(2);
	m.setTieneMaletero(false);
	Motocicleta m1=new Motocicleta("6876AGF");
	m1.setCilindrada(1500);
	m1.setLongitudMoto(1.5);
	m1.setTieneMaletero(false);
	Motocicleta m2=new Motocicleta("3876JGF");
	m2.setCilindrada(2500);
	m2.setLongitudMoto(1);
	m2.setTieneMaletero(true);
	Motocicleta m3=new Motocicleta("9076TGA");
	m3.setCilindrada(250);
	m3.setLongitudMoto(2.5);
	m3.setTieneMaletero(false);
	Motocicleta m4=new Motocicleta("4876LLF");
	m4.setCilindrada(250);
	m4.setLongitudMoto(1.6);
	m4.setTieneMaletero(true);
	Taller t= new Taller();
	t.setNif("XC9807689");
	Set<Automovil> listaAutos1=new HashSet<Automovil>();
	listaAutos1.add(c);
	listaAutos1.add(c1);
	listaAutos1.add(m);
	t.setListaAutomoviles(listaAutos1);
	Taller t2= new Taller();
	t2.setNif("AB9807689");
	Set<Automovil> listaAutos2=new HashSet<Automovil>();
	listaAutos2.add(c2);
	listaAutos2.add(c3);
	listaAutos2.add(m1);
	listaAutos2.add(m2);
	t2.setListaAutomoviles(listaAutos2);
	Taller t3= new Taller();
	t3.setNif("RR9807689");
	Set<Automovil> listaAutos3=new HashSet<Automovil>();
	
	listaAutos3.add(m3);
	listaAutos3.add(m4);
	t3.setListaAutomoviles(listaAutos3);
	
	RedTalleres rt=new RedTalleres();
	Map<String, Taller> mapa=new HashMap<String, Taller>();
	mapa.put(t.getNif(), t);
	mapa.put(t2.getNif(), t2);
	mapa.put(t3.getNif(), t3);
	rt.setMapaRed(mapa);
	//Prueba de los métodos
	Motocicleta m5=new Motocicleta("6076TGA");
	m5.setCilindrada(50);
	m5.setLongitudMoto(2.5);
	m5.setTieneMaletero(false);
 System.out.println("Se puede reparar:"+t.entradaParaReparar(m5));	
 System.out.println("Precio reparación:"+ m4.precioReparacion(6));
 Coche a4=new Coche("89076TTT");
 a4.setNumPlazas(6);
 System.out.println("Se puede reparar:"+t2.entradaParaReparar(a4));	
 System.out.println("Precio reparación:"+ a4.precioReparacion(6));
 System.out.println("Antes de reparar:"+t3.getListaAutomoviles());
 t3.automovilReparado("RR9807689");
 System.out.println("Después de reparar:"+t3.getListaAutomoviles());
 
 //Comparadores
 CochesPlazasComparador cp=new CochesPlazasComparador();
 ComparadorMotosCilindrada cm=new ComparadorMotosCilindrada();
 
 ArrayList<Coche> lista=new ArrayList<Coche>();
 ArrayList<Motocicleta> listaMoto=new ArrayList<Motocicleta>();
 Iterator<Automovil> iter=t.getListaAutomoviles().iterator();
 while(iter.hasNext()) {
	 Automovil auto= iter.next();
	 if(auto instanceof Coche) {
		 lista.add((Coche) auto);
	 }else if(auto instanceof Motocicleta) {
		 listaMoto.add((Motocicleta) auto);
	 }
 }
 
 System.out.println("Antes de ordenar:"+ lista);
 Collections.sort(lista,cp);
 System.out.println("Despues de ordenar:"+ lista);
	
	
	
	
	
	}

}
