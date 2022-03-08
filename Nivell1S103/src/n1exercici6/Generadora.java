package n1exercici6;

public class Generadora {
	
	protected static int i = 0;
	
	protected static int[] numeros = {3, 100, 8, 0, 1, 2};
	
	
	public static int seguentNumero() {
		
		int cosas = numeros[i];
		
		i++;
		
		if (i > numeros.length) {
			i = 0;
		}
		
		return cosas;
		
	}

}
