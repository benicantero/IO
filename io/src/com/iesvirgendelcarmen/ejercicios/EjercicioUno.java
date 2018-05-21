package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioUno {
	//Escribe un programa que cree un fichero llamado ejercicio1.txt y añade 100
	//números enteros de forma aleatoria. Usa clases I/O relacionadas con archivos
	//de texto (OutputStreamReader)
	
	public static void main(String[] args) {
		
		//resolucion de Manolo
		
		try (PrintWriter out = new PrintWriter("ficheros\\ejercicio1.txt");){
			for (int i = 0; i < 100; i++) {
				int numeroAleatorio = (int)(Math.random()*100); 
				out.print(numeroAleatorio);
				if(i != 99)
					out.print('-'); // añade este caracter siempre mientras que i sea distinto de 99
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");;
		}
		
		//sumar los numeros generados
		
		
		try(Scanner sc = new Scanner (new File("ficheros\\ejercicio1.txt")).useDelimiter("-");) {
			int suma = 0;
			while(sc.hasNextInt()) {
				suma+=sc.nextInt();
			}
			System.out.println(suma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Fin de programa");
		
		
				
		/*resolucion mia
		
		try (PrintStream output = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("ficheros\\ejercicio1.txt")));){
			for (int j = 0; j < 100; j++) {
				output.print((int)(Math.random()*100));
				output.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}
}