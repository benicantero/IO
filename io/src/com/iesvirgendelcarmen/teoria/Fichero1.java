package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.util.Arrays;

public class Fichero1 {

	public static void main(String[] args) {
		File file = new File("ficheros\\fichero.txt");
		if( !file.exists()) {
			System.out.println("Ese fichero no existe");
			System.exit(1);
		}
		System.out.println("Existe el fichero");
		System.out.println("Tamaño fichero " + file.length() + " bytes");
		System.out.println("Ultima modificacion " + file.lastModified());
		
		File directorio = new File("ficheros");
		if( !directorio.exists()) {
			System.out.println("Ese directorio no existe");
			System.exit(1);
		}
		System.out.println("Existe el directorio");
		System.out.println("Es directorio " + directorio.isDirectory());
		File[] ficheros = directorio.listFiles();
		System.out.println(Arrays.toString(ficheros));
	}

}
