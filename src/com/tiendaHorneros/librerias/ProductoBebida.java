package com.tiendaHorneros.librerias;

import java.time.LocalDate;

public class ProductoBebida extends Producto implements Comestible{
    private boolean esAlcoholica;
    private double graduacionAlcoholica;
    private LocalDate fechaVencimiento;
    private int calorias;
    	
    public ProductoBebida(String identificador, String descripcion, double precioPorUnidad, double costoPorUnidad,
    		boolean esAlcoholica, double graduacionAlcoholica,LocalDate fechaVencimiento,int calorias) {
		super(identificador, descripcion, precioPorUnidad, costoPorUnidad);
		this.esAlcoholica = esAlcoholica;
		this.graduacionAlcoholica = graduacionAlcoholica;
		this.fechaVencimiento=fechaVencimiento;
		this.calorias=calorias;
	}
	
    public boolean isEsAlcoholica() {
		return esAlcoholica;
	}
	public void setEsAlcoholica(boolean esAlcoholica) {
		this.esAlcoholica = esAlcoholica;
	}
	public double getGraduacionAlcoholica() {
		return graduacionAlcoholica;
	}
	public void setGraduacionAlcoholica(double graduacionAlcoholica) {
		this.graduacionAlcoholica = graduacionAlcoholica;
	}

	@Override
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	@Override
	public int getCalorias() {
		return calorias;
	}
    
    
    
    
    

	

}
    
    
    
    
    
 

		
	

	
	    
	    




