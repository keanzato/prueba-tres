package cl.curso.java.prueba_tres.kzambrano;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calendar cal1 = new GregorianCalendar(2016,4, 19);
    	Calendar cal2 = new GregorianCalendar(2016,2, 20);
    	Calendar cal3 = new GregorianCalendar(2016,1, 14);
    	
    	Viaje viaje1 = new Viaje(cal1.getTime(), 2000,740);
    	Viaje viaje2 = new Viaje(cal2.getTime(), 5000, 210);
    	Viaje viaje3 = new Viaje(cal3.getTime(), 7000, 1000);
    	
    	ArrayList<Viaje> viajes = new ArrayList<Viaje>();
    	viajes.add(viaje3);
    	viajes.add(viaje2);
    	viajes.add(viaje1);
    	
    	TarjetaBip tarjeta = new TarjetaBip(77754, viaje1.getSaldoTarjeta(), viajes);
    	
    	PagarViaje pagar = new PagarViaje(tarjeta, viaje1.getValorViaje());
    	
    	pagar.start();
    	try {
			pagar.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	tarjeta.imprimir();
    }
}
