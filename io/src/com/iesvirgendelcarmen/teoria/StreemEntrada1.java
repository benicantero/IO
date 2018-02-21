package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreemEntrada1 {

	public static void main(String[] args) {
		File inFile = new File("ficheros\\tres");
		if (!inFile.exists() || inFile.length() == 0) {
			System.out.println("El fichero no existe o su tamaño es 0 bytes");
			return; // este return se sale del metodo.
		}
		System.out.println("El fichero existe con un tamaño de " + inFile.length() + " bytes.");
		try {
			FileInputStream fileInputStream = new FileInputStream(inFile);
			int byteLeido = fileInputStream.read();
			System.out.println(byteLeido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
