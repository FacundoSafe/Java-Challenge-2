package com.ejercicio2.models;

import java.math.BigInteger;
import java.time.LocalDate;

import com.ejercicio2.marcas.Marca;

public class Tarjeta {

	private Marca marca;
	private BigInteger numeroTarjeta;
	private CardHolder cardHolder;
	private LocalDate fechaVencimiento;
	
	public Tarjeta(Marca marca, BigInteger numeroTarjeta, CardHolder cardHolder, LocalDate fechaVencimiento) {
		this.marca = marca;
		this.numeroTarjeta = numeroTarjeta;
		this.cardHolder = cardHolder;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public boolean esValida() {
		LocalDate ahora = LocalDate.now();
		return !this.fechaVencimiento.isBefore(ahora);
	}
	
	public double obtenerTasaOperacion(double importe) throws Exception {
		double tasaTarjeta = this.marca.calcularTasa();
		
		if(!esValida()) {
			throw new Exception("La tarjeta no es válida");
		}
		
		return (tasaTarjeta * importe) / 100;
	}
	
	public BigInteger getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(BigInteger numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public CardHolder getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(CardHolder cardHolder) {
		this.cardHolder = cardHolder;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + " | Numero de tarjeta: " + this.numeroTarjeta + " | Titular: " + this.cardHolder.toString() + " | Fecha de Vencimiento: " + this.fechaVencimiento; 
	}
}
