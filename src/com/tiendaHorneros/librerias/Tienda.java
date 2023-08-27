package com.tiendaHorneros.librerias;
import java.util.*;
import java.util.HashMap;
import java.util.Map;



public class Tienda {
    private String nombre;
    private int maxProductosEnStock;
    private double saldoEnCaja;
    private Map<String, Producto> productosEnStock;
    // El siguiente atributo podria calcularse a partir de productosEnStock,
    // pero para evitar tener que calcularlo en cada compra, lo llevaremos aca
    private int cantidadProductosEnStock; 
    
    
	public Tienda(String nombre, int maxProductosEnStock, double saldoEnCaja) {
		this.nombre = nombre;
		this.maxProductosEnStock = maxProductosEnStock;
		this.saldoEnCaja = saldoEnCaja;
		this.productosEnStock = new HashMap<>();
		this.cantidadProductosEnStock = 0;
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


	private void setCantidadProductosEnStock(int cantidadProductosEnStock) {
		this.cantidadProductosEnStock = cantidadProductosEnStock;
	}


	public void comprarProducto(Producto producto, int cantidadAComprar) {
		double importeTotalAPagar = producto.getCostoPorUnidad() * cantidadAComprar;
		
		if(importeTotalAPagar > this.saldoEnCaja) {
			System.out.println("El producto no puede ser agregado por saldo insuficiente.");
			return;
		}
		
		if(this.cantidadProductosEnStock + cantidadAComprar > this.maxProductosEnStock) {
			// Para simplificar, rechazamos todas las unidades del producto si al sumarlas se pasa del total.
			System.out.println("El producto no puede ser agregado por insuficiencia de espacio de stock.");
			return;
		}
		
		
		// Actualizamos el saldo en caja
		double nuevoSaldoEnCaja = this.saldoEnCaja - importeTotalAPagar;
		this.setSaldoEnCaja(nuevoSaldoEnCaja);
		
		// Actualizamos la cantidad total de productos en stock de la tienda
		int nuevaCantidadProductosEnStock = this.cantidadProductosEnStock + cantidadAComprar;
		this.setCantidadProductosEnStock(nuevaCantidadProductosEnStock);
		
		producto.setDisponibleParaVenta(true);
		producto.setCantidadEnStock(cantidadAComprar);
		
        productosEnStock.put(producto.getIdentificador(), producto);
    }

	public void venderProducto(List<Producto> productos, List<Integer> cantidadesVendidas) {
		if (productos.size() > 3) {
			System.out.println("No se puede vender mas de 3 productos distintos.");
			return;
		}
		
		cantidadesVendidas.forEach(cantidadVendida -> {
			if (cantidadVendida > 10) {
				System.out.println("No se puede vender mas de 10 productos distintos.");
				return;
			}
		});
 	}

}