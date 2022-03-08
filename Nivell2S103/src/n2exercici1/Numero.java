package n2exercici1;

import java.util.Random;

public class Numero implements Comparable<Numero>{
	
	private Integer integer;
	
	

	public Numero() {
		
		Random random = new Random();
		integer = random.nextInt(100);
	}

	
	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}


	//Override compareTo, para que la pryoriti queue sepa que tiene que utilizar para decidir el orden
	public int compareTo(Numero other) {
		int a = Integer.compare(this.integer, other.integer);
		return a;
	}
	
	
	
}
