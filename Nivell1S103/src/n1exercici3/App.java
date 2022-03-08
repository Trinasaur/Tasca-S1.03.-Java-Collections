package n1exercici3;

import java.util.*;


public class App {

	public static void main(String[] args) {
		
		//CREAMOSS LAS COLLECTIONS
		ArrayList<String> arrayListPersonatges = plenarArray(15);
		
		HashSet<String> hashSetPersonatges = plenarHashSet(15);
		
		LinkedList<String> linkedListPersonatges = plenarLinkedList(15);
		
		LinkedHashSet<String> linkedHashSetPersonatges = plenarLinkedHashSet(15);
		
		TreeSet<String> treeSetPersonatges = plenarTreeSet(15);
		
		//IMPRIMIMOS LAS COLLECTIONS
		
		System.out.println("Imprimim el ArrayList:");
		
		for(String character : arrayListPersonatges){//Cames out in alphabetical order
            System.out.print(character + ", ");
        }
		
		System.out.println("\nImprimim el HashSet:");
		
		for(String character : hashSetPersonatges){//Cames out in alphabetical order
            System.out.print(character+ ", ");
        } 
		
		System.out.println("\nImprimim el LinkedList:");
		
		for(String character : linkedListPersonatges){//Cames out in alphabetical order
            System.out.print(character+ ", ");
        } 
		
		System.out.println("\nImprimim el LinkedHashSet:");
		
		for(String character : linkedHashSetPersonatges){//Cames out in alphabetical order
            System.out.print(character+ ", ");
        } 
		
		System.out.println("\nImprimim el TreeSet:");
		for(String character : treeSetPersonatges){//Cames out in alphabetical order
            System.out.print(character+ ", ");
        } 
		
	}
	
	//METODES
	
	public static ArrayList<String> plenarArray(int elements){
		
		ArrayList<String> personatges1 = new ArrayList<String>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges1.add(Generadora.seguentPersonatge());	
			
		}
		return personatges1;
	}
	
	public static HashSet<String> plenarHashSet(int elements){
		
		HashSet<String> personatges2 = new HashSet<String>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges2.add(Generadora.seguentPersonatge());	
			
		}
		return personatges2;
	}
	
	public static LinkedList<String> plenarLinkedList(int elements){
		
		LinkedList<String> personatges3 = new LinkedList<String>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges3.add(Generadora.seguentPersonatge());	
			
		}
		return personatges3;
	}
	
	public static LinkedHashSet<String> plenarLinkedHashSet(int elements){
		
		LinkedHashSet<String> personatges4 = new LinkedHashSet<String>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges4.add(Generadora.seguentPersonatge());	
			
		}
		return personatges4;
	}
	
	public static TreeSet<String> plenarTreeSet(int elements){
		
		TreeSet<String> personatges5 = new TreeSet<String>();
		
		
		for (int i = 0; i<elements; i++) {
			
			personatges5.add(Generadora.seguentPersonatge());	
			
		}
		return personatges5;
	}

}
