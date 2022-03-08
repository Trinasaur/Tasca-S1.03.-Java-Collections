package n3exercici2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		//CREAMOS EL ARRAY Y EL ARRAYLIST
		String frases[];
		Integer cuentas[];
		ArrayList<String> palabrasArrayList = new ArrayList<String>();
		ArrayList<Integer> numerosArrayList = new ArrayList<Integer>();
		
		//FASE UNO, AÑADIR ALGO EN EL ARRAY CUANDO SI HAY SITIO
		long uno = System.nanoTime();
		
		Contenidora.add("HOLA");
		
		frases = Contenidora.getFrases();
		
		System.out.println("Array:"+ Arrays.toString(frases));
		
		//FASE DOS, AÑADIR ALGO EN EL ARRAY CUANDO NO HAY SITIO
		long dos = System.nanoTime();
		
		Contenidora.add("ADEU");
		
		frases = Contenidora.getFrases();
		
		System.out.println("Array:"+ Arrays.toString(frases));
		
		//FASE TRES, AÑADIR ALGO EN EL ARRAY LIST
		long tres = System.nanoTime();
		
		palabrasArrayList.add("GATS");
		
		System.out.println("ArrayList :" + palabrasArrayList);
		
		//FASE CUATRO, LA FASE UNO CON INTEGERS
		
		long cuatre = System.nanoTime();
		
		Numeros.add(100);
		
		cuentas = Numeros.getNombres();
		
		System.out.println("Array:"+ Arrays.toString(cuentas));
		
		//FASE CINCO, LA FASE DOS CON INTEGERS
		
		long cinc = System.nanoTime();
		
		Numeros.add(200);
		
		cuentas = Numeros.getNombres();
		
		System.out.println("Array:"+ Arrays.toString(cuentas));
		
		//FASE SEIS, LA FASE TRES CON INTEGERS

		long sis = System.nanoTime();
		
		numerosArrayList.add(150);
		
		System.out.println("ArrayList :" + numerosArrayList);
		
		long set = System.nanoTime();
		
		//SACAMOS LAS DIFERENCIAS DE TIEMPO
		System.out.println("\nTiempo fase uno Contenidora.add con espacio: " + (dos-uno) 
				+ "\nTiempo fase dos Contenidora.add sin espacio: " + (tres-dos)
				+ "\nTiempo fase tres ArrayList<String>.add: " + (cuatre-tres)
				+"\nTiempo fase cuatro Numeros.add con espacio: " + (cinc-cuatre) 
				+ "\nTiempo fase cinco Numeros.add sin espacio: " + (sis-cinc)
				+ "\nTiempo fase seis ArrayList<Integer>.add: " + (set-sis));
		
		
	}

}
