package n3exercici2;

public class Numeros {
	
	private static Integer[] nombres = new Integer[1];//CREAMOS EL ARRAY INICIAL CON UN ESPACIO
	

	public Numeros() {
		
	}

	
	public static Integer[] getNombres() {
		return nombres;
	}

	
	public static void add(Integer valor) {
		
		int n = nombres.length;
		
		if (nombres[n-1] != null) {//SI NO HAY SITIO HACEMOS SITIO
			
			
			Integer newArray[] = new Integer[n+1];
		
			for (int i = 0; i < n; i++) {
				newArray[i] = nombres[i];
			}
  
			newArray[n] = valor;
			
			nombres = newArray.clone();
			
			
		} else {//SI HAY SITIO LO GUARDAMOS EN EL SITIO
			
			nombres[n-1] = valor;
			
		}
		
	}
	
}
