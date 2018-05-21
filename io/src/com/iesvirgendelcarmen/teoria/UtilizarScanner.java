package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UtilizarScanner {
	
	public static void main(String[] args) {
		
		File f = new File("ficheros\\ficheroQuijote.txt");
		int numeroLineas = 0;
		int numeroPalabras = 0;
		
		try(Scanner sc = new Scanner(f);
				Scanner sc2 = new Scanner(f)) {
					
			while(sc.hasNextLine()){
				numeroLineas++;
				sc.nextLine();
			}
			
			while(sc2.hasNext()) {
				numeroPalabras++;
				sc2.next();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		}
		System.out.printf("Hay %d palabras y %d lineas", numeroPalabras, numeroLineas);
	}

}
