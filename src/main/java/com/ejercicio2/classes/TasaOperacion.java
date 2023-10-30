package com.ejercicio2.classes;

import com.ejercicio2.marcas.Amex;
import com.ejercicio2.marcas.Marca;
import com.ejercicio2.marcas.Nara;
import com.ejercicio2.marcas.Visa;
import com.ejercicio2.models.OperacionTasaResponse;

public class TasaOperacion {

	static private final int MAX_OPERACION = 1000;
	
	public static OperacionTasaResponse calcularTasaOperacion(String nombreMarca, double importe) throws Exception {
		OperacionTasaResponse response = new OperacionTasaResponse();
		Marca marca = getMarca(nombreMarca);		
		response.setMarca(nombreMarca);

		if(importe >= MAX_OPERACION) {
			throw new Exception("Importe incorrecto.");
		}
		response.setImporte(importe);
		response.setTasaOperacion((marca.calcularTasa() * importe) / 100);
		
		return response;
	}
	
	private static Marca getMarca(String nombreMarca) throws Exception {
		Marca marca;
		
		switch(nombreMarca) {
		case "AMEX":
			marca = new Amex();
			break;
		case "NARA":
			marca = new Nara();
			break;
		case "VISA": 
			marca = new Visa();
			break;
		default:
			throw new Exception("La marca no existe.");
		}	
		
		return marca;
	}
}
