package taller8InfraCompB;

public class Main {

	public static void main(String[] args) {

		CifradoAsimetrico CA = new CifradoAsimetrico();

		byte[] datos1 = CA.cifrar();
		CA.descifrar(datos1);
	}

}
