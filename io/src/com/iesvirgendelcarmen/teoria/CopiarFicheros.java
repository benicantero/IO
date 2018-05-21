package com.iesvirgendelcarmen.teoria;

import java.io.File;

public class CopiarFicheros {

	public static void main(String[] args) {
		String carpeta = "ficheros\\carpeta\\carpeta2";
		//comprobar que hemos pasado dos argumentos 
		if (args.length < 2) {
			System.out.println("Falta nombre de algun fichero");
			return;
		}
		if(args[0].equals(args[1]) ) {
			System.out.println("No pueden ser iguales los ficheros");
			System.exit(1);
		}
		File inFile = new File(carpeta + "/" + args[0]);
		if(!inFile.exists()) {
			System.out.println("No existe fichero a copiar");
			return;
		}
	}

}
