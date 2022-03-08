package n2exercici1;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		
		Numero numero = new Numero();
		
		//Introduim 100 numeros a la llista queue
		
		Queue<Numero> queue = new PriorityQueue<Numero>();
		
		for (int i = 0; i < 100; i++) {
			
			numero = new Numero();
	        
			queue.add(numero);
	            
		}
		
		//10x10 we extract all numbers from the list, PriorityQueue esta ordenada utilizando un custom compareTo
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				System.out.print(queue.poll().getInteger()+ ",");
			}
			System.out.print("\n");
		}
		
	}

}
