package com.ejercicio2.demo;

import java.math.BigInteger;
import java.time.LocalDate;

import com.ejercicio2.classes.Operacion;
import com.ejercicio2.models.*;
import com.ejercicio2.marcas.*;

public class Main {
	
	static final int IMPORTE_MAX = 1000;

	public static void main(String[] args) {
		
		Tarjeta tarjeta1 = new Tarjeta(new Visa(), new BigInteger("1111222233334444"), new CardHolder("Facundo", "Safe"), LocalDate.now());
		Tarjeta tarjeta2 = new Tarjeta(new Nara(), new BigInteger("1111222233334444"), new CardHolder("Facundo", "Safe"), LocalDate.now());
		
		//el override del toString devuelve la información de la tarjeta
		System.out.println(tarjeta1);
		//informar si la operación es válida
		try {
			System.out.println(Operacion.validarOperacion(900));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//Tarjeta sabe si es válida o no
		System.out.println(tarjeta1.esValida());
		//acá comparo el tipo de Marca (asumí eso como "distinta"), si no comparo todas las propiedades
		System.out.println(tarjeta1.getMarca().equals(tarjeta2.getMarca()));
		
		try {
			System.out.println(Operacion.obtenerTasaOperacion("AMEX", 1000));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Operacion.obtenerTasaOperacion("AMEX", 900));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
