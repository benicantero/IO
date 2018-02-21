package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FilenameFilter;

public class FiltrarArchivo {

	public static void main(String[] args) {
		File directorioraiz = new File ("ficheros");
		if (directorioraiz.exists()) {
			String[] nombreFicherosTxt = directorioraiz.list(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".txt");
				}
			});
		for (String ficheroTxt : nombreFicherosTxt) {
			System.out.println(ficheroTxt + " " + ficheroTxt.length());
		}
		}
	}

}
