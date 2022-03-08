package n1exercici8;

public class Avenger {
	
//ATRIBUTS
    	private String name;
    	final int id;
    

//CONSTRUCTOR
    	
    Avenger(String name, int id) {
          
        this.name = name;
        this.id = id;
        
    }
    
//SETTERS Y GETTERS
    
    String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
//METODES
	
    public int hashCode()//EL HASHCODE PASA A SER LA ID
    {
        return this.id;
    }

}

