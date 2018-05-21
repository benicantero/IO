package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Realiza un programa que divida un fichero en distintos trozos mas pequeños.
//La sintáxis de ejecución sería: java Leer ficheroEntrada numeroTrozos
//donde Leer es es nombre del programa ejecutable en java, ficheroEntrada es el
//fichero a dividir en trozos y numeroTrozos es un numero que indica en el numero
//de partes en que se va a dividir el fichero. Usando Scanner solicita el nombre
//de los ficheros de salida.

public class Ejercicio5 {

	public static void main(String[] args) {
		// realizamos las comprobaciones pertinentes
		if(args.length < 2) {
			System.out.println("Faltan argumentos");
			System.exit(1);// el codigo 0 no se utiliza porque se utiliza para indicar que el prog ha terminado correctamente
		}
		File infile = new File(args[0]);
		if (!infile.exists()){
			System.out.println("No existe el fichero: "+ infile);
			System.exit(2);
		}
		if(!args[1].matches("\\d+")){
			System.out.println("Debes introducir un numero");
			System.exit(3);
		}


		int numeroTrozos = Integer.parseInt(args[1]); // convierto el segundo argumento a entero
		int tamannoTrozo = (int) 
				infile.length()/numeroTrozos;
		//leemos el nombre los ficheros de los trozos
		Scanner sc = new Scanner(System.in);
		File[] ficherosSalida = new File[numeroTrozos];
		System.out.println("Introduce el nombre de los ficheros");
		for (int i = 0; i < numeroTrozos; i++) {
			ficherosSalida[i]= new File(sc.nextLine());
			System.out.println(Arrays.toString(ficherosSalida));

		}




		for (int i = 0; i < numeroTrozos; i++) {
			//leer fichero de entrada
			try (BufferedInputStream in = new BufferedInputStream(
					new FileInputStream(infile));BufferedOutputStream out = new BufferedOutputStream(
							new FileOutputStream(ficherosSalida[i])))
			{
				int byteLeido ;
				while ((byteLeido = in.read()) != -1);
				out.write(byteLeido);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
