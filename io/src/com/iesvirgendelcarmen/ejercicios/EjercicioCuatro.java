package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


//Escibe una clase denominada Persona que tenga las siguientes características:
//Atributos: nombre, apellidos, edad y dirección.
//Constructor que inicialice dichos atributos.
//Los correspondientes getters y setters
//La clase debe ser serializable.
//Crea un programa que cree cinco objetos del tipo Persona y que los guarde en un fichero binario denominado ejercicio4.dat.
//Posteriormente crea otro programa que lea dichos objetos y muestre por pantalla cada uno de los objetos.

public class EjercicioCuatro {

	public static void main(String[] args) {
		
		List<PersonaDeEjercicioCuatro> listaPersonas = new ArrayList<>();
		
		PersonaDeEjercicioCuatro persona1 = new PersonaDeEjercicioCuatro("Pepe", "Sánchez Gómez", 30, "Alamos 30");
		PersonaDeEjercicioCuatro persona2 = new PersonaDeEjercicioCuatro("Juan", "Martínez López", 30, "Roble 31");
		PersonaDeEjercicioCuatro persona3 = new PersonaDeEjercicioCuatro("Luis", "Ruíz Pérez", 30, "Abedul 32");
		PersonaDeEjercicioCuatro persona4 = new PersonaDeEjercicioCuatro("Antonio", "Fernández Cruz", 30, "Oliva 33");
		PersonaDeEjercicioCuatro persona5 = new PersonaDeEjercicioCuatro("Pedro", "Jiménez Díaz", 30, "Nogal 34");
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("ficheros\\ejercicio4.dat")));) 
		{
		/*	out.writeObject(persona1);
			out.writeObject(persona2);
			out.writeObject(persona3);
			out.writeObject(persona4);
			out.writeObject(persona5);
			out.flush();*/
			out.writeObject(listaPersonas);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File outFile = new File ("ficheros\\ejercicio4.dat");
		if(outFile.exists()) {
		System.out.printf("Creado fichero %s de tamaño %d bytes%n", outFile,outFile.length());
		}else System.out.println("No se ha podido crear el fichero");

	}

}
