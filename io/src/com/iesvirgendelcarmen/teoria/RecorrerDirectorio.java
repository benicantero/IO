package com.iesvirgendelcarmen.teoria;

import java.io.File;

public class RecorrerDirectorio {

	public static void main(String[] args) {
		File directorioPadre = new File("ficheros");
		if(directorioPadre.exists())
			listarDirectorio(directorioPadre);
		else
			System.out.println("No existe directorio");

	}

	private static void listarDirectorio(File directorioPadre) {
		System.out.println("\nDIRECTORIO: " +  directorioPadre.getPath());
		//obtener el contenido del directorio
		File[] ficheros = directorioPadre.listFiles();
		for (File file : ficheros) {
			if (file.isDirectory()) listarDirectorio(file);
			else
				System.out.print("Fichero: " + file.getPath() + " " + file.length() + " bytes\t");
		}
	}
	
	

}
