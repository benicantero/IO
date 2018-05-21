package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//programa que escribe texto formateado en fichero de texto usando printstream
//o en printwriter

import java.util.ArrayList;
import java.util.List;

public class CrearListaDinamica {

	public static List<Float> listaFloat = new ArrayList<Float>();
	
	public static void main(String[] args) {
		//creamos lista dinámica de floats
		generarFloat(1000);
		//for (int i = 0; i < 50; i++) {
			//System.out.println(listaFloat.get(i));
		//}
		imprimeLista(listaFloat);
	}

	public static void generarFloat(int multiplicador) {
		for (int i = 0; i < 50; i++) {
		listaFloat.add((float)Math.random()*multiplicador);
		}

	}
	
	public static void imprimeLista(List<Float> listaFloat) {
		try (PrintStream out = new PrintStream("ficheros\\carpeta\\salida.txt");){
			for (int i = 0; i < listaFloat.size(); i++) {
				if (i> 0 && i % 5 == 0 ) {
					System.out.println();
					out.println();
				}
				System.out.printf("%10.2f",listaFloat.get(i));
				out.printf("%10.2f",listaFloat.get(i));
			}
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

