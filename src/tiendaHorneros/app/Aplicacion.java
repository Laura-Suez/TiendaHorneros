package tiendaHorneros.app;
import java.time.LocalDate;
import com.tiendaHorneros.librerias.*;

public class Aplicacion {

	public static void main(String[] args) {
		ProductoBebida fernet;
		fernet = new ProductoBebida("AA45","elisir cordobe", 5000.0, 2000.0, true, 30.0,LocalDate.now(),50);
		
		ProductoLimpieza guantes; 
		guantes= new ProductoLimpieza("BB","cuidan tus manitas",1000,200,TipoAplicacion.MULTIUSO);
		
		Tienda tienda;
		tienda= new Tienda("tiendaHorneros",100,80000);
		
				
		tienda.comprarProducto(fernet, 2);
		tienda.comprarProducto(guantes, 3);
		
		System.out.println("Grad alcoholica del fernet: " + fernet.getGraduacionAlcoholica());

	}

}
