package n3exercici1;


public class Contenidora {
	
	private static String[] frases = new String[1];//CREAMOS EL ARRAY INICIAL CON UN ESPACIO
	

	public Contenidora() {
		
	}

	
	public static String[] getFrases() {
		return frases;
	}

	
	public static void add(String valor) {
		
		int n = frases.length;
		
		if (frases[n-1] != null) {//SI NO HAY SITIO HACEMOS SITIO
			
			
			String newArray[] = new String[n+1];
		
			for (int i = 0; i < n; i++) {
				newArray[i] = frases[i];
			}
  
			newArray[n] = valor;
			
			frases = newArray.clone();
			
			
		} else {//SI HAY SITIO LO GUARDAMOS EN EL SITIO
			
			frases[n-1] = valor;
			
		}
		
	}
	
}
