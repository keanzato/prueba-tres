package cl.curso.java.prueba_tres.kzambrano;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Kevin Zambrano
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	
	/**
	 * 
	 */
	public TarjetaBip() {
	}
	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}
	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}
	/**
	 * @param viajes the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	/**
	 * meotodo sumara el monto recibido por parámetro al saldo de la tarjeta bip.
	 */
	public void recargar(int monto)
	{
		this.setSaldo(this.getSaldo()+monto);
	}
	
	/**
	 * Metodo descontara del saldo de la 
	 * tarjeta según el valor del viaje
	 *  recibido como parámetro.
	 */
	public synchronized void pagarViaje(int valorViaje)
	{
		if(valorViaje<=this.getSaldo())
		{
			this.setSaldo(this.getSaldo()-valorViaje);
			
			Date date = new Date();
			Viaje viaje = new Viaje(date, this.getSaldo(), valorViaje);
			this.getViajes().add(viaje);
		}
		else
		{
			throw new SinSaldoException("No tienes saldo suficiente para viajar.");
		}
	}
	
	/**
	 * Metodo que utiliza el metodo de ordenamiento sort
	 * y luego recorre el arreglo para imprimir sus atributos
	 */
	public void imprimir()
	{
		Collections.sort(this.getViajes());
		for (Viaje item : this.getViajes()) {
			
			System.out.println(item.toString());
		}
	}
}
