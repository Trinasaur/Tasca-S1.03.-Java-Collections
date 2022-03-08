package n1exercici4;

public class Generadora {
	
	protected static int i = 0;
	protected static int a = 0;
	
	protected static Object[] numeros = {3, 100, 8, 0, 1};
	
	protected static Object[] nombres = {"Jack", "Sally", "Pau"};
	
	public static Object seguentObjecte() {
		
		Object cosas = numeros[i];
		
		i++;
		
		if (i >= numeros.length) {
			i = 0;
		}
		
		return cosas;
		
	}
	
	public static Object seguentObjecte2() {
		
		Object cosas = nombres[a];
		
		a++;
		
		if (a >= nombres.length) {
			a = 0;
		}
		
		return cosas;
		
	}

}
