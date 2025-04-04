package Examen4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Examen4 {
    public static void main(String[] args) {
        // Create some Coche instances
        Coche coche1 = new Coche("C001", 5, 400, "Rojo", true, 2010);
        Coche coche2 = new Coche("C002", 5, 350, "Azul", false, 2005);

        // Create some Motocicleta instances
        Motocicleta moto1 = new Motocicleta("M001", 125, true, 180);
        Motocicleta moto2 = new Motocicleta("M002", 250, false, 160);

        // Create two Taller instances
        Set<Object> automovilesTaller1 = new HashSet<>();
        automovilesTaller1.add(coche1);
        automovilesTaller1.add(moto1);

        Set<Object> automovilesTaller2 = new HashSet<>();
        automovilesTaller2.add(coche2);
        automovilesTaller2.add(moto2);

        Taller taller1 = new Taller("Taller1", automovilesTaller1);
        Taller taller2 = new Taller("Taller2", automovilesTaller2);

        // Create a Redtalleres instance
        Redtalleres redTalleres = new Redtalleres();
        redTalleres.getTalleres().put(taller1.getNif(), taller1);
        redTalleres.getTalleres().put(taller2.getNif(), taller2);

        // Display initial state of workshops
        System.out.println("Estado inicial de los talleres:");
        System.out.println(redTalleres);

        // Test cerrarTaller method
        System.out.println("\nIntentando cerrar Taller1 y transferir vehículos a Taller2:");
        boolean cerrado = redTalleres.cerrarTaller("Taller1", "Taller2");
        System.out.println("Taller cerrado: " + cerrado);

        // Display final state of workshops
        System.out.println("\nEstado final de los talleres:");
        System.out.println(redTalleres);

        // Test hayHuecos method
        System.out.println("\n¿Hay huecos para coches en Taller2? " + taller2.hayHuecos("coche"));
        System.out.println("¿Hay huecos para motocicletas en Taller2? " + taller2.hayHuecos("motocicleta"));

        // Test entradaParaReparar method
        System.out.println("\nAñadiendo un nuevo coche al Taller2 para reparar:");
        Coche coche3 = new Coche("C003", 4, 300, "Verde", true, 2015);
        boolean reparado = taller2.entradaParaReparar(coche3);
        System.out.println("Coche añadido para reparación: " + reparado);

        System.out.println("\nEstado final del Taller2:");
        System.out.println(taller2);

        // Test automovilReparado method
        System.out.println("\nEliminando motocicleta M002 del Taller2:");
        boolean eliminado = taller2.automovilReparado("M002");
        System.out.println("Motocicleta eliminada: " + eliminado);

        System.out.println("\nEstado final del Taller2 tras reparación:");
        System.out.println(taller2);
    }
}