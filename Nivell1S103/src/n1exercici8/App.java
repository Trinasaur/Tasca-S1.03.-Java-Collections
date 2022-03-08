package n1exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class App {

	public static void main(String[] args) {
		
		//CREEM EL LINKED HASH MAP Y EL PLENEM
		
		LinkedHashMap<String,Avenger> map = new LinkedHashMap<String,Avenger>();
		
		//Creem objecte Avenger fent servir el constructor i l'introduim al linked hash map 3 vegades
		Avenger avenger = new Avenger("Steve Rogers",1);
		
		map.put("Captain America", avenger);
		
		
		avenger = new Avenger("Anthony Edward Stark", 2);
		
		map.put("Iron Man", avenger);
		
		
		avenger = new Avenger("Dr. Robert Bruce Banner", 3);
		
		map.put("Hulk", avenger);
		
		//Printem el mapa abans de ordenar:
		
		for (Entry<String, Avenger> entry : map.entrySet()) {
					
			System.out.printf("LinkedHashMap original : " + entry.getKey() + ": " + entry.getValue().getName()+ "\n");
				    
		}
		
		//ORDENEM PER ORDRE ALFABETIC LES KEYS
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		for (Entry<String, Avenger> entry : map.entrySet()) {
			
		    nombres.add(entry.getKey());
		    
		}
		
		//Sort ordenara las entrades del Arraylist per ordre alphabetic
		Collections.sort(nombres);
		
		//Printem els elements per veure que hara estan en ordre alphabetic
		for (int i = 0; i < nombres.size(); i++) {
			 
	           System.out.println("ArrayList: " + nombres.get(i));
	            
		}
		 
		//TORNEM A INTRODUIR ELS ELEMENTS AL MAP FENT SERVIR EL ARRAY LIST ORDENAT DE GUIA
		 
		LinkedHashMap<String,Avenger> mapTemporal = new LinkedHashMap<String,Avenger>();
		 
		for(int i = 0; i < nombres.size(); i++) {
		 
			mapTemporal.put(nombres.get(i), map.get(nombres.get(i)));
		 
		}
		 
		map = mapTemporal;
		 
		 
		//Printem el mapa hara ja ordenat:
		
		for (Entry<String, Avenger> entry : map.entrySet()) {
			
			System.out.printf("LinkedHashMap ordenat: " + entry.getKey() + ": " + entry.getValue().getName()+ "\n");
		    
		}
		

	}

}
