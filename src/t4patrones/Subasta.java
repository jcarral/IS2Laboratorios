
package t4patrones;

import java.util.LinkedList;
import java.util.List;

/**
 * La subasta representa un producto por el que se puede pujar.
 * 
 */
public class Subasta extends Subject{
	private final String producto;
	private Usuario propietario;
	private boolean abierta;
	private LinkedList<Puja> pujas;
		
	public Subasta(String producto, Usuario propietario) {
		if (producto == null || producto.equals(""))
			throw new IllegalArgumentException("El nombre del producto tiene que ser significativo");
		
		if (propietario == null)
			throw new IllegalArgumentException("El propietario no puede ser nulo");
					
		this.producto = producto;
		this.propietario = propietario;
		this.abierta = true;
		this.pujas = new LinkedList<Puja>();
		this.propietario.addSubasta(this);
	}

	public String getProducto() {
		return producto;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public ExtendedIterator<Puja> getPujas() {
		return new PujasIterator(pujas);
	}

	//Propiedad calculada
	public Puja getPujaMayor(){
		if (!pujas.isEmpty())
			return pujas.getLast();
		else 
			return null;
	}
	
	/** Este mtodo permite realizar una puja sobre la subasta. La informaci�n necesaria
	 *  para pujar es el usuario que realiza la puja y la cantidad por la que puja. 
	 *  La puja es aceptada si: 
	 *    a) la subasta est� abierta, 
	 *    b) el cr�dito del usuario que la realiza es suficiente para la cantidad por la que puja; 
	 *    c) el usuario no es propietario de la subasta y 
	 *    d) la cantidad es mayor que la cantidad de la puja mayor, si la hubiera. 
	 *  Por tanto, esta operaci�n finaliza indicando si la puja ha sido aceptada (retorna un valor booleano). 
	 *  Si la puja es aceptada, entonces se construye una puja y se almacena en la lista de pujas.
	 * 
	 * @param pujador Usuario que realiza la puja
	 * @param cantidad cantidad por la que se puja
	 * @return true si la puja se ha realizado y false en caso contrario
	 */
	public boolean pujar (Usuario pujador, double cantidad){
		if (pujador == null)
			throw new IllegalArgumentException("El usuario que hace la puja no puede ser nulo");
		
		if (cantidad < 1)
			throw new IllegalArgumentException("La cantidad tiene que ser positiva");
		
		if (isAbierta() &&
				pujador.getCredito() >= cantidad &&
				pujador != propietario &&
				(getPujaMayor() == null || (getPujaMayor() != null && getPujaMayor().getCantidad() < cantidad))){
			
			Puja puja = new Puja(pujador, cantidad);
			
			pujas.add(puja);
			toNotify();
			return true;
		}
		else
			return false;
	}
	
	/** Este m�todo permite pujar sin indicar la cantidad, es decir, s�lo se requiere indicar el usuario que la realiza. 
	 *  La cantidad ser� un euro m�s que la cantidad de la puja mayor. 
	 *  Si no hubiera puja mayor, la cantidad ser�a de un euro.
	 *
	 * @param pujador usuario que realiza la puja
	 * @return true si se ha realizado la puja y false en caso contrario
	 */
	public boolean pujar(Usuario pujador){
		int cantidad = 1;
		
		if (getPujaMayor() != null)
			cantidad += getPujaMayor().getCantidad();
		
		return pujar (pujador, cantidad);
	}
	
	/** Este m�todo cierra la subasta (la ejecuta) realizando las transferencias de cr�dito entre 
	 *  el usuario que ha ganado la subasta (puja mayor) y el usuario propietario. Es posible ejecutar 
	 *  una subasta si se ha realizado alguna puja y la subasta est� abierta. En tal caso, la ejecuci�n 
	 *  de una subasta consiste en decrementar el cr�dito del usuario que ha realizado la puja mayor e 
	 *  incrementar el cr�dito del propietario de la subasta por la cantidad de la puja mayor. 
	 *  Una vez ejecutada, la subasta quedar� cerrada. El m�todo finaliza informando si la subasta 
	 *  ha podido ejecutarse o no (retorna un valor booleano).
	 *  
	 * @return true si la subasta ha podido ejecutarse y false en caso contrario
	 */
	public boolean ejecutar(){
		if (isAbierta() && getPujaMayor() != null){
			
			Usuario ganador = getPujaMayor().getPujador();
			
			double cantidad = getPujaMayor().getCantidad();
			
			propietario.incrementarCredito(cantidad);
			
			ganador.decrementarCredito(cantidad);
			
			abierta = false;
			
			return true;
		
		} else
			return false;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [producto=" + producto
									+ ", propietario=" + propietario.getNombre() 
									+ ", abierta=" + abierta
									+ ", pujas=" + pujas.size() 
									+ "]";
	}
	
	

}
