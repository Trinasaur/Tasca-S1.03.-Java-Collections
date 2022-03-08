package n1exercici2;

import java.util.ArrayList;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		
	//ATRIBUTS
		
		//LLISTA DE MESOS SENSE AGOST
		String[] mesos = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Septembre", 
				"Octubre", "Novembre", "Desembre"};
		
		Month mes = new Month();
		
	//CODI
		//FEM EL ARRAYLIST SENSE AGOST
		 ArrayList<Month> calendari = plenarArray(mesos);
		
		//ENSEÑEM LA PRIMERA VERSIO DE LA LLISTA
		 enseñarArray(calendari);
		 
		 System.out.println("es la llista incompleta de mesos.");
		
		//CREEM EL Month AMB Agost
		
		mes = new Month("Agost");
		
		//AFEGUIM EL MES AL PUNT DE LA LLISTA QUE PERTOCA
		
		calendari.add(8, mes);
		
		//ENSEÑEN LA LLISTA ACABADA
		
		enseñarArray(calendari);
		System.out.println("es la llista completa de mesos.");
		
		//COMBERTIM EL ARRAYLIST EN UN HASHSET
		
		HashSet<Month> calendari2 = combertirArrayIntoHashSet(calendari);
		
		//COMPROBEM QUE PASA AL INTENTAR AFEGIR UN VALOR REPETIT
		enseñarHashSet(calendari2);
		calendari2.add(mes);
		enseñarHashSet(calendari2);
		calendari2.add(mes);
		enseñarHashSet(calendari2);
		
		System.out.println("Podem veure que el HashSet no afegeix Agost per repetit "
				+ "i tambe que l'ordre ha cambiat completament.");
	}
	
//METODES
	public static ArrayList<Month> plenarArray(String[] mesos){
		
		ArrayList<Month> calendari = new ArrayList<Month>();
		Month mes = new Month();
		
		for (int i = 0; i<mesos.length; i++) {
			mes = new Month(mesos[i]);
			calendari.add(mes);	
			
		}
		return calendari;
	}
	
	public static void enseñarArray(ArrayList<Month> calendari) {
		
		for (Month i : calendari) {
			System.out.print(i.month + ", ");	
			
		}
	}
	
	public static HashSet<Month> combertirArrayIntoHashSet(ArrayList<Month> calendari) {
		
		HashSet<Month> calendari2 = new HashSet<Month>();
		
		for (Month i : calendari) {
			calendari2.add(i);	
			
		}
		
		return calendari2;
	}
	
	public static void enseñarHashSet(HashSet<Month> calendari2) {
		
		for (Month i : calendari2) {
			System.out.print(i.month + ", ");	
			
		} System.out.println("");
	}

}
