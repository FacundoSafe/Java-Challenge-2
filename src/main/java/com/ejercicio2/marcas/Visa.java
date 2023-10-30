package com.ejercicio2.marcas;

import java.time.LocalDate;


public class Visa extends Marca{

	@Override
	public double calcularTasa() {
		LocalDate fecha = LocalDate.now();
		int anio = fecha.getYear() % 100;
		int mes = fecha.getMonthValue();
		
		return anio / mes;
	}
}
