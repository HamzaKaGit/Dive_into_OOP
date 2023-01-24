public class Words 
{ 
	public static void main (String[] args) { 
	Dictionary webster = new Dictionary();
 	System.out.println ("total pages: " + webster.getPages());
 	System.out.println ("total definitions: " + webster.getDefinitions()); 
	System.out.println ("Definitions per page: " + webster.computeRatio()); 

	}
	
 } 