package assignment2;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class CondimentFactory {
	private static CondimentFactory condimentFactory;
	private String address = "150W University Blvd";

	public static synchronized CondimentFactory getInstnace() {
		if (condimentFactory == null) {
			condimentFactory = new CondimentFactory();
		}
		return condimentFactory;
	}
	
	public String getAddress() {
		return this.address;
	}
	
}
