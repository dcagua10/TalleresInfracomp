package infraCompTaller3;

public class semaforo 
{
	private int contador;

	public semaforo(int pContar)
	{
		contador = pContar;
	}

	public synchronized void P ( ) 
	{
		contador--;
		if ( contador < 0 )
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				
			}
		}
		
	}
	
	public synchronized void V()
	{
		contador++;
		if (contador <= 0)
		{
			notify();
		}
	}
}
