package cl.curso.java.prueba_tres.kzambrano;

import java.util.Date;

/**
 * 
 * @author Kevin Zambrano
 *
 */
public class Viaje implements Comparable<Viaje> {

	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	
	
	/**
	 * 
	 */
	public Viaje() {
	}



	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}



	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}



	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}



	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}



	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}



	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}


	/**
	 * Metodo heradado de la interface
	 * comparable, para ordenar los viajes
	 * por fecha
	 */
	public int compareTo(Viaje arg0) {
		if(this.getFecha().getTime() > arg0.getFecha().getTime())
			return 1;
		if(this.getFecha().getTime() < arg0.getFecha().getTime())
			return -1;
		if(this.getFecha().getTime()==arg0.getFecha().getTime())
			return 0;
		return 0;
	}

	/**
	 * Metodo que imprime atributos de la clase
	 */
	public String toString()
	{
		return "\nViaje"
			+"\nFecha: "+this.getFecha()
			+"\nSaldo de Tarjeta: $"+this.getSaldoTarjeta()
			+"\nValor del viaje: $"+this.getValorViaje();
	}
}
