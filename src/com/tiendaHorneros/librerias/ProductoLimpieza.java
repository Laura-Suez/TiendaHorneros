package com.tiendaHorneros.librerias;

public class ProductoLimpieza extends Producto {
    private TipoAplicacion tipoAplicacion;

    
    
    

    // Constructor
	
	public ProductoLimpieza(String identificador, String descripcion, int cantidadEnStock, double precioPorUnidad,
			double costoPorUnidad, boolean disponibleParaVenta, double porcentajeDescuento,
			TipoAplicacion tipoAplicacion) {
		super(identificador, descripcion, cantidadEnStock, precioPorUnidad, costoPorUnidad, disponibleParaVenta,
				porcentajeDescuento);
		this.tipoAplicacion = tipoAplicacion;
	}


//getters and setters


	public TipoAplicacion getTipoAplicacion() {
		return tipoAplicacion;
	}





	public void setTipoAplicacion(TipoAplicacion tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}
 
    

}