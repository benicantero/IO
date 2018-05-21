package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjercicioDos {
	
	//Escribe un programa que cree un fichero llamado ejercicio2.dat y añade
	//100 números de tipo float de forma aleatoria. Usa clases I/O relacionadas con archivos binarios (OutputStream).
	//Posteriormente crea otro programa que lea dichos 100 números y que muestre el valor de su suma.
	
	public static void main(String[] args) throws IOException {
		final int TAMANNO = 100;
		try(DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("ficheros\\ejercicio2.dat")));)
		{
			float numero = 0.0f;
			for (int i = 0; i < TAMANNO; i++) {
				numero = (float) (Math.random()*1000);
				out.writeFloat(numero);
			}
		}catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}catch (IOException e1) {
			System.out.println("Problema IO");
		}
		
		//leer fichero binario y sumar datos
		
		File inFile = new File("ficheros\\ejercicio2.dat");
		float suma = 0;
		try(DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream(inFile)));)
		{
			int tamanno = (int) inFile.length();
			for (int i = 0; i < tamanno/4  ; i++) { // tamaño se divide entre cuatro porque el numero de biytes son 4
				suma += in.readFloat();
			}
		}catch (FileNotFoundException e3) {
			System.out.println("No existe el fichero");
		}catch (IOException e4) {
			System.out.println("Problema IO");
		}
		System.out.println(suma);		
		System.out.println("Fin de programa");
	}	
		
}


