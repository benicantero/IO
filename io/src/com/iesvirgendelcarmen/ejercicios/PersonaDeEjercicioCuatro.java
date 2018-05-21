package com.iesvirgendelcarmen.ejercicios;

import java.io.Serializable;

//Escibe una clase denominada Persona que tenga las siguientes características:
//Atributos: nombre, apellidos, edad y dirección.
//Constructor que inicialice dichos atributos.
//Los correspondientes getters y setters
//La clase debe ser serializable.
//Crea un programa que cree cinco objetos del tipo Persona y que los guarde en un fichero binario denominado ejercicio4.dat.
//Posteriormente crea otro programa que lea dichos objetos y muestre por pantalla cada uno de los objetos.


public class PersonaDeEjercicioCuatro implements Serializable {

	private static final long serialVersionUID = 1l;// para que sea serializable - lo hace en automatico la creacion de la clase
	
	private String nombre;
	private String apellidos;
	private int edad; // deberiamos utilizar el localdate
	private String direccion;
	
	public PersonaDeEjercicioCuatro(String nombre, String apellidos, int edad, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	@Override
	public String toString() {
		return "PersonaDeEjercicioCuatro [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", direccion=" + direccion + "]";
	}

	

}
