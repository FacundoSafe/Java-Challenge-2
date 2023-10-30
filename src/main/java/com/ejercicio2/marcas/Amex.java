package com.ejercicio2.marcas;

import java.time.LocalDate;


public class Amex extends Marca{
	
	static private final double PORCENTAJE = 0.1;

	public double calcularTasa() {
		LocalDate fecha = LocalDate.now();
		int mes = fecha.getMonthValue();
		
		return mes * PORCENTAJE;
	}

}
