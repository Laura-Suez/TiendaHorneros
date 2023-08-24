package com.tiendaHorneros.librerias;

import java.util.*;

public class Tienda {
    private String nombre;
    private int maxProductosEnStock;
    private double saldoEnCaja;
    private Map<String, List<Producto>> productosEnStock;
    
    
	public Tienda(String nombre, int maxProductosEnStock, double saldoEnCaja,
			Map<String, List<Producto>> productosEnStock) {
		this.nombre = nombre;
		this.maxProductosEnStock = maxProductosEnStock;
		this.saldoEnCaja = saldoEnCaja;
		this.productosEnStock = productosEnStock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMaxProductosEnStock() {
		return maxProductosEnStock;
	}


	public void setMaxProductosEnStock(int maxProductosEnStock) {
		this.maxProductosEnStock = maxProductosEnStock;
	}


	public double getSaldoEnCaja() {
		return saldoEnCaja;
	}


	public void setSaldoEnCaja(double saldoEnCaja) {
		this.saldoEnCaja = saldoEnCaja;
	}


	public Map<String, List<Producto>> getProductosEnStock() {
		return productosEnStock;
	}


	public void setProductosEnStock(Map<String, List<Producto>> productosEnStock) {
		this.productosEnStock = productosEnStock;
	}

  





}