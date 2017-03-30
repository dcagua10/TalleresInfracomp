package taller8InfraComp;

public class Main {

	public static void main(String[] args) 
	{
		Digest D = new Digest();
		Digest D2 = new Digest();
		
		byte[] recibido = D.calcular();
		byte[] calculado = D2.calcular();
		
		boolean iguales = D.verificar(recibido, calculado);

		if (iguales == true)
		{
			System.out.println("Los arreglos calculados son iguales");
		}
		else
		{
			System.out.println("Los arreglos calculados son diferentes");
		}
	}

}
