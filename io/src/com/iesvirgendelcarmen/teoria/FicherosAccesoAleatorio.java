package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAccesoAleatorio {

	public static void main(String[] args) {
		try (RandomAccessFile inout = new RandomAccessFile("ficheros\\Binarios\\inout.dat", "rw");) {
			
			//posicionamos en la posicion 0
			inout.seek(0);
			//escribimos 200 numero de tipo double
			for (int i = 0; i < 200; i++) {
				inout.writeDouble(i);
			}
			System.out.printf("File size %d%n",inout.length());
			//accedemos a la primera posicion
			inout.seek(0);
			//leer el valor de la posicion indicada
			System.out.printf("Value of position %d: %.2f%n",0,inout.readDouble());
			System.out.printf("Actual position of pointer is : %d%n",inout.getFilePointer());
			System.out.printf("Value of position %d: %.2f%n",0,inout.readDouble());
			System.out.printf("Actual position of pointer is : %d%n",inout.getFilePointer());
			//ir al final del fichero
			inout.seek(inout.length());
			inout.writeInt(1000);
			System.out.printf("File size %d%n",inout.length());
			//nos posicionamos para leer el entero
			inout.seek(inout.length() - 4);
			System.out.printf("Valor del entero %d%n",inout.readInt() );
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e1) {
			System.out.println("Error IO");
			//e1.printStackTrace();
		}

	}

}
