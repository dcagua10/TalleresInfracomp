package infraCompTaller4;

/**
 * Canal de comunicacion de los threads
 * @author d.cagua10
 *
 */
public class Canal 
{
	// Mensajes como numeros enteros
	public int mensaje;
	
	// Boolean que define si esta ocupado o no
	public boolean ocupado;
	
	public Canal(int pMen, boolean pOc)
	{
		mensaje = pMen;
		ocupado = false;
	}
	
	// Metodo que recibe el mensaje
	public synchronized int recibir()
	{
		return mensaje;
	}
	
	//Metodo que envia el mensaje
	public synchronized void enviar()
	{
		
	}

}
