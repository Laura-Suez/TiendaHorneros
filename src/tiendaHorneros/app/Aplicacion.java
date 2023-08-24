package tiendaHorneros.app;

import com.tiendaHorneros.librerias.ProductoBebida;

public class Aplicacion {

	public static void main(String[] args) {
		ProductoBebida fernet = new ProductoBebida(
				"id_fernet",
				"Una bebida cordobesa no importada",
				10, 1000,800,true, true, 17.6, false);
		
		ProductoBebida gancia = new ProductoBebida();
		
		System.out.println("Grad alcoholica del fernet: " + fernet.getGraduacionAlcoholica());

	}

}
