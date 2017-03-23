package infraCompTaller7;

import javax.crypto.Cipher;

public class Main {

	public static void main(String[] args) 
	{
		Cifrado c1 = new Cifrado();
		Cifrado c2 = new Cifrado();
		
		byte[] ctxt1 = c1.cifrar();
		byte[] ctxt2 = c2.cifrar();
		
		c1.descifrar(ctxt1);
		c2.descifrar(ctxt2);
	
	}

}
