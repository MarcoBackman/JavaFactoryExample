package condiment;

import beverage.Beverage;

/*
 * Name             : Sung-Jun (Tony) Baek
 * Assignment number: Assignment2 The Decorator Pattern
 */
public class Whip extends CondimentDecorator {
	
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", with Whip";
	}

	public double cost() {
		return 0.20 + beverage.cost();
	}
}
