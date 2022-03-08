package n3exercici1;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		//CREAMOS EL ARRAY Y EL ARRAYLIST
		String frases[];
		ArrayList<String> palabrasArrayList = new ArrayList<String>();
		
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
		
		long cuatre = System.nanoTime();
		
		//SACAMOS LAS DIFERENCIAS DE TIEMPO
		System.out.println("\n" + uno + "\nTiempo fase uno Contenidora.add con espacio:" + (dos-uno) 
				+ "\nTiempo fase dos Contenidora.add sin espacio:" + (tres-dos)
				+ "\nTiempo fase tres ArrayList.add:" + (cuatre-tres));
		
		
		System.out.println("La fase 1 es la mes lenta, ha de inicialitzar el metode Contenidor."
				+ "\nPodem veure que fer servir un ArrayList.add es mes rapid "
				+ "que el nostre metode Contenidora.add ");
		
	}

}
