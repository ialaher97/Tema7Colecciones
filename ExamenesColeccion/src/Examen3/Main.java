package Examen3;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Create some Asiento instances
        Asiento asiento1 = new Asiento("A1", "John Doe", 1, "A", 50.0);
        Asiento asiento2 = new Asiento("A2", "Jane Doe", 2, "B", 60.0);

        // Create some Caja instances
        Caja caja1 = new Caja("C1", 10, 5.0);
        Caja caja2 = new Caja("C2", 15, 7.0);

        // Create a Mercancia instance
        List<Caja> cajas = new ArrayList<>();
        cajas.add(caja1);
        cajas.add(caja2);
        Mercancia mercancia = new Mercancia("M1", 50, cajas);

        // Create a Pasajero instance
        List<Asiento> asientos = new ArrayList<>();
        asientos.add(asiento1);
        asientos.add(asiento2);
        Pasajero pasajero = new Pasajero("P1", 2, 25, asientos);

        // Create a Tren instance
        List<Vagon> vagones = new ArrayList<>();
        vagones.add(mercancia);
        vagones.add(pasajero);
        Tren tren = new Tren("T1", "Madrid", "Barcelona", 1200, vagones);

        // Test calcularImporteVagon for Mercancia
        System.out.println("Mercancia importe: " + mercancia.calcularImporteVagon());

        // Test calcularImporteVagon for Pasajero
        System.out.println("Pasajero importe: " + pasajero.calcularImporteVagon());

        // Test the hayHueco method for Tren
        System.out.println("Hay hueco en Mercancia: " + tren.hayHueco("M1"));

        // Test the aniadirAlVagon method for Tren
        Caja caja3 = new Caja("C3", 5, 3.0);
        tren.aniadirAlVagon(caja3, "M1");
        System.out.println("Cajas en Mercancia tras añadir: " + mercancia.getCajas());

        // Test the cancelarDelVagon method for Tren
        tren.cancelarDelVagon("M1", "C1");
        System.out.println("Cajas en Mercancia tras cancelar: " + mercancia.getCajas());

        // Test the cambiarDestino method for Estacion
        Tren tren2 = new Tren("T2", "Sevilla", "Granada", 900, new ArrayList<>());
        Tren tren3 = new Tren("T3", "Bilbao", "San Sebastian", 1100, new ArrayList<>());
        Tren tren4 = new Tren("T4", "Malaga", "Cordoba", 1400, new ArrayList<>());
        Tren tren5 = new Tren("T5", "Valencia", "Alicante", 1600, new ArrayList<>());

        // Create an Estacion and add all Tren instances
        Estacion estacion = new Estacion();
        estacion.aniadirTren(tren2);
        estacion.aniadirTren(tren3);
        estacion.aniadirTren(tren4);
        estacion.aniadirTren(tren5);
        System.out.println("Tren tras cambiar destino: " + tren);

        // Test the listaTrenesPorDestino method for Estacion
        estacion.listaTrenesPorDestino();

	}

}
