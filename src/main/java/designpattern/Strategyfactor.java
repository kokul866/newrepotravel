package designpattern;

public class Strategyfactor {
	
	public checkavail strategy(String name) {
		if(name.equalsIgnoreCase("Oneway"))
		{
			return new Oneway();
		}
		if(name.equalsIgnoreCase("Roundtrip"))
		{
			return new Roundtrip();
		}
		
		else {
			return null;
		}
		
		
	}

}
