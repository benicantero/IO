package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamSalida1 {

	public static void main(String[] args) {
		//nombre del fichero de salida
		String nameFile = "ficheros\\fichero1.txt";
		//creamos el flujo (stream) de salida
		try (FileOutputStream outputStream = new FileOutputStream(nameFile);){
			// escribimos hola codigos unicode 104 , 111, 108, 97
			String nombre = " Francisco León";
			byte[] bytesDeNombre = nombre.getBytes();
			outputStream.write(104); //h
			outputStream.write(111); //o
			outputStream.write(108); //l
			outputStream.write(97); //a
			//outputStream.write(10); //salto de linea
			outputStream.write(bytesDeNombre);
			outputStream.flush();//cierra la lectura, fuerza el volcado a escritura en disco
			// en el fichero se escribe hola Francisco Javier
		} catch (FileNotFoundException e) {
			System.out.println("Problemas con el fichero " + nameFile);

		} catch (IOException e1) {
			System.out.println("Error I/O");
		}
		System.out.println("fin de programa");
	}
}
