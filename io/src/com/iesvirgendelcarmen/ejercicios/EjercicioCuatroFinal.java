package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class EjercicioCuatroFinal {

	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\ejercicio4.dat")));)
		{
			/*PersonaDeEjercicioCuatro persona1Leida = (PersonaDeEjercicioCuatro) in.readObject();
			PersonaDeEjercicioCuatro persona2Leida = (PersonaDeEjercicioCuatro) in.readObject();
			PersonaDeEjercicioCuatro persona3Leida = (PersonaDeEjercicioCuatro) in.readObject();
			PersonaDeEjercicioCuatro persona4Leida = (PersonaDeEjercicioCuatro) in.readObject();
			PersonaDeEjercicioCuatro persona5Leida = (PersonaDeEjercicioCuatro) in.readObject();*/

			List<PersonaDeEjercicioCuatro> listaPersonasLeidas = (List<PersonaDeEjercicioCuatro>) in.readObject();
			for (PersonaDeEjercicioCuatro personaDeEjercicioCuatro : listaPersonasLeidas) {
				System.out.println(personaDeEjercicioCuatro.getNombre());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
