package condiment;

import beverage.Beverage;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class Sprinkle extends CondimentDecorator {

	Beverage beverage;
	
	public Sprinkle(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Sprinkle";
	}

	public double cost() {
		return 0.10 + beverage.cost();
	}
}
