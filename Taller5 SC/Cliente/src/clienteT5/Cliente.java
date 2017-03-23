package clienteT5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente 
{
	public final static String ip = "177.24.42.37";
	public final static String host = "localhos t";
	public final static int puerto = 8080;

	public static void main(String[] args)
	{
	boolean ejecutar = true;
	Socket socket = null;
	PrintWriter escritor = null;
	BufferedReader lector = null;
	{
	
		try 
		{
			socket = new Socket(ip, puerto);
			escritor = new PrintWriter(socket.getOutputStream(), true);
			lector = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} 
		catch (Exception e) 
		{
			System.err.println("Exception: " + e.getMessage());
			System.exit(1);
		}
		BufferedReader stdIn = new BufferedReader(
				new InputStreamReader(System.in));
		String fromServer;
		String fromUser = null;
		while (ejecutar) 
		{
			System.out.print("Escriba el mensaje para enviar:");
			try {
				fromUser = stdIn.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (fromUser != null && !fromUser.equals("-1")) {
				System.out.println("Cliente: " + fromUser);
				if (fromUser.equalsIgnoreCase("OK"))
					ejecutar = false;
				escritor.println(fromUser);
			}
			try {
				if ((fromServer = lector.readLine()) != null) {
					System.out.println("Servidor: " + fromServer);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		escritor.close();
		try
		{
		lector.close();
		// cierre el socket y la entrada estándar
		stdIn.close();
		socket.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}

}
