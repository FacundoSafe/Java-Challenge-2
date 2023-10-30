package com.ejercicio2.models;

public class CardHolder {

	private String nombre;
	private String apellido;
	
	public CardHolder(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "CardHolder [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
