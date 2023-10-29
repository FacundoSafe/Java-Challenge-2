
package com.ejercicio2.marcas;

import java.time.LocalDate;

import com.ejercicio2.contracts.Marca;

public class Nara implements Marca{

	static private final double PORCENTAJE = 0.5;
	
	@Override
	public double calcularTasa() {
		LocalDate fecha = LocalDate.now();
		int dia = fecha.getDayOfMonth();
		
		return dia * PORCENTAJE;
	}
}
