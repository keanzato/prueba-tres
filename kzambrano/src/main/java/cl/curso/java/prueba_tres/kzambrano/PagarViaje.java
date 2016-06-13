package cl.curso.java.prueba_tres.kzambrano;

/**
 * 
 * @author Kevin Zambrano
 *
 */
public class PagarViaje extends Thread {

	private TarjetaBip tarjetaBip;
	private int valorViaje;
	
	/**
	 * 
	 */
	public PagarViaje() {
	}
	/**
	 * @param tarjetaBip
	 * @param valorViaje
	 */
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}
	/**
	 * @return the tarjetaBip
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}
	/**
	 * @param tarjetaBip the tarjetaBip to set
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
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
	 * metodo que hereda de la clase Thread
	 * que invoca el metodo pagarViaje de la clase
	 * TarjetaBip.
	 */
	@Override
	public void run() {
		
		tarjetaBip.pagarViaje(this.getValorViaje());
		
	}
}
