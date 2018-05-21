package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioTres {
	
	//Escribe un programa que lea el fichero fundacionEImperio.txt y nos diga
	//el numero de lineas que contiene dicho fichero y cuantas palabras posee, en
	//este caso consideramos una palabra cuando despues de esta aparece uno o mas
	//espacios en blancos o un salto de linea.
	
	public static void main(String[] args) {
	
		File file = new File("ficheros\\carpeta\\fundacionEImperio.txt");
		int numeroLineas = 0;
		int numeroPalabras = 0;
		String[] palabras = null;
		try (Scanner sc = new Scanner (file);)
		{
			while(sc.hasNextLine()) {
				palabras = sc.nextLine().replaceAll("[,.;]","\\s").split("\\s+|\\n+");
				numeroPalabras+=palabras.length;
				numeroLineas++;
			}
		} catch (FileNotFoundException e) {
				
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Numero de lineas: %d y numero de palabras: %d ", numeroLineas,numeroPalabras);
	}
}
