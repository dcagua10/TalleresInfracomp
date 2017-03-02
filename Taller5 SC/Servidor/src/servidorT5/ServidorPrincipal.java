package servidorT5;

import java.io.IOException;
import java.net.ServerSocket;

public class ServidorPrincipal 
{
	public static int PUERTO = 8080;

	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		boolean continuar = true;
		// defina variable para contar e identificar los threads
		int contador = 0;
		try
		{
			ss = new ServerSocket(PUERTO);
		} 
		catch (IOException e) 
		{
			System.err.println("No pudo crear socket en el puerto:" + PUERTO);
			System.exit(-1);
		}
		while (continuar) 
		{
			new ThreadServidor(ss.accept(),contador).start();
			// incremente identificador de thread
		}
		ss.close();
	}


}
