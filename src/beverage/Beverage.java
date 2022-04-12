package beverage;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public abstract class Beverage {
	protected String description = "Unkown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
