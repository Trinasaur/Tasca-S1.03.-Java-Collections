package n1exercici4;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//CREAMOSS LAS COLLECTIONS
		ArrayList<Object> arrayListPersonatges = new ArrayList<Object>();
		
		HashSet<Object> hashSetPersonatges = new HashSet<Object>();
				
		LinkedList<Object> linkedListPersonatges = new LinkedList<Object>();
				
		LinkedHashSet<Object> linkedHashSetPersonatges =  new LinkedHashSet<Object>();
				
		TreeSet<Object> treeSetPersonatges = new TreeSet<Object>();
		
		//AÑADIMOS LOS DATOS A LAS COLLECTIONS
		
		Collections.addAll(arrayListPersonatges, "hola");
		
		arrayListPersonatges = plenarArray(15);
		
		hashSetPersonatges = plenarHashSet(15);
		
		linkedListPersonatges = plenarLinkedList(15);
		
		linkedHashSetPersonatges = plenarLinkedHashSet(15);
		
		treeSetPersonatges = plenarTreeSet(15);
		
		//PRINTAMOS LAS COLLECTIONS
		
		printList(arrayListPersonatges);
		
		printList(hashSetPersonatges);
		
		printList(linkedListPersonatges);
		
		printList(linkedHashSetPersonatges);
		
		printList(treeSetPersonatges);
	}
	
	//METODES
	public static void printList(Collection collection) {
		
		Iterator iterator = collection.iterator();
		
		System.out.print("\nImprimim una llista " + collection.getClass()+ " :");
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next().toString() + ", ");
			
			
		}System.out.print("\n");
		
	}
	
	public static ArrayList<Object> plenarArray(int elements){
		
		ArrayList<Object> personatges = new ArrayList<Object>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentObjecte());
			personatges.add(Generadora.seguentObjecte2());
			
		}
		return personatges;
	}
	
	public static HashSet<Object> plenarHashSet(int elements){
		
		HashSet<Object> personatges = new HashSet<Object>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentObjecte());	
			personatges.add(Generadora.seguentObjecte2());
		}
		return personatges;
	}
	
	public static LinkedList<Object> plenarLinkedList(int elements){
		
		LinkedList<Object> personatges = new LinkedList<Object>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentObjecte());	
			personatges.add(Generadora.seguentObjecte2());
		}
		return personatges;
	}
	
	public static LinkedHashSet<Object> plenarLinkedHashSet(int elements){
		
		LinkedHashSet<Object> personatges = new LinkedHashSet<Object>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentObjecte());
			personatges.add(Generadora.seguentObjecte2());
			
		}
		return personatges;
	}
	
	public static TreeSet<Object> plenarTreeSet(int elements){
		
		TreeSet<Object> personatges = new TreeSet<Object>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges.add(Generadora.seguentObjecte());
			//personatges.add(Generadora.seguentObjecte2());
			//TreeSet no pot comparar un integer amb un String per a ordenarlos
		}
		return personatges;
	}

}
