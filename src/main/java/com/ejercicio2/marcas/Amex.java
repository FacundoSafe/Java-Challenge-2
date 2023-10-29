package com.ejercicio2.marcas;

import java.time.LocalDate;

import com.ejercicio2.contracts.Marca;

public class Amex implements Marca{
	
	static private final double PORCENTAJE = 0.1;

	public double calcularTasa() {
		LocalDate fecha = LocalDate.now();
		int mes = fecha.getMonthValue();
		
		return mes * PORCENTAJE;
	}

}
