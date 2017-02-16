package infraCompTaller1;

public class ClaseT extends Thread
{

	private static int [][] M; //La matriz que se desea sumar
	private static int total = 0;

	private int id;
	private int max;
	public boolean termin�;

	private static void crearMatriz ( int n ) 
	{
		M = new int [n][n];
		int m = 99;
		for ( int i = 0; i < n; i++ ) 
		{
			for ( int j = 0; j < n; j++ ) 
			{
				M[i][j] = m;
				m--;
			}
		}
	}

	public ClaseT(int i)
	{
		id=i;
		max=0;
		termin�=false;
	}

	public static void main(String[] args) 
	{
		int nThreads = 10; //N�mero de threads; un valor cualquiera.
		ClaseT [] t = new ClaseT[nThreads]; //Vector para los threads
		crearMatriz( nThreads ); //Inicializar la matriz

		//A continuaci�n, escribir c�digo para crear los threads
		for ( int i = 0; i < nThreads; i++)
		{
			t[i]= new ClaseT( i );
			t[i].start();
		}
		//A continuaci�n, escribir c�digo para esperar que los threads terminen
		//y recoger los resultados parciales
		int terminaron = 0;
		while(terminaron!=nThreads)
		{
			terminaron = 0;
			total = 0;
			for (int j = 0; j < nThreads; j++) 
			{
				if(t[j].termin�){
					if(total < t[j].max){
						total = t[j].max;
					}
					terminaron++;
				}
			}
		}
		System.out.println( total );
	}

	public void run ()
	{
		int nElementos = M[id].length;

		for ( int j = 0; j < nElementos; j++) 
		{
			if(M[id][j] > max) max = M[id][j];
		}
		// Se necesita sincronizaci�n al momento de verificar que ya todos los threads terminaron de sumar
		termin�=true;
	}

}