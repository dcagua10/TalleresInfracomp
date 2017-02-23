package infraCompTaller4;

/**
 * Clase que define un thread
 * @author d.cagua10
 *
 */
public class T extends Thread
{
	public Canal canal;
	
	public T (Canal pCanal)
	{
		canal = pCanal;
	}
	
	public T (int a, Canal pCanal)
	{
		canal = pCanal;
	}
	
	public static void main ()
	{
		
	}

}
