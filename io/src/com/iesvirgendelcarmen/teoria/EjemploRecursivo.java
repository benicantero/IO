package com.iesvirgendelcarmen.teoria;

public class EjemploRecursivo {

	public static void main(String[] args) {
		int numero = 5;
		System.out.println("El factorial de " + numero + " es " + calculaFactorialIterativo(numero));
		System.out.println("El factorial de " + numero + " es " + calculaFactorialRecursivo(numero));
		
	}	
	public static long calculaFactorialIterativo(int numero) {
		long factorial = 1;
		for(int i = numero;i > 1 ; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static long calculaFactorialRecursivo(int numero) {
		if(numero == 0) return 1;
		else return numero * calculaFactorialRecursivo(numero - 1);
	}
}
