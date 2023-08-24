package com.tiendaHorneros.librerias;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto implements Comestible{
        private TipoEnvase tipoEnvase;
        private boolean importado;
        private LocalDate fechaVencimiento;
        private int calorias;
        
        public ProductoEnvasado(String identificador, String descripcion, int cantidadEnStock, double precioPorUnidad,
				double costoPorUnidad, boolean disponibleParaVenta, double porcentajeDescuento, TipoEnvase tipoEnvase,
				boolean importado,LocalDate fechaVencimiento,int calorias) {
			super(identificador, descripcion, cantidadEnStock, precioPorUnidad, costoPorUnidad, disponibleParaVenta,
					porcentajeDescuento);
			this.tipoEnvase = tipoEnvase;
			this.importado = importado;
			this.fechaVencimiento=fechaVencimiento;
			this.calorias=calorias;
		}


		public TipoEnvase getTipoEnvase() {
			return tipoEnvase;
		}


		public void setTipoEnvase(TipoEnvase tipoEnvase) {
			this.tipoEnvase = tipoEnvase;
		}


		public boolean isImportado() {
			return importado;
		}


		public void setImportado(boolean importado) {
			this.importado = importado;
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
        
        