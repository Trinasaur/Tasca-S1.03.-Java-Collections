package n1exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<String,Pokemon> pokedex = new HashMap<String,Pokemon>();
		
		//Creem diferents objectes i els introduim en el HashMap
		Pokemon pokeball = new Pokemon("Bulbasaur", 1);//(nom, hashCode)
		
		pokedex.put("1", pokeball);
		
		pokeball = new Pokemon("Squirtle", 2);
		
		pokedex.put("4", pokeball);
		
		pokeball = new Pokemon("Charmander", 3);
		
		pokedex.put("7", pokeball);
		
		//Imprimim els hashCode dels diferents objectes del hashMap
		System.out.println("HashCode de Bulbasaur:" + pokedex.get("1").hashCode());
		
		System.out.println("HashCode de Squirtle:" + pokedex.get("4").hashCode());
		
		System.out.println("HashCode de Charmander:" + pokedex.get("7").hashCode());
		
		//Introduim tots els objectes del hashMap en un TreeMap
		TreeMap<String,Pokemon> tree = new TreeMap<String,Pokemon>();
		
		tree.putAll(pokedex);
		
		//Imprimim tots els elements del treeMap
		for (Entry<String, Pokemon> entry : tree.entrySet()) {
			
		    System.out.printf(entry.getKey() + ":" + entry.getValue().getName()+ "\n");
		    
		}
		
		//CREEM Y PLENEM EL LINKED HASH MAP
		
		LinkedHashMap<String,Pokemon> map = new LinkedHashMap<String,Pokemon>();
		
		for (Entry<String, Pokemon> entry : tree.entrySet()) {
			
		    map.put(entry.getKey(), entry.getValue());
		    
		}
		
		//IMPRIMIM EL LINKED HASH MAP
		
		for (Entry<String, Pokemon> entry : map.entrySet()) {
			
		    System.out.printf("LinkedHashMap :" + entry.getKey() + ":" + entry.getValue().getName()+ "\n");
		    
		}
		
		//CREEM Y PLENEM EL HASH SET
		
		HashSet<String> set = new HashSet<String>();
		
		for (Entry<String, Pokemon> entry : tree.entrySet()) {
			
		    set.add(entry.getKey());
		    
		}
		
		////IMPRIMIM EL EL HASH SET
		
		for (String string : set) {
			
			 System.out.println("HashSet: " + string);
		    
		}
		
		//CREEM Y PLENEM EL LINKED HASH SET
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
				
		for (Entry<String, Pokemon> entry : tree.entrySet()) {
					
			linkedSet.add(entry.getKey());
				    
		}
				
		////IMPRIMIM EL EL HASH SET
			
		for (String string : linkedSet) {
					
			System.out.println("LinkedHashSet: " + string);
				    
		}
		
		
	}

}
