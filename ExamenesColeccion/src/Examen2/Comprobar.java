package Examen2;

import java.util.ArrayList;
import java.util.List;

public class Comprobar {
    public static void main(String[] args) {
        // Crear objetos de tipo Terrestre y Acuático usando los nuevos constructores
        Terrestre terrestre1 = new Terrestre("T001", 15, "León", "África");
        Terrestre terrestre2 = new Terrestre("T002", 25, "Elefante", "India");
        
        Acuatico acuatico1 = new Acuatico("A001", 40, 500, "dulce");
        Acuatico acuatico2 = new Acuatico("A002", 60, 1000, "salada");
        
        // Crear un zoológico
        Zoo zoo = new Zoo();
        
        // Añadir animales al zoológico
        zoo.aniadirAnimal(terrestre1);
        zoo.aniadirAnimal(terrestre2);
        zoo.aniadirAnimal(acuatico1);
        zoo.aniadirAnimal(acuatico2);
        
        // Mostrar animales del zoológico
        System.out.println("Animales en el zoo:");
        System.out.println(zoo.getAnimales());
        
        // Ceder un animal del zoológico
        zoo.cederAnimal("T001");
        
        // Mostrar animales después de ceder uno
        System.out.println("Animales en el zoo después de ceder:");
        System.out.println(zoo.getAnimales());
        
        // Crear red de zoológicos
        Red_zoos redZoos = new Red_zoos();
        
        // Añadir zoológicos a la red
        redZoos.getRedZoo().put("ZooMadrid", zoo);
        Zoo zooBarcelona = new Zoo();
        redZoos.getRedZoo().put("ZooBarcelona", zooBarcelona);
        
        // Listar zoológicos que pueden adoptar animales acuáticos
        redZoos.listaZoológicos("Acuatico");
        
        // Cerrar zoológico y transferir animales
        boolean cerrado = redZoos.cerrarZoo("ZooMadrid", "ZooBarcelona");
        System.out.println("¿Zoo cerrado? " + cerrado);
        System.out.println("Animales en ZooBarcelona:");
        System.out.println(redZoos.getRedZoo().get("ZooBarcelona").getAnimales());
        System.out.println(redZoos.getRedZoo().get("ZooBarcelona"));
        
        
        
      }
    
}