package n1exercici6;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//CREAMOS LA COLLECTION
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		
		//AÑADIMOS CUATRO DATOS A LA LIST
		
		Collections.addAll(list1, 1,2,3,4);
		
		
		//PRINTAMOS LAS COLLECTIONS
		
		System.out.println("Printamos la lista inicial:");
		
		printList(list1);
		
		
		//Añadimos valores a la mitad de la lista con listIterator
		
		list1.listIterator(list1.size()/2).add(5);
		list1.listIterator(list1.size()/2).add(10);
		
		//PRINTAMOS LAS COLLECTIONS
		
		System.out.println("Printamos la lista:");
				
		printList(list1);
		
		
	}
	
	
	//METODES
	public static void printList(Collection collection) {
		
		Iterator iterator = collection.iterator();
		
		System.out.print("\nImprimim una llista " + collection.getClass()+ " :");
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next().toString() + ", ");
			
			
		}System.out.print("\n");
		
	}
	
	public static LinkedList<Integer> plenarList(int elements){
		
		LinkedList<Integer> personatges = new LinkedList<Integer>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentNumero());
			
		}
		
		return personatges;
		
	}
	

}
