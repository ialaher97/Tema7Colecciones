package Examen1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Comprobar1 {
	public static void main(String[] args) {

		Hospital h1 = new Hospital("H1", "ID001",new ArrayList <Object>() );
		Hospital h2 = new Hospital("H2", "ID002",new ArrayList <Object>() );
		Hospital h3 = new Hospital("H3", "ID003",new ArrayList <Object>() );
		Hospital h4 = new Hospital("H4", "ID004",new ArrayList <Object>() );
		Hospital h5 = new Hospital("H5", "ID005",new ArrayList <Object>() );
		
		Red_hospital r1 = new Red_hospital(new HashMap<String,Hospital>());
		r1.mapa.put("ID001", h1);
		r1.mapa.put("ID002", h2);
		r1.mapa.put("ID003", h3);
		r1.mapa.put("ID004", h4);
		r1.mapa.put("ID005", h5);
		
  
		
		Enfermero e1 = new Enfermero("A1",new HashSet<>());
		
		Medico m1 = new Medico("M1",1500,new HashSet<>());
		
		Paciente p1 = new Paciente("Juan", "Pérez", "12345678A");
		Paciente p2 = new Paciente("María", "Gómez", "23456789B");
		Paciente p3 =new Paciente("Pedro", "Ramírez", "34567890C");
		Paciente p4 =new Paciente("Laura", "Fernández", "45678901D");
		Paciente p5 =new Paciente("Carlos", "Martínez", "56789012E");
		Paciente p6 =new Paciente("Sofía", "López", "67890123F");
		Paciente p7 =new Paciente("Andrés", "Torres", "78901234G");
		Paciente p8 =new Paciente("Elena", "Ruiz", "89012345H");
		Paciente p9 =new Paciente("Miguel", "Santos", "90123456I");
		Paciente p10 =new Paciente("Lucía", "Ortega", "01234567J");
		
        Visita v1 = new Visita("Juan", "Pérez", "Calle A",123456789,"222");
        Visita v2 = new Visita("María", "Gómez", "Avenida B",987654321, "456");
        Visita v3 = new Visita("Carlos", "Fernández", "Plaza C", 567890123," 789");
        Visita v4 = new Visita("Ana", "López", "Calle D",678901234,"321");
        Visita v5 = new Visita("Pedro", "Martínez", "Avenida E", 345678901,"654");
        Visita v6 = new Visita("Laura", "Sánchez", "Plaza F",234567890,"987" );
        
        e1.getVisitasADomicilio().add(v1);
        e1.getVisitasADomicilio().add(v2);
        e1.getVisitasADomicilio().add(v3);
		e1.getVisitasADomicilio().add(v4);
		
		
		e1.aniadirPaciente(v1);
		e1.aniadirPaciente(v2);
		e1.aniadirPaciente(v3);
		e1.aniadirPaciente(v4);
		e1.aniadirPaciente(v5);
		
		
		m1.aniadirPaciente(p1);
		m1.aniadirPaciente(p2);
		m1.aniadirPaciente(p3);
		m1.aniadirPaciente(p4);
		m1.aniadirPaciente(p5);
		m1.aniadirPaciente(p6);
		m1.aniadirPaciente(p7);
		
		
		System.out.println(e1.calcularSueldoExtraPorDia());
		System.out.println(m1.calcularSueldoExtraPorDia());
		
		h1.contratarPersonal("A1", "Enfermero");
		h1.contratarPersonal("M1", "Medico");
		h2.contratarPersonal("A1", "Enfermero");
		
		System.out.println(e1.getVisitasADomicilio());
		
		h1.despedirPersonal("M1");
		h1.despedirPersonal("A1");
		
		h1.anadirPaciente(p10, m1);
		h1.anadirPaciente(p10, m1);
		
		
		
		
		r1.cambiarPersonal("M1", "ID001", "ID002", "Enfermero");
		
		r1.cerrarHospital("ID001","ID004");
		
		r1.listHospitales();
		
	
		

	}

}

