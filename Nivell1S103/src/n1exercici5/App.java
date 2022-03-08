package n1exercici5;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//CREAMOSS LAS COLLECTIONS
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> listHolder = new ArrayList<Integer>();
		
		//AÑADIMOS CUATRO DATOS A LAS LIST
		
		Collections.addAll(list1, 1,2,3,4);
		
		list2 = plenarArray(4);//introduim cuatre elements en cada llista
		
		//PRINTAMOS LAS COLLECTIONS
		System.out.println("Printamos las listas iniciales:");
		
		printList(list1);
		
		System.out.println(list2.toString());//imprimim de dos formes diferents
		
		
		//METODE 1: Collections.reverse
		listHolder = new ArrayList<Integer>(list1);//un placeholder per a no tenir que recuperar la list1 al seu estat original
		
		Collections.reverse(listHolder);
			
		list2.addAll(listHolder);
		
		
		System.out.println("\nPrintamos las listas con la lista2 modificada:");
		printList(list1);
		printList(list2);
		
		//METODE2: Iterator previousIndex and hasPrevious
		
		for (ListIterator<Integer> it = list1.listIterator(list1.size()); it.hasPrevious(); ) {
			
			Integer t = it.previous();
			
			list2.add(t);
		}
		
		System.out.println("\nPrintamos las listas con la lista2 modificada dos veces:");
		
		printList(list2);
		
		//METODE3: SWAP
		
		Collections.copy(listHolder, list1);//Una forma diferent de fer un placeHolder
		
		int size = listHolder.size();
		
		int b = 0;
		int g = listHolder.size()-1;
		
		while ( g > b) {
			Collections.swap(listHolder, g, b);
			b++;
			g--;
		}
		
		System.out.println("\nPrintamos las listas con la lista2 modificada tres veces:");
		
		list2.addAll(listHolder);
		
		printList(list2);
		
		
	}
	
	//METODES
	public static void printList(Collection collection) {
		
		Iterator iterator = collection.iterator();
		
		System.out.print("\nImprimim una llista " + collection.getClass()+ " :");
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next().toString() + ", ");
			
			
		}System.out.print("\n");
		
	}
	
	public static ArrayList<Integer> plenarArray(int elements){
		
		ArrayList<Integer> personatges = new ArrayList<Integer>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentNumero());
			
		}
		
		return personatges;
		
	}
	

}
