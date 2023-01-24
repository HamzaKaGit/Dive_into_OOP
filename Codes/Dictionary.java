public class Dictionary extends Book 
{
	private int definitions = 52500; 
	public double computeRatio() { 
	return definitions/pages; 
	}
	public void setDefinitions (int numDefinitions) 
	{	
	definitions = numDefinitions; 
	}	 
	public int getDefinitions ()
	{ 
	 
	return definitions; 
	
	}
	
}