package cl.curso.java.prueba_tres.kzambrano;

/**
 * 
 * @author Kevin Zambrano
 *
 */
public class SinSaldoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2357976207376458908L;

	/**
	 * 
	 * @param message
	 */
	public SinSaldoException(String message)
	{
		super(message);
	}
}
