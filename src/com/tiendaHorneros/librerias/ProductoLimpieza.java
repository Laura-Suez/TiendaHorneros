package com.tiendaHorneros.librerias;

public class ProductoLimpieza extends Producto {
    private TipoAplicacion tipoAplicacion;

    
    
    

    // Constructor
	
	public ProductoLimpieza(String identificador, String descripcion, double precioPorUnidad,
			double costoPorUnidad,TipoAplicacion tipoAplicacion) {
			super(identificador, descripcion, precioPorUnidad, costoPorUnidad);
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