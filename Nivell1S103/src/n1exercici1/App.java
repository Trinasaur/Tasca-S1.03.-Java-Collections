package n1exercici1;

import java.util.ArrayList;

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
			System.out.print(i.name + ", ");	
			
		}
	}

}
