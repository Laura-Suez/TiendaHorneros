package com.tiendaHorneros.librerias;

//Defino clase Producto
abstract class Producto implements Descuento {
    private String identificador;
    private String descripcion;
    private int cantidadEnStock;
    private double precioPorUnidad;
    private double costoPorUnidad;
    private boolean disponibleParaVenta;
    private double porcentajeDescuento;
	
    // Constructor
   	public Producto(
   		String identificador,
   		String descripcion,
   		double precioPorUnidad,
   		double costoPorUnidad
   	) {
   		this.identificador = identificador;
   		this.descripcion = descripcion;
   		this.precioPorUnidad = precioPorUnidad;
   		this.costoPorUnidad = costoPorUnidad;
   	
   		// Entiendo que por defecto los siguientes atributos se setearian con los mismos valores que declaro,
   		// pero de todas formas los inicializo asi
   		this.disponibleParaVenta = false;
   		this.cantidadEnStock = 0;
   		this.porcentajeDescuento = 0.0;
   	}
   	
    
    //Getter y Setter
    public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidadEnStock() {
		return cantidadEnStock;
	}
	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	public double getPrecioPorUnidad() {
		return precioPorUnidad;
	}
	public void setPrecioPorUnidad(double precioPorUnidad) {
		this.precioPorUnidad = precioPorUnidad;
	}
	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}
	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}
	public boolean isDisponibleParaVenta() {
		return disponibleParaVenta;
	}
	public void setDisponibleParaVenta(boolean disponibleParaVenta) {
		this.disponibleParaVenta = disponibleParaVenta;
	}
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
    
	//Metodos descuento//
	 public double getPrecioVentaConDescuento() {
	 	double precioFinal=precioPorUnidad-(precioPorUnidad*porcentajeDescuento);
	 	return precioFinal;
	 }
	
	
	
	
	
}

