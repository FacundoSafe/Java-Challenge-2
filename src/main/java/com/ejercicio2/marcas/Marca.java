package com.ejercicio2.marcas;

public abstract class Marca {

	abstract public double calcularTasa();

	@Override
	public String toString() {
		return "Marca [" + this.getClass().getSimpleName() + "]";
	}
}
