package n1exercici3;

public class Generadora {
	
	protected static int i = 0;
	
	protected static String[] characters = {"Jack Skellington", "Sally", "Oogie Boogie", "Doctor Finklestein"
			, "Mayor of Halloween Town", "Lock", "Shock", "Barrel", "Santa Claus", "Zero"};
	
	public static String seguentPersonatge() {
		
		String nombre = characters[i];
		
		i++;
		
		if (i >= characters.length) {//torna la llista al principi si ja la ha recorregut sencera
			i = 0;
		}
		
		return nombre;
		
	}

}
