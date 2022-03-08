package n1exercici7;

import java.io.*;
import java.util.*;

public class Pokemon {
	
//ATRIBUTS
	    String name;
	    final int id;
	    

//CONSTRUCTOR
	    Pokemon(String name, int id) {
	          
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
