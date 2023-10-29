package com.ejercicio2.marcas;

import java.time.LocalDate;

import com.ejercicio2.contracts.Marca;

public class Visa implements Marca{

	@Override
	public double calcularTasa() {
		LocalDate fecha = LocalDate.now();
		int anio = fecha.getYear() % 100;
		int mes = fecha.getMonthValue();
		
		return anio / mes;
	}
}
