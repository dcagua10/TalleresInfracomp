package infraCompTaller3;

public class Lector extends Thread
{
	private int nLectores;
	private int contador;
	private semaforo Sem;
	
	public Lector (int pLectores, int nContador)
	{
		nLectores = pLectores;
		contador = nContador;
	}
	
	public synchronized void entrarLeer()
	{
		Sem.P();
	}

}
