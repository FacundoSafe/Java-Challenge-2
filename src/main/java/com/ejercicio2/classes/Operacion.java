package com.ejercicio2.classes;

import com.ejercicio2.marcas.*;
import com.ejercicio2.models.OperacionTasaResponse;

public class Operacion {

	static private final int IMPORTE_MAX = 1000;
	
	public static OperacionTasaResponse calcularTasaOperacion(String nombreMarca, double importe) throws Exception {
		OperacionTasaResponse response = new OperacionTasaResponse();

		if(validarOperacion(importe)) {
			response.setImporte(importe);
			response.setTasaOperacion(obtenerTasaOperacion(nombreMarca, importe));
			response.setMarca(nombreMarca);
		}
		
		return response;
	}
	
	static public boolean validarOperacion(double importe) throws Exception {
		boolean isValida = importe < IMPORTE_MAX;
		
		if(!isValida) {
			throw new Exception("Importe inválido.");
		}
		
		return isValida;
	}
	
	static public double obtenerTasaOperacion(String marca, double importe) throws Exception {
		double tasaOperacion = 0;
		boolean isValida = validarOperacion(importe);
		
		if(isValida) {
			switch(marca) {
			case "AMEX":
				tasaOperacion = new Amex().calcularTasa();
				break;
			case "NARA":
				tasaOperacion = new Nara().calcularTasa();
				break;
			case "VISA": 
				tasaOperacion = new Visa().calcularTasa();
				break;
			}	
		}
	
		return (tasaOperacion * importe) / 100;
	}
}
